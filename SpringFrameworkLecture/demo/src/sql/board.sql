create table board(
    board_no bigint not null auto_increment,
    content varchar(255),
    reg_date datetime,
    title varchar(255),
    writer varchar(255),
    primary key(board_no)
) engine=InnoDB;