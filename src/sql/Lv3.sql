
-- 카테고리 별 도서 판매량 집계하기
SELECT B.CATEGORY, SUM(S.SALES) AS "총 판매량"
FROM BOOK B, BOOK_SALES S
WHERE B.BOOK_ID = S.BOOK_ID
  AND TO_CHAR(S.SALES_DATE,'YYYY-MM') = '2022-01'
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY

-- 있었는데요 없었습니다
SELECT I.ANIMAL_ID, I.NAME
FROM ANIMAL_INS I, ANIMAL_OUTS S
WHERE I.ANIMAL_ID = S.ANIMAL_ID
  AND I.DATETIME > S.DATETIME
ORDER BY I.DATETIME;

-- 오랜 기간 보호한 동물(1)
SELECT I.NAME, I.DATETIME
FROM ANIMAL_INS I left outer join ANIMAL_OUTS S ON I.ANIMAL_ID=S.ANIMAL_ID
WHERE S.ANIMAL_ID IS NULL
ORDER BY I.DATETIME
    -- 처음3행 검색
    FETCH NEXT 3 ROWS ONLY;

-- 오랜 기간 보호한 동물(2)
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O LEFT OUTER JOIN ANIMAL_INS I ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE TO_CHAR(O.DATETIME - I.DATETIME) > 0
    -- TO_NUMBER가 아닐 경우, 다른 데이터가 우선함
    ORDER BY TO_NUMBER(TO_CHAR(O.DATETIME - I.DATETIME)) DESC
    FETCH NEXT 2 ROWS ONLY;

-- 조건별로 분류하여 주문상태 출력하기
SELECT ORDER_ID,PRODUCT_ID,TO_CHAR(OUT_DATE,'YYYY-MM-DD'),
       CASE WHEN OUT_DATE <= TO_DATE('20220501','YYYY-MM-DD') THEN '출고완료'
            WHEN OUT_DATE > TO_DATE('20220501','YYYY-MM-DD') THEN '출고대기'
            ELSE '출고미정'
           END AS "출고여부"
FROM FOOD_ORDER
ORDER BY ORDER_ID ASC;

-- 대여 기록이 존재하는 자동차 리스트 구하기
SELECT DISTINCT R.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR R, CAR_RENTAL_COMPANY_RENTAL_HISTORY H
WHERE R.CAR_ID=H.CAR_ID
  AND R.CAR_TYPE='세단'
  AND TO_CHAR(H.START_DATE,'YYYY-MM') = '2022-10'
ORDER BY R.CAR_ID DESC;

-- 조건에 맞는 사용자와 총 거래금액 조회하기
SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE)  AS "TOTAL_SALES"
FROM USED_GOODS_BOARD B, USED_GOODS_USER U
WHERE B.WRITER_ID = U.USER_ID
  AND B.STATUS = 'DONE'
GROUP BY U.USER_ID,U.NICKNAME
HAVING SUM(B.PRICE) >=700000
ORDER BY "TOTAL_SALES";

-- 즐겨찾기가 가장 많은 식당 정보 출력하기
select food_type, rest_id, rest_name,favorites
from rest_info
where (food_type,favorites) in (select distinct food_type, max(favorites)
                                from rest_info
                                group by food_type)
order by food_type desc;

-- 없어진 기록 찾기
SELECT O.ANIMAL_ID, O.NAME
FROM ANIMAL_OUTS O LEFT OUTER JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY O.ANIMAL_ID;

-- 조건에 맞는 사용자 정보 조회하기
SELECT u.user_id,u.nickname, u.city|| ' ' ||u.street_address1|| ' ' ||u.street_address2 as "전체주소",
       substr(tlno,1,3) || '-' || substr(tlno,4,4) || '-' || substr(tlno,8) as "전화번호"
from used_goods_board b, used_goods_user u
where b.writer_id = u.user_id
group by u.user_id,u.nickname,u.city|| ' ' ||u.street_address1|| ' ' ||u.street_address2,tlno
having count(b.writer_id) > 2
order by u.user_id desc ;

-- 조회수가 가장 많은 중고거래 게시판의 첨부파일 조회하기
SELECT '/home/grep/src/' || F.BOARD_ID || '/' || F.FILE_ID || F.FILE_NAME || F.FILE_EXT AS "FILE_PATH"
FROM USED_GOODS_BOARD B, USED_GOODS_FILE F
WHERE B.BOARD_ID = F.BOARD_ID
  AND B.VIEWS = (select max(views)
                 from used_goods_board)
GROUP BY '/home/grep/src/' || F.BOARD_ID || '/' || F.FILE_ID || F.FILE_NAME || F.FILE_EXT
ORDER BY FILE_PATH DESC;

-- 헤비 유저가 소유한 장소
SELECT ID, NAME, HOST_ID
FROM PLACES
WHERE HOST_ID IN (SELECT HOST_ID
                  FROM PLACES
                  GROUP BY HOST_ID
                  HAVING COUNT(HOST_ID) > 1)
ORDER BY ID;