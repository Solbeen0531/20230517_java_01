CREATE TABLE MEMBER(
MEMBER_ID VARCHAR2(20),
MEMBER_PWD VARCHAR2(20),
MEMBER_NAME VARCHAR2(20)
);

COMMENT ON COLUMN 테이블명.컬럼명 IS '주석 내용';
COMMENT ON COLUMN MEMBER.MEMBER_ID IS '회원아이디';
COMMENT ON COLUMN MEMBER.MEMBER_PWD IS '비밀번호';
COMMENT ON COLUMN MEMBER.MEMBER_NAME IS '회원이름';

DESC USER_CONSTRAINTS;
DESC USER_CONS_COLUMNS;

CREATE TABLE USER_NOTNULL(
USER_NO NUMBER NOT NULL,
USER_ID VARCHAR2(20) NOT NULL,
USER_PWD VARCHAR2(30) NOT NULL,
USER_NAME VARCHAR2(30),
GENDER VARCHAR2(10),
PHONE VARCHAR2(30),
EMAIL VARCHAR2(50)
);

INSERT INTO USER_NOTNULL VALUES(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 
'hong123@kh.or.kr');
--INSERT INTO USER_NOTNULL VALUES(2, NULL, NULL, NULL, NULL, '010-1234-5678', 
--'hong123@kh.or.kr');
--오류 보고 -
--ORA-01400: NULL을 ("KH"."USER_NOTNULL"."USER_ID") 안에 삽입할 수 없습니다

COMMIT;

CREATE TABLE USER_UNIQUE(
USER_NO NUMBER,
USER_ID VARCHAR2(20) UNIQUE,
USER_PWD VARCHAR2(30) NOT NULL,
USER_NAME VARCHAR2(30),
GENDER VARCHAR2(10),
PHONE VARCHAR2(30),
EMAIL VARCHAR2(50)
);

INSERT INTO USER_UNIQUE VALUES(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 
'hong123@kh.or.kr');
--INSERT INTO USER_UNIQUE VALUES(1, 'user01', 'pass01', NULL, NULL, '010-1234-5678', 
--'hong123@kh.or.kr');
--오류 보고 -
--ORA-00001: 무결성 제약 조건(KH.SYS_C008361)에 위배됩니다

COMMIT;

--CREATE TABLE USER_UNIQUE2(
--USER_NO NUMBER,
--USER_ID VARCHAR2(20),
--USER_PWD VARCHAR2(30) NOT NULL,
--USER_NAME VARCHAR2(30),
--GENDER VARCHAR2(10),
--PHONE VARCHAR2(30),
--EMAIL VARCHAR2(50),
--UNIQUE (USER_ID) --테이블 레벨
--);
--오류 보고 -
--ORA-00955: 기존의 객체가 이름을 사용하고 있습니다.

SELECT * FROM USER_UNIQUE2;
SELECT * FROM USER_UNIQUE3;

INSERT INTO USER_UNIQUE3 VALUES(1, 'user01', 'pass01', '홍길동', '남', '010-1234-
5678', 'hong123@kh.or.kr');
INSERT INTO USER_UNIQUE3 VALUES(2, 'user01', 'pass01', NULL, NULL, '010-1234-
5678', 'hong123@kh.or.kr');
INSERT INTO USER_UNIQUE3 VALUES(2, 'user02', 'pass02', NULL, NULL, '010-1234-
5678', 'hong123@kh.or.kr');
--INSERT INTO USER_UNIQUE3 VALUES(1, 'user01', 'pass01', NULL, NULL, '010-1234-
--5678', 'hong123@kh.or.kr');
--오류 보고 -
--ORA-00001: 무결성 제약 조건(KH.SYS_C008359)에 위배됩니다

COMMIT;

CREATE TABLE USER_PRIMARYKEY1( 
USER_NO NUMBER PRIMARY KEY, 
USER_ID VARCHAR2(20) UNIQUE,
USER_PWD VARCHAR2(30) NOT NULL, 
USER_NAME VARCHAR2(30), 
GENDER VARCHAR2(10), 
PHONE VARCHAR2(30), 
EMAIL VARCHAR2(50) 
);

CREATE TABLE USER_PRIMARYKEY2(
USER_NO NUMBER,
USER_ID VARCHAR2(20) UNIQUE,
USER_PWD VARCHAR2(30) NOT NULL,
USER_NAME VARCHAR2(30),
GENDER VARCHAR2(10),
PHONE VARCHAR2(30),
EMAIL VARCHAR2(50),
PRIMARY KEY (USER_NO)
);

COMMIT;

create synonym emp for employee;
select * from emp;

create public synonym dept_public for KH.DEPT;
select * from emp;
select * from DEPT2_PUBLIC;

