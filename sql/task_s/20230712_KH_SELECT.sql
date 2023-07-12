--KH_SELECT 연습문제
--연습문제 1번
--JOB 테이블의 모든 정보 조회
--answer
SELECT *
 FROM JOB;
 
--KH_SELECT 연습문제
--연습문제 2번
--JOB 테이블의 직급 이름 조회
--test
SELECT *
 FROM JOB;
--answer
SELECT JOB_NAME
 FROM JOB;
 
--KH_SELECT 연습문제
--연습문제 3번
--DEPARTMENT 테이블의 모든 정보 조회
--answer
SELECT *
 FROM DEPARTMENT;
 
--KH_SELECT 연습문제
--연습문제 4번
--EMPLOYEE테이블의 직원명, 이메일, 전화번호, 고용일 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME, EMAIL, PHONE, TO_CHAR(HIRE_DATE, 'YY/MM/DD')
 FROM EMPLOYEE;
 
--KH_SELECT 연습문제
--연습문제 5번
--EMPLOYEE테이블의 고용일, 사원 이름, 월급 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT TO_CHAR(HIRE_DATE, 'YY/MM/DD'),EMP_NAME,SALARY
 FROM EMPLOYEE;

--KH_SELECT 연습문제
--연습문제 6번
--EMPLOYEE테이블의 이름, 연봉, 총수령액(보너스포함), 실수령액(총수령액 - (연봉*세금 3%)) 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME,SALARY*12,(SALARY*(1+NVL(BONUS, 0))*12),SALARY*(1+NVL(BONUS, 0))*12-SALARY*12*0.03
 FROM EMPLOYEE;
 
--KH_SELECT 연습문제
--연습문제 7번
--EMPLOYEE테이블에서 SAL_LEVEL이 S1인 사원의 이름, 월급, 고용일, 연락처 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME, SALARY, TO_CHAR(HIRE_DATE, 'YY/MM/DD'),PHONE
 FROM EMPLOYEE
 WHERE SAL_LEVEL='S1';
 
--KH_SELECT 연습문제
--연습문제 8번
--EMPLOYEE테이블에서 실수령액(6번 참고)이 5천만원 이상인 사원의 이름, 월급, 실수령액, 고용일 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME, SALARY, SALARY*(1+NVL(BONUS, 0))*12-SALARY*12*0.03,TO_CHAR(HIRE_DATE, 'YY/MM/DD')
 FROM EMPLOYEE
 WHERE (SALARY*(1+NVL(BONUS, 0))*12-SALARY*12*0.03) >= 50000000;

--KH_SELECT 연습문제
--연습문제 9번
--EMPLOYEE테이블에 월급이 4000000이상이고 JOB_CODE가 J2인 사원의 전체 내용 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT *
 FROM EMPLOYEE
 WHERE SALARY >= 4000000 AND JOB_CODE = 'J2';
 
--KH_SELECT 연습문제
--연습문제 10번
--EMPLOYEE테이블에 DEPT_CODE가 D9이거나 D5인 사원 중
--고용일이 02년 1월 1일보다 빠른 사원의 이름, 부서코드, 고용일 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME,DEPT_CODE,TO_CHAR(HIRE_DATE, 'YY/MM/DD')
 FROM EMPLOYEE
 WHERE DEPT_CODE IN ('D9','D5') AND TO_DATE('20020101', 'YY/MM/DD') > HIRE_DATE;
 
--KH_SELECT 연습문제
--연습문제 11번
--EMPLOYEE테이블에 고용일이 90/01/01 ~ 01/01/01인 사원의 전체 내용을 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT *
 FROM EMPLOYEE
 WHERE TO_DATE('19900101', 'YY/MM/DD') <= HIRE_DATE AND HIRE_DATE <= TO_DATE('20010101', 'YY/MM/DD');
 
--KH_SELECT 연습문제
--연습문제 12번
--EMPLOYEE테이블에서 이름 끝이 '연'으로 끝나는 사원의 이름 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME
 FROM EMPLOYEE
 WHERE EMP_NAME LIKE '%연';
 
--KH_SELECT 연습문제
--연습문제 13번
--EMPLOYEE테이블에서 전화번호 처음 3자리가 010이 아닌 사원의 이름, 전화번호를 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME, PHONE
 FROM EMPLOYEE
 WHERE SUBSTR(PHONE,1,3) != '010';
 
--KH_SELECT 연습문제
--연습문제 14번
--EMPLOYEE테이블에서 메일주소 '_'의 앞이 4자이면서 DEPT_CODE가 D9 또는 D6이고
--고용일이 90/01/01 ~ 00/12/01이고, 급여가 270만 이상인 사원의 전체를 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT *
 FROM EMPLOYEE
 WHERE  EMAIL LIKE '____#_%' ESCAPE '#'
        AND DEPT_CODE IN ('D9', 'D6')
        AND TO_DATE('19900101', 'YY/MM/DD') <= HIRE_DATE
        AND HIRE_DATE <= TO_DATE('20000101', 'YY/MM/DD')
        AND SALARY >= 2700000;
        
--KH_SELECT 연습문제
--연습문제 15번
--EMPLOYEE테이블에서 사원 명과 직원의 주민번호를 이용하여 생년, 생월, 생일 조회
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME, SUBSTR(EMP_NO,1,2),SUBSTR(EMP_NO,3,2),SUBSTR(EMP_NO,5,2)
 FROM EMPLOYEE;
 
--KH_SELECT 연습문제
--연습문제 16번
--EMPLOYEE테이블에서 사원명, 주민번호 조회 (단, 주민번호는 생년월일만 보이게 하고, '-'다음 값은 '*'로 바꾸기)
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT EMP_NAME, REPLACE(EMP_NO,SUBSTR(EMP_NO,8,7),'*******')
 FROM EMPLOYEE;
 
--KH_SELECT 연습문제
--연습문제 17번
--EMPLOYEE테이블에서 사원명, 입사일-오늘, 오늘-입사일 조회
--(단, 각 별칭은 근무일수1, 근무일수2가 되도록 하고 모두 정수(내림), 양수가 되도록 처리)
--test
SELECT *
 FROM EMPLOYEE;
--answer
SELECT 