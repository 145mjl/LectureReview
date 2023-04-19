DROP TABLE member CASCADE CONSTRAINTS;
DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE myfile CASCADE CONSTRAINTS;
DROP SEQUENCE seq_board_num;


CREATE TABLE member(
	id varchar2(10) not null,
	pass varchar2(10) not null,
	name varchar2(30) not null,
	regidate date default sysdate not null,
	primary key (id)
);

CREATE TABLE board(
	num number primary key,
	title varchar2(200) not null,
	content varchar2(2000) not null,
	id varchar2(10) not null,
	postdate date default sysdate not null,
	visitcount number(6)
);

CREATE TABLE myfile(
	idx number primary key,
	name varchar2(50) not null,
	title varchar2(200) not null,
	cate varchar2(30),
	ofile varchar2(100) not null,
	sfile varchar2(30) not null,
	postdate date default sysdate not null
);


alter table board
add constraint board_mem_fk foreign key (id) references member (id);

create sequence seq_board_num
increment by 1
start with 1
minvalue 1
nomaxvalue
nocycle
nocache;

INSERT INTO member VALUES ('nakja','1234','관리자',sysdate);
INSERT INTO member VALUES ('musthave','1234','머스트해브',sysdate);

--더미 데이터 (1개)
INSERT INTO board VALUES (seq_board_num.nextval, '글제목입니다1','글내용입니다1','musthave', sysdate, 0);

--더미 데이터 (100개) (필수 아님, 페이징보드에 작성해도 자바코드에 의해 100개 작성됨)
DECLARE
 vn_data1 VARCHAR2(100) := 'test_title_';
 vn_data2 VARCHAR2(100) := 'test_content_';
BEGIN
	 FOR i IN 1..100
	 LOOP
	 INSERT INTO board
	 VALUES
	 (seq_board_num.nextval, vn_data1 || i, vn_data2 || i,'musthave',sysdate,0);
	END LOOP;
    COMMIT;
END;

delete from BOARD where content='';

select * from MEMBER;
select * from BOARD;
select * from MYFILE;