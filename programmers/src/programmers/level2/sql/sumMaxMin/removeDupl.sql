--�ߺ� �����ϱ�
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

-- ������ ������ �������� ó���ȴ�... ���̺� �����Ͱ� �ٲ����? Ʋ���ǰ�..?
