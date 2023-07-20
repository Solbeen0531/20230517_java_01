--KH_SELECT 연습문제
--연습문제 1번
--EMP 테이블과 SALGRADE 테이블 사용하여 보기와 같이 출력
--EMPNO ENAME JOB MGR HIREDATE SAL COMM DEPTNO GRADE
--정렬은 오름차순 GRADE, 오름차순 EMPNO로 함
--test
SELECT * FROM EMP;
SELECT * FROM SALGRADE;
--answer 
SELECT E.*,GRADE
 FROM EMP E
  JOIN SALGRADE SG ON E.SAL > SG.LOSAL 
   AND E.SAL < SG.HISAL
 ORDER BY GRADE, EMPNO;

SELECT EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO,GRADE
 FROM EMP E
  JOIN SALGRADE SG ON SG.LOSAL <= E.SAL
   AND E.SAL <= SG.HISAL
 ORDER BY GRADE ASC, EMPNO ASC;
 
--KH_SELECT 연습문제
--연습문제 2번 // 아직 못함
--test
SELECT * FROM EMP;
SELECT * FROM SALGRADE;
--answer
SELECT E.*,GRADE
 FROM EMP E
  JOIN SALGRADE SG ON SG.LOSAL <= E.SAL
   AND E.SAL <= SG.HISAL
 WHERE DEPTNO != 10
 ORDER BY GRADE DESC, ENAME DESC;
 
--KH_SELECT 연습문제
--연습문제 3번 
--DEPTNO가 20,30인 부서 사람들의 등급별 평균연봉
--조건 :
--1. DEPTNO가 20,30인 부서 사람들의 평균연봉을 계산하도록 한다.
--2. 연봉 계산은 SAL*12+COMM
--3. 순서는 평균연봉이 내림차순으로 정렬한다.
--test
SELECT * FROM EMP;
SELECT * FROM SALGRADE;
--answer
SELECT GRADE, AVG(SAL*12+NVL(COMM,0)) AS "평균연봉"
 FROM EMP E
  JOIN SALGRADE SG ON SG.LOSAL <= E.SAL
   AND E.SAL <= SG.HISAL
 WHERE DEPTNO IN (20,30)
 GROUP BY GRADE
 ORDER BY AVG(SAL*12+NVL(COMM,0)) DESC;
 
--KH_SELECT 연습문제
--연습문제 4번 
--조건 :
--1. DEPTNO가 20,30인 부서 사람들의 평균연봉을 조회
--2. 연봉 계산은 SAL*12+COMM
--3. 순서는 평균연봉이 내림차순으로
--test
SELECT * FROM EMP;
SELECT * FROM SALGRADE;
--answer
SELECT DEPTNO, FLOOR(AVG(SAL*12+NVL(COMM,0))) AS "평균연봉"
 FROM EMP E
  JOIN SALGRADE SG ON SG.LOSAL <= E.SAL
   AND E.SAL <= SG.HISAL
 WHERE DEPTNO IN (20,30) 
 GROUP BY DEPTNO
 ORDER BY "평균연봉" DESC;
 
--KH_SELECT 연습문제
--연습문제 5번 
--사원의 MGR의 이름을 아래와 같이 Manager컬럼에 조회 - 정렬
--test
SELECT * FROM EMP;
--answer
SELECT E.EMPNO, E.ENAME, E.JOB,E.MGR,E2.ENAME AS MANAGER
 FROM EMP E
  JOIN EMP E2 ON E2.EMPNO = E.MGR
 ORDER BY EMPNO ASC;
 
--KH_SELECT 연습문제
--연습문제 6번 
--사원의 MGR의 이름을 아래와 같이 Manager컬럼에 조회 - 정렬
--단, Select 절에 SubQuery를 이용하여 풀이
SELECT * FROM EMP;
--answer
SELECT  EMPNO,ENAME,JOB,MGR,
        (SELECT ENAME
         FROM EMP
         WHERE E.MGR = EMPNO ) AS MANAGER
 FROM EMP E
 ORDER BY MGR ASC;
 
--KH_SELECT 연습문제
--연습문제 7번 
--MARTIN의 월급보다 많으면서 ALLEN과 같은 부서이거나 20번부서인 사원 조회
SELECT * FROM EMP;
--answer
SELECT * FROM EMP WHERE SAL > 
  (SELECT SAL FROM EMP WHERE ENAME = 'MARTIN') 
  AND (DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'ALLEN')
  OR DEPTNO = 20)
  ORDER BY EMPNO;

--KH_SELECT 연습문제
--연습문제 8번 // 아직 못함
--‘RESEARCH’부서의 사원 이름과 매니저 이름을 나타내시오.
SELECT * FROM EMP;
SELECT * FROM DEPT;
--answer
SELECT ENAME,(SELECT ENAME FROM EMP WHERE E.MGR = EMPNO ) AS MANAGER
 FROM EMP E
  JOIN DEPT USING(DEPTNO)
 WHERE DEPTNO = (SELECT DEPTNO FROM DEPT WHERE DNAME = 'RESEARCH')
 ORDER BY SAL DESC,ENAME ASC;

--KH_SELECT 연습문제
--연습문제 9번 
--GRADE별로 급여을 가장 작은 사원명을 조회
SELECT * FROM EMP;
SELECT * FROM SALGRADE;
--answer
SELECT GRADE,(SELECT ENAME FROM EMP WHERE E.SAL = MIN(E.SAL)) AS "등급별가장작은급여"
 FROM EMP E
  JOIN SALGRADE SG ON SG.LOSAL <= E.SAL
   AND E.SAL <= SG.HISAL
  group by GRADE
 ;
 
SELECT SG.GRADE,ENAME AS "등급별가장작은급여"
 FROM EMP E
  JOIN SALGRADE SG ON SG.LOSAL <= E.SAL
   AND E.SAL <= SG.HISAL
  WHERE E.ENAME = (SELECT E.ENAME FROM EMP WHERE SAL = MIN(SAL))
 ;