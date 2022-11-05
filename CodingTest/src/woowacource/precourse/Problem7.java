package woowacource.precourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Problem7 {

  static Map<String, List<String>> friendMap;

  public static void main(String[] args) {
    String user = "mrko";
    List<List<String>> friends = List.of(
        List.of("donut", "andole"),
        List.of("donut", "jun"),
        List.of("donut", "mrko"),
        List.of("shakevan", "andole"),
        List.of("shakevan", "jun"),
        List.of("shakevan", "mrko")
    );
    List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan");

    System.out.println(solution(user, friends, visitors)); // ["andole", "jun", "bedi"]
  }

  public static List<String> solution1(String user, List<List<String>> friends, List<String> visitors) {
    List<String> answer = new ArrayList<>();
    friendMap = new HashMap<>();
    Map<String, Integer> scores = new HashMap<>();

    for (List<String> friend : friends) {
      String a = friend.get(0);
      String b = friend.get(1);
      insertMap(a, b);
      insertMap(b, a);
    }

    Set<String> userFriends = new HashSet<>();
    if (friendMap.containsKey(user)) {
      userFriends = new HashSet<>(friendMap.get(user));
      for (Entry<String, List<String>> entry : friendMap.entrySet()) {
        String name = entry.getKey();
        if (userFriends.contains(name) || user.equals(name)) continue; // 이미 친구 사이인 애면 패스
        int count = 0;
        for (String f : entry.getValue()) {
          if (userFriends.contains(f)) count++;
        }
        scores.put(name, scores.getOrDefault(name, 0) + (count * 10));
      }
    }
    for (String name : visitors) {
      if (userFriends.contains(name) || user.equals(name)) continue;
      scores.put(name, scores.getOrDefault(name, 0) + 1);
    }

    List<Map.Entry<String, Integer>> list = new LinkedList<>(scores.entrySet());
    list.sort((o1, o2) -> {
      if (o1.getValue().equals(o2.getValue())) {
        return o1.getKey().compareTo(o2.getKey());
      }
      return -o1.getValue().compareTo(o2.getValue());
    });

    for (Map.Entry<String, Integer> map : list) {
      answer.add(map.getKey());
    }

    return answer;
  }

  private static void insertMap(String a, String b) {
    List<String> getFriend = friendMap.getOrDefault(a, new ArrayList<>());
    getFriend.add(b);
    friendMap.put(a, getFriend);
  }

  public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
    List<String> answer = Collections.emptyList();
    List<String> friend = new ArrayList<>();
    Map<String, Integer> friendAndScore = new HashMap<>();
    // 해당 사용자의 친구 리스트
    for(List<String> friendSearch : friends) {
      if(friendSearch.get(0).equals(user)){
        friend.add(friendSearch.get(1));
      }
      else if(friendSearch.get(1).equals(user)){
        friend.add(friendSearch.get(0));
      }
    }

    //친구의 친구찾기
    for(List<String> friendSearch : friends) { // friends => [a, b] -> a와 b는 친구
      if (friendSearch.get(0).equals(friend.get(0)) || friendSearch.get(0).equals(friend.get(1))) {
        friendAndScore.put(friendSearch.get(1), 10);
        System.out.println(friendSearch.get(0) + " " + friendAndScore);
      }
      else if(friendSearch.get(1).equals(friend.get(1))) {
        friendAndScore.put(friendSearch.get(0), +10);
      }
      else{
        System.out.println("else");
      }

    }
    return answer;
  }
}
