--중복 제거하기
--https://programmers.co.kr/learn/courses/30/lessons/59408

--SELECT DISTINCT NAME AS NAME FROM ANIMAL_INS

SELECT
SUM(CASE ANI.NAME
        WHEN NULL
        THEN 0 
        ELSE 1
    END     
)    AS COUNT
FROM (SELECT DISTINCT NAME AS NAME FROM ANIMAL_INS ) ANI

-- 맞은것 같은데 오답으로 처리된다... 테이블 데이터가 바뀌었나? 틀린건가..?
