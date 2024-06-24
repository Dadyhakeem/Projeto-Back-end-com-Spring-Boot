create extension if not exists "pgcrypto";


create table eventos(
    id UUID Default gen_random_uuid() PRIMARY KEY,
    titulo varchar(100) not null,
    descricao varchar (250)not null,
    img_url varchar (100)not null,
    eventos_url varchar (100) not null,
    date TIMESTAMP NOT NULL,
    remote boolean not null

) ;