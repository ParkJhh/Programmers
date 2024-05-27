
-- 보호소에서 중성화한 동물
SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
FROM ANIMAL_INS I , ANIMAL_OUTS O
WHERE I.ANIMAL_ID = O.ANIMAL_ID
  AND I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
ORDER BY I.ANIMAL_ID;

-- 식품분류별 가장 비싼 식품의 정보 조회하기
select category, price as MAX_PRICE, product_name
from food_product
where  (category, price) IN (select category,max(price)
                             from food_product
                             where CATEGORY IN ('과자','국','김치','식용유')
                             group by category)
order by price desc;

-- 5월 식품들의 총매출 조회하기
SELECT P.PRODUCT_ID, P.PRODUCT_NAME, SUM(P.PRICE * AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT P, FOOD_ORDER O
WHERE P.PRODUCT_ID = O.PRODUCT_ID
  AND TO_CHAR(O.PRODUCE_DATE,'YYYY-MM')= '2022-05'
GROUP BY P.PRODUCT_ID, P.PRODUCT_NAME
ORDER BY TOTAL_SALES DESC, P.PRODUCT_ID ASC;

-- 취소되지 않은 진료 예약 조회하기
SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, D.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM PATIENT P , DOCTOR D, APPOINTMENT A
WHERE P.PT_NO = A.PT_NO AND D.DR_ID = A.MDDR_ID
  AND A.APNT_CNCL_YN = 'N'
  AND D.MCDP_CD = 'CS'
  AND TO_CHAR(A.APNT_YMD,'YYYY-MM-DD') ='2022-04-13'
ORDER BY A.APNT_YMD ASC;

-- 서울에 위치한 식당 목록 출력하기
SELECT I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS,
       ROUND(AVG(R.REVIEW_SCORE),2) SCORE
FROM REST_INFO I, REST_REVIEW R
WHERE I.REST_ID = R.REST_ID
  AND ADDRESS LIKE '서울%'
GROUP BY I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS
ORDER BY SCORE DESC , I.FAVORITES DESC;

-- 년, 월, 성별 별 상품 구매 회원 수 구하기
SELECT TO_CHAR(S.SALES_DATE,'YYYY') AS "YEAR",
       TO_NUMBER(TO_CHAR(S.SALES_DATE,'MM')) AS "MONTH",
       I.GENDER,
       COUNT(distinct i.user_id) AS "USERS"
FROM USER_INFO I,ONLINE_SALE S
WHERE I.USER_ID = S.USER_ID
  AND (I.GENDER='0' OR I.GENDER='1')
GROUP BY TO_CHAR(S.SALES_DATE,'YYYY'),TO_NUMBER(TO_CHAR(S.SALES_DATE,'MM')),I.GENDER
ORDER BY YEAR,MONTH,GENDER;

-- 저자 별 카테고리 별 매출액 집계하기
SELECT A.AUTHOR_ID,A.AUTHOR_NAME, B.CATEGORY, SUM(S.SALES * B.PRICE) AS "TOTAL_SALES"
FROM BOOK B, AUTHOR A, BOOK_SALES S
WHERE (B.BOOK_ID = S.BOOK_ID AND B.AUTHOR_ID = A.AUTHOR_ID)
  AND TO_CHAR(S.SALES_DATE,'YYYY-MM') = '2022-01'
GROUP BY A.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY
ORDER BY A.AUTHOR_ID ASC, B.CATEGORY DESC;