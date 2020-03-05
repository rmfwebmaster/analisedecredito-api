set foreign_key_checks = 0;

delete from proposta;

set foreign_key_checks = 1;

alter table proposta auto_increment = 1;

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(1, 'Lucas', '12861512016', 28, 'M', 'solteiro(a)', 'SC', 0, 2500, true, 'entre 500 - 1000', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(2, 'Ana', '90558253016', 17, 'F', 'solteiro(a)', 'SP', 0, 1000, true, 'entre 100 - 500', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(3, 'Pedro', '39621909023', 68, 'M', 'casado(a)', 'SC', 3, 8000, true, 'entre 1500 - 2000', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(4, 'Paula', '01223348091', 61,  'F', 'casado(a)', 'RJ', 3, 5000, true, 'entre 1000 - 1500', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(5, 'João', '09502624041', 56, 'M', 'divorciado(a)', 'SP', 2, 2000, false, 'reprovado pela política de crédito', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(6, 'Maria', '97577686000', 45, 'F', 'divorciado(a)', 'RJ', 1, 2000, false, 'reprovado pela política de crédito', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(7, 'José', '52329219083', 30, 'M', 'casado(a)', 'MA', 2, 8000, true, 'superior 2000', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(8, 'Dinae', '76971144023', 33, 'F', 'casado(a)', 'SP', 1, 10000, true, 'superior 2000', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(9, 'Marcos', '61582530068', 19, 'M', 'solteiro(a)', 'SC', 1, 400, false, 'renda baixa', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(10, 'Suzan', '09104537050', 63, 'F', 'viúvo(a)', 'MA', 3, 1500, false, 'reprovado pela política de crédito', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(11, 'Luci', '34613458064', 28, 'F', 'solteiro(a)', 'SC', 2, 2500, true, 'entre 100 - 500', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(12, 'Roberto', '68486540003', 16, 'M', 'solteiro(a)', 'SP', 0, 500, false, 'renda baixa', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(13, 'Bruno', '20787022004', 30, 'M', 'casado(a)', 'MA', 5, 8000, true, 'entre 1000 - 1500', utc_timestamp);

insert into proposta (id, nome, cpf, idade, sexo, estado_civil, estado, dependentes, renda, resultado_analise, limite, data_cadastro) values
(14, 'Ariel', '78290940041', 33, 'F', 'viúvo(a)', 'SP', 0, 10000, true, 'superior 2000', utc_timestamp);