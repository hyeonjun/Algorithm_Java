-- DATEDIFF(): 두 기간 사이의 일수 계산
SELECT DATEDIFF('2021-12-31','2021-01-20'); -- 345
SELECT DATEDIFF('2021-12-31','2022-01-20'); -- -20
-- 날짜 포맷에 시간이 포함되어 있는 경우 시간은 계산에 포함하지 않음
SELECT DATEDIFF('2021-12-31 11:11:00','2021-01-20 13:00:00'); -- 345
-- 날짜 범위에서 벗어난 값을 입력할 경우 NULL 반환
SELECT DATEDIFF('2021-12-31','2021-13-20'); -- NULL


-- TIMEDIFF(): 두 기간 사이의 시간 계산
SELECT TIMEDIFF('2022-02-01 23:00:00','2022-01-30 00:00:00'); -- 71:00:00
SELECT TIMEDIFF('2021-12-31 23:00:00','2022-01-01 00:00:00.000000'); -- -01:00:00.000000
SELECT TIMEDIFF('11:30:00','00:00:00'); -- 11:30:00
SELECT TIMEDIFF('2022-01-02 00:00:00','2022-13-02 00:00:00'); -- NULL

-- PERIOD_DIFF(): 두 기간 사이의 개월 수 계산
SELECT PERIOD_DIFF('202202','202112'); -- 2
SELECT PERIOD_DIFF('202202','201212'); -- -10
SELECT PERIOD_DIFF('2202','1912'); -- 26
-- 이상한 값을 설정한 경우에 NULL이 아닌 의도치 않은 결과값을 반환함
SELECT PERIOD_DIFF('202212','20a214'); -- 256

-- TIMESTAMPDIFF(): 두 기간 사이의 시간 계산 // TIMESTAMPDIFF(unit, datetime_expr1, datetime_expr2)
SELECT TIMESTAMPDIFF(MONTH,'2021-02-01','2022-03-01'); -- 13
SELECT TIMESTAMPDIFF(YEAR,'2021-02-01','2022-03-01'); --  1
SELECT TIMESTAMPDIFF(HOUR,'2022-02-01','2022-02-03'); -- 48
-- TIMESTAMPDIFF 파라미터 종류
-- FRAC_SECOND(MICROSECOND): 마이크로 초
-- SECOND: 초
-- MINUTE: 분
-- HOUR: 시간
-- DAY: 일
-- WEEK: 주
-- MONTH: 월
-- QUARTER: 분기
-- YEAR: 년