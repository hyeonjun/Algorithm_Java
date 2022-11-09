-- TRUNCATE(숫자, 버릴 자릿수): 숫자를 버릴 자릿 수 아래로 버림 => 버릴 자릿수 필수
-- ROUND(숫자, 반올림할 자릿수): 숫자를 반올림할 자릿수+1 자릿수에서 반올림 => 반올림할 자릿수 필수 X
SELECT (
    CASE WHEN PRICE < 10000 THEN 0 ELSE TRUNCATE(PRICE, -4) END
    ) AS PRICE_GROUP, COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP