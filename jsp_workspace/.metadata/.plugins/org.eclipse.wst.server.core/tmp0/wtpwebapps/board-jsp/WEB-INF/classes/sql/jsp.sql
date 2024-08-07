--회원 정보
create table member(
id nvarchar2(10) constraint id_pk primary key,
pw nvarchar2(20) constraint pw_nn not null,
name nvarchar2(30) constraint name_nn not null,
regidate date default sysdate constraint regidate_nn not null
);

create table board(
b_num number constraint b_num_pk primary key,
b_title nvarchar2(100) constraint b_title_nn not null,
b_contents nvarchar2(2000) constraint b_contents_nn not null,
b_id nvarchar2(10) constraint b_id_nn not null,
b_postdate date default sysdate constraint b_postdate_nn not null, --작성일
b_count number default 0 constraint b_count_nn not null --조회수
);

alter table board add constraint b_id_fk foreign key (b_id) references member(id);

create sequence b_num_seq
increment by 1
start with 1
nocache
nocycle;


select * from member;

select * from BOARD;

select count(*) from board;

update board set b_count = b_count+1 where b_num=1;


select * from (select T.*, rownum rNum from (select * from board order by b_num desc) T ) where rNum between A and B; --rownum A와B 사이의 값을 가져온다