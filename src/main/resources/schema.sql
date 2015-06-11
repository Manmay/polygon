
/* Table login */
create table login (
    id integer generated by default as identity (start with 1, increment by 1) not null primary key,
    user_name varchar(32) not null, 
    password varchar(32) not null, 
    enabled boolean not null, 
    role varchar(16) not null
);

/* Table product */
create table products(
    id integer generated by default as identity (start with 1, increment by 1) not null primary key, 
    name varchar(64) not null, 
    description varchar(256),
    image varchar(128) 
);

/* table: answer_types */
create table answer_types(
    id integer generated by default as identity (start with 1, increment by 1) not null primary key,
    answer_type varchar(16) not null
);


/* Table questionnaires */
create table questionnaires(
    id integer generated by default as identity (start with 1, increment by 1) not null primary key, 
    product_id integer not null,
    sequence_number integer not null,
    question varchar(256) not null,
    answer_type_id integer not null,
    depends_on integer,
    if_answer varchar(128),
    constraint questionnaires_fk1 foreign key (product_id) references products (id),
    constraint questionnaires_fk2 foreign key (answer_type_id) references answer_types (id)
);


/* table : answer_values */
create table answer_values(
    id integer generated by default as identity (start with 1, increment by 1) not null primary key,
    questionnaire_id integer not null,
    answer_value varchar(128) not null,
    constraint answer_values_fk1 foreign key (questionnaire_id) references questionnaires (id),
);



