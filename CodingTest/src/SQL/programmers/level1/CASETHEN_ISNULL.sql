SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS,
    CASE WHEN FREEZER_YN IS NULL THEN 'N' ELSE FREEZER_YN END -- 해당 값이 NULL 이라면 'N' 으로 표시하도록
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID;