create table endereco(
    id UUID default gen_random_uuid() primary key ,
    cidade varchar (100)not null,
    estado varchar (100) not null,
    eventos_id UUID,
    foreign key (eventos_id) references eventos(id) on delete cascade
)