create table board(
bno Number(5) constraint bno_PK primary key,
btitle varchar2(30) constraint btitle_NN not null,
bcontent varchar2(1000) constraint bcontent_NN not null,
bwriter varchar2(10) constraint bwriter_NN not null,
bdate date constraint date_NN not null
); -- 테이블 생성

create sequence bno_seq
increment by 1
start with 1
nocache;


insert into board values(
bno_seq.nextval,'비가 온다2','아야어여오요','용상엽',sysdate
);
insert into board values(
bno_seq.nextval,'비가 계속온다2','아야어여오요','용상엽',sysdate
);
insert into board values(
bno_seq.nextval,'비가 안그친다2','아야어여오요','용상엽',sysdate
);
insert into board values(
bno_seq.nextval,'우산이없다2','아야어여오요','용상엽',sysdate
);
insert into board values(
bno_seq.nextval,'집에 어떻게 가냐2','아야어여오요','용상엽',sysdate
);

--회원 member table
create table member(
	mno number(5) constraint mno_PK primary key,
	mid nvarchar2(10) constraint mid_NN_U not null Unique,
	mpw nvarchar2(20) constraint mpw_NN not null,
	mdate date constraint mdate_NN not null
);

--데이터 샘플 생성
insert into member values(
bno_seq.nextval,'작성자1','1234',SYSDATE
);
insert into member values(
bno_seq.nextval,'안희준','1111',SYSDATE
);
insert into member values(
bno_seq.nextval,'용상엽','2222',SYSDATE
);
insert into member values(
bno_seq.nextval,'양승환','3333',SYSDATE
);
insert into member values(
bno_seq.nextval,'조건재','4444',SYSDATE
);
insert into member values(
bno_seq.nextval,'조건재3','44445',SYSDATE
);

create table droppedMember (
	mno number(5) ,
	mid nvarchar2(10) ,
	mpw nvarchar2(20),
	mdate date default SYSDATE
);

create table droppedBoard as select * from board where 1<>1;

create or replace TRIGGER old_member
AFTER DELETE ON member
FOR EACH row
BEGIN
    INSERT INTO droppedMember(mno,mid,mpw)
    VALUES (:OLD.MNO,:OLD.MID,:OLD.MPW);
end;

create or replace TRIGGER old_board
AFTER DELETE ON member
FOR EACH row
BEGIN
    INSERT INTO droppedMember(bno,btitle,bcontent,bwriter,bdate)
    VALUES (:OLD.bno,:OLD.btitle,:OLD.bcontent,:old.bwriter,:old.bdate);
end;



delete from member where mid='작성자1';

select * from board;
select * from member;

select * from droppedMember;

drop table droppedMember;

drop trigger goodbye;

drop sequence bno_seq;
drop table board;