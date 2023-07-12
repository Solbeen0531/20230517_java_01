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
SELECT EMPNO, HIREDATE, ENAME, SAL
 FROM EMP
 ORDER BY DEPTNO ASC, HIREDATE DESC;

--SCOTT 연습문제
--연습문제 9번
--오늘 날짜에 대한 정보 조회
--answer
SELECT SYSDATE
 FROM DUAL;
 
--SCOTT 연습문제
--연습문제 10번
--EMP테이블에서 사번, 사원명, 급여 조회
--(단, 급여는 100단위까지의 값만 출력 처리하고 급여 기준 내림차순 정렬)
--test
SELECT *
 FROM EMP;
--answer
SELECT EMPNO, ENAME, ROUND(SAL,-2)
 FROM EMP
 ORDER BY SAL DESC;
 
--SCOTT 연습문제
--연습문제 11번
--EMP테이블에서 사원번호가 홀수인 사원들을 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 WHERE MOD(EMPNO,2) = 1;
 
--SCOTT 연습문제
--연습문제 12번
--EMP테이블에서 사원명, 입사일 조회
--(단, 입사일은 년도와 월을 분리 추출해서 출력)
--test
SELECT *
 FROM EMP;
--answer
SELECT ENAME, EXTRACT(YEAR FROM HIREDATE), EXTRACT(MONTH FROM HIREDATE)
 FROM EMP;
 
--SCOTT 연습문제
--연습문제 13번
--EMP테이블에서 9월에 입사한 직원의 정보 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 WHERE EXTRACT(MONTH FROM HIREDATE) = 9;
 
--SCOTT 연습문제
--연습문제 14번
--EMP테이블에서 81년도에 입사한 직원 조회
--test
SELECT *
 FROM EMP;
--answer
--81만 써서 풀 수 있으면 좋을텐데 아쉽다
SELECT *
 FROM EMP
 WHERE EXTRACT(YEAR FROM HIREDATE) = 1981;
 
--SCOTT 연습문제
--연습문제 15번
--EMP테이블에서 이름이 'E'로 끝나는 직원 조회
--test
SELECT *
 FROM EMP;
--answer
SELECT *
 FROM EMP
 WHERE ENAME LIKE '%E';
 
--SCOTT 연습문제
--연습문제 16번
--EMP테이블에서 이름의 세 번째 글자가 'R'인 직원의 정보 조회
--LIKE 사용, SUBSTR()함수 사용
--test
SELECT *
 FROM EMP;
--answer(LIKE)
SELECT *
 FROM EMP
 WHERE ENAME LIKE '__R%';
--answer(SUBSTR())
SELECT *
 FROM EMP
 WHERE SUBSTR(ENAME,3,1) = 'R';
 
--SCOTT 연습문제
--연습문제 17번
--EMP테이블에서 사번, 사원명, 입사일, 입사일로부터 40년 되는 날짜 조회
--test
SELECT *
 FROM EMP;
--answer/40*12개월=480개월
SELECT EMPNO, ENAME, HIREDATE, ADD_MONTHS(HIREDATE,480)
 FROM EMP;
 
--SCOTT 연습문제
--연습문제 18번
--EMP테이블에서 입사일로부터 38년 이상 근무한 직원의 정보 조회
--test
SELECT *
 FROM EMP;
--answer/38*12개월=456개월
SELECT *
 FROM EMP
 WHERE SYSDATE >= ADD_MONTHS(HIREDATE,456);
 
--SCOTT 연습문제
--연습문제 19번
--오늘 날짜에서 년도만 추출
--answer
SELECT EXTRACT(YEAR FROM SYSDATE)
 FROM DUAL;