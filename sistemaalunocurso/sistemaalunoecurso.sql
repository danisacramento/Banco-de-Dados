create database sistemaalunoecurso;
use sistemaalunoecurso;

insert into tblaluno (id, nome, email, endereco, curso_id) values (1,'Maria','usuario1@usuario.com','R dos Bobos nº 1',1);
insert into tblaluno (id, nome, email, endereco, curso_id) values (2,'Joao','usuario2@usuario.com','R dos Bobos nº 2',1);
insert into tblaluno (id, nome, email, endereco, curso_id) values (3,'Marta','usuario3@usuario.com','R dos Bobos nº 3',2);
insert into tblaluno (id, nome, email, endereco, curso_id) values (4,'Paulo','usuario4@usuario.com','R dos Bobos nº 4',3);
insert into tblaluno (id, nome, email, endereco, curso_id) values (5,'Douglas','usuario5@usuario.com','R dos Bobos nº 5',4);

insert into tblcurso (id, nome, area, modalidade) values (1,'Letras','Humanas','presencial');
insert into tblcurso (id, nome, area, modalidade) values (2,'História','Humanas','online');
insert into tblcurso (id, nome, area, modalidade) values (3,'Matemática','Exatas','presencial');
insert into tblcurso (id, nome, area, modalidade) values (4,'Ciências da Computação','Exatas','presencial');

select * from tblaluno;