create table coupon(
    id UUID default gen_random_uuid() primary key,
    code varchar (100) not null,
    dscount Integer not null,
    valid TIMESTAMP NOT NULL,
    eventos_id UUID,
    foreign key (eventos_id) references eventos(id)on delete cascade
);