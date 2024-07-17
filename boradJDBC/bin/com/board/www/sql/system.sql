CREATE TABLESPACE board
DATAFILE 'C:\board.dbf' SIZE 20M;

create user board1a identified by gmlwns default tablespace board;

alter user board1a temporary tablespace temp; -- 임시 tablespace 설정

grant connect,resource to board1a;
GRANT DBA TO board1a;