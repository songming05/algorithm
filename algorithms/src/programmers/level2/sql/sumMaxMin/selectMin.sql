--최솟값 구하기
-- https://programmers.co.kr/learn/courses/30/lessons/59038?language=oracle

SELECT
    DATETIME AS 시간
FROM ANIMAL_INS 
WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS )


--(SELECT MIN(DATETIME) FROM ANIMAL_INS )