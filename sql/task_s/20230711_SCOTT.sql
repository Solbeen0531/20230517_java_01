--SCOTT 연습문제
--연습문제 1번
--EMP테이블에서 COMM의 값이 NULL이 아닌 정보 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 WHERE COMM IS NOT NULL;
 
--SCOTT 연습문제
--연습문제 2번
--EMP테이블에서 커미션을 받지 못하는 직원 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 WHERE COMM < 1 OR COMM IS NULL;
 
--SCOTT 연습문제
--연습문제 3번
--EMP테이블에서 관리자가 없는 직원 정보 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 WHERE MGR IS NULL;
 
--SCOTT 연습문제
--연습문제 4번
--EMP테이블에서 관리자가 없는 직원 정보 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 ORDER BY SAL DESC;
 
--SCOTT 연습문제
--연습문제 5번
--EMP테이블에서 급여가 같을 경우 커미션을 내림차순 정렬 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 ORDER BY SAL DESC, COMM DESC;
 
--SCOTT 연습문제
--연습문제 6번
--EMP테이블에서 사원번호, 사원명, 직급, 입사일 조회
--(단, 입사일을 오름차순 정렬 처리)
--test
SELECT *
 FROM EMP;
--answer
SELECT EMPNO, ENAME, JOB, HIREDATE
 FROM EMP
 ORDER BY HIREDATE ASC;

--SCOTT 연습문제
--연습문제 7번
--EMP테이블에서 사원번호, 사원명, 조회
--(사원번호 기준 내림차순 정렬)
--test
SELECT *
 FROM EMP;
--answer
SELECT EMPNO, ENAME
 FROM EMP
 ORDER BY EMPNO DESC;
 
--SCOTT 연습문제
--연습문제 8번
--EMP테이블에서 사번, 입사일, 사원명, 급여 조회
--(부서번호가 빠른 순으로, 같은 부서번호일 때는 최근 입사일 순으로 처리)
--test
SELECT *
 FROM EMP;
--answer
SELECT EMPNO, DEPTNO, HIREDATE, JOB, SAL
 FROM EMP
 ORDER BY DEPTNO ASC, HIREDATE DESC;

