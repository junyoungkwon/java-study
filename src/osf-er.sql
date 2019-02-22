
/* Drop Tables */

DROP TABLE Board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board
(
	-- 데이타베이스의 주석과 같은 느낌
	Num number(10,0) NOT NULL,
	Title varchar2(150),
	Content varchar2(4000)
);



/* Comments */

COMMENT ON COLUMN Board.Num IS '데이타베이스의 주석과 같은 느낌';



