create table proposta (
	id bigint not null auto_increment,
	nome varchar(80) not null,
    cpf varchar(11) unique not null,
	idade bigint not null,
	sexo varchar(1) not null,
	estado_civil varchar(25) not null,
    estado varchar(2) not null,
	dependentes bigint not null,
	renda bigint not null,
	resultado_analise boolean not null,
	limite varchar(100) not null,
	data_atualizacao datetime null,
	data_cadastro datetime not null,
	
	primary key (id)
) engine=InnoDB default charset=utf8;