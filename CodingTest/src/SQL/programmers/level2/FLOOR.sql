-- FLOOR: 소수점 첫째 자리에서 버림하는 함수
SELECT FLOOR(PRICE / 10000) * 10000 AS PRICE_GROUP,
    COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP