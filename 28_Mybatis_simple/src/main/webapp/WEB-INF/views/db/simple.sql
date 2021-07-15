DROP SEQUENCE SIMPLE_SEQ;
CREATE SEQUENCE SIMPLE_SEQ
START WITH 1
INCREMENT BY 1
MAXVALUE 999999
NOCYCLE
NOCACHE;

DROP TABLE SIMPLE;
CREATE TABLE SIMPLE
(
	NO NUMBER PRIMARY KEY,
	WRITER VARCHAR2(100),
	TITLE VARCHAR2(1000),
	CONTENT VARCHAR2(4000),
	REGDATE DATE
);

SELECT * FROM SIMPLE;