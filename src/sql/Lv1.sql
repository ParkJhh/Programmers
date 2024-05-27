-- 역순 정렬하기
SELECT name, datetime
from animal_ins
order by animal_id desc;

-- 아픈 동물 찾기
SELECT animal_id, name
from animal_ins
where intake_condition='Sick'
order by animal_id;

-- 어린 동물 찾기
SELECT animal_id, name
from animal_ins
where not intake_condition='Aged'
order by animal_id;

-- 동물의 아이디와 이름
SELECT animal_id, name
from animal_ins
order by animal_id;

-- 여러 기준으로 정렬하기
SELECT animal_id, name, datetime
from animal_ins
order by name,datetime desc;

-- 상위 n개 레코드
SELECT name
from animal_ins
where datetime = (select min(datetime)
                  from animal_ins)

-- 이름이 있는 동물의 아이디
SELECT animal_id
from animal_ins
where name is not null
order by animal_id;

-- 강원도에 있는 생산공장 출력하기
SELECT factory_id, factory_name, address
from food_factory
where address like '%강원도%'
order by factory_id;

-- 경기도에 있는 식품공장 출력하기
SELECT warehouse_id, warehouse_name, address, NVL(freezer_yn, 'N')
from food_warehouse
where address like '%경기도%'
order by warehouse_id;

-- 나이 정보가 없는 회원수 구하기
SELECT count(*) as users
from user_info
where age is null;

-- 가장 비싼 상품 구하기
SELECT max(price) MAX_PRICE
from product;

-- 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT dr_name, dr_id, mcdp_cd, TO_CHAR(hire_ymd,'YYYY-MM-DD')
from doctor
where mcdp_cd = 'CS' or mcdp_cd = 'GS'
order by hire_ymd desc ,dr_name;

-- 이름이 없는 동물의 아이디
SELECT animal_id
from animal_ins
where name is null
order by animal_id;

-- 조건에 맞는 회원수 구하기
select count(*) as USERS
from user_info
where joined <= TO_DATE('20211231', 'YYYY-MM-DD')
  and (age>=20 and age<=29)
order by joined;

-- 인기있는 아이스크림
SELECT flavor
from first_half
order by total_order desc, shipment_id asc;

-- 12세 이하인 여자환자 목록 출력하기
SELECT pt_name, pt_no, gend_cd, age ,NVL(TLNO, 'NONE')
from patient
where age <= 12 and gend_cd='W'
order by age desc, pt_name asc;

-- 조건에 맞는 도서리스트 출력하기
SELECT book_id, TO_CHAR(published_date,'YYYY-MM-DD')
from book
where TO_CHAR(PUBLISHED_DATE,'YYYY') = '2021' and category='인문'
order by published_date;

-- 평균 일일 대여 요금 구하기
SELECT ROUND(AVG(DAILY_FEE),0) AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE='SUV';

-- 모든 레코드 조회하기
SELECT animal_id, animal_type, datetime, intake_condition,name,sex_upon_intake
from animal_ins
order by animal_id;

-- 과일로 만든 아이스크림 고르기
SELECT F.FLAVOR
FROM FIRST_HALF F, ICECREAM_INFO I
WHERE F.FLAVOR = I.FLAVOR
  AND F.TOTAL_ORDER > 3000
  AND I.INGREDIENT_TYPE = 'fruit_based'
ORDER BY F.TOTAL_ORDER DESC;

-- 특정 옵션이 포함된 자동차 리스트 고르기
SELECT car_id, car_type, daily_fee, options
from car_rental_company_car
where options like '%네비게이션%'
order by car_id desc;

-- 최댓값 구하기
SELECT datetime
from animal_ins
where datetime = (select max(datetime)
                  from animal_ins);

-- 조건에 부합하는 중고거래 댓글 조회하기
SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS,TO_CHAR(R.CREATED_DATE,'YYYY-MM-DD')
FROM USED_GOODS_BOARD B, USED_GOODS_REPLY R
WHERE B.BOARD_ID = R.BOARD_ID
  AND B.CREATED_DATE BETWEEN TO_DATE('20221001','YYYY-MM-DD') AND TO_DATE('20221031','YYYY-MM-DD')
ORDER BY R.CREATED_DATE ASC, B.TITLE ASC;