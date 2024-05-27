
-- 최솟값 구하기
SELECT datetime
from animal_ins
where datetime = (select min(datetime)
                  from animal_ins);

-- 동명 동물 수 찾기
SELECT name, count(*) as count
from animal_ins
group by name
HAVING COUNT(name) > 1
order by name;

-- 이름에 el이 들어가는 동물 찾기
SELECT animal_id, name
from animal_ins
where LOWER(name) like '%el%'
  and animal_type='Dog'
order by name;

-- 동물 수 구하기
SELECT count(*) as count
from animal_ins
where name is null;

-- 중복 제거하기
select count(distinct name)
from animal_ins;

-- 가격이 제일 비싼 식품의 정보 출력하기
SELECT product_id, product_name, product_cd, category ,price
from food_product
where price = (select max(price)
               from food_product)
order by price;

-- NULL 처리하기
SELECT animal_type, NVL(name, 'No name') , sex_upon_intake
from animal_ins
order by animal_id;

-- DATETIME에서 DATE로 형 변환
SELECT animal_id, name, TO_CHAR(datetime, 'YYYY-MM-DD')
from animal_ins
order by animal_id;

-- 카테고리 별 상품 개수 구하기
SELECT substr(product_code,0,2) CATEGORY, count(product_code) PRODUCTS
FROM PRODUCT
GROUP BY substr(product_code,0,2)
ORDER BY substr(product_code,0,2);

-- 고양이와 개는 몇마리 있을까?
select animal_type, COUNT(*) as count
from animal_ins
group by animal_type
order by animal_type;

-- 중성화 여부 파악하기
SELECT animal_id, name,
       CASE
           WHEN sex_upon_intake like 'Neutered%'
               OR sex_upon_intake like 'Spayed%' then 'O'
           ELSE 'X'
           END as "중성화"
from animal_ins
order by animal_id;

-- 진료과별 총 예약 횟수 출력하기
SELECT MCDP_CD "진료과 코드" , COUNT(MCDP_CD) "5월예약건수"
FROM APPOINTMENT
where TO_CHAR(APNT_YMD,'YYYY-MM') = '2022-05'
group by MCDP_CD
order by "5월예약건수",MCDP_CD;

-- 입양 시각 구하기(1)
SELECT TO_NUMBER(TO_CHAR(datetime,'HH24')) HOUR, count(*) COUNT
FROM animal_outs
where to_char(datetime,'HH24') BETWEEN '09' and '19'
group by to_char(datetime,'HH24')
ORDER BY HOUR;

-- 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
SELECT CAR_TYPE, COUNT(CAR_TYPE)
FROM CAR_RENTAL_COMPANY_CAR
WHERE (OPTIONS LIKE '%통풍시트%' OR
       OPTIONS LIKE '%열선시트%' OR
       OPTIONS LIKE '%가죽시트%')
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE;

-- 조건에 맞는 도서와 저자 리스트 출력하기
SELECT b.book_id, a.author_name, to_char(b.published_date,'YYYY-MM-DD')
from book b, author a
where b.category='경제'
  and b.author_id = a.author_id
order by published_date

-- 상품 별 오프라인 매출 구하기
SELECT P.PRODUCT_CODE, SUM(P.PRICE * S.SALES_AMOUNT) AS "매출액"
FROM PRODUCT P, OFFLINE_SALE S
WHERE P.PRODUCT_ID = S.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY "매출액" DESC , P.PRODUCT_CODE;

-- 성분으로 구분한 아이스크림 총 주문량
SELECT I.INGREDIENT_TYPE , SUM(F.TOTAL_ORDER) AS "TOTAL_ORDER"
FROM FIRST_HALF F, ICECREAM_INFO I
WHERE F.FLAVOR = I.FLAVOR
GROUP BY I.INGREDIENT_TYPE;

-- 루시와 엘라 찾기
SELECT animal_id, name, sex_upon_intake
from animal_ins
where name in('Ella' ,'Lucy' ,'Pickle' ,'Rogan','Sabrina' ,'Mitty')
order by animal_id;

-- 3월에 태어난 여성 회원 목록 출력하기
SELECT member_id, member_name, gender, TO_CHAR(date_of_birth,'YYYY-MM-DD')
from member_profile
where tlno is not null
  and gender ='W'
  and to_char(date_of_birth,'MM') = '03'
order by member_id;

-- 재구매가 일어난 상품과 회원 리스트 구하기
SELECT USER_ID , PRODUCT_ID
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(*) > 1
ORDER BY USER_ID, PRODUCT_ID DESC;

-- 조건에 부합하는 중고거래 상태 조회하기
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE,
       CASE WHEN STATUS LIKE '%DONE%' THEN '거래완료'
            WHEN STATUS LIKE '%RESERVED%' THEN '예약중'
            WHEN STATUS LIKE '%SALE%' THEN '판매중'
           END "STATUS"
FROM USED_GOODS_BOARD
WHERE TO_CHAR(CREATED_DATE,'YYYY-MM-DD') = '2022-10-05'
ORDER BY BOARD_ID DESC;