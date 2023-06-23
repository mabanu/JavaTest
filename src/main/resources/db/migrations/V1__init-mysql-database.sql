drop table if exists first;

create table first (
                      id varchar(36) not null,
                      name varchar(50) not null,
                      primary key (id)
) engine=InnoDB;