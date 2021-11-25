INSERT INTO tb_usuario (nome, email, senha) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_usuario (nome, email, senha) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_perfil (tipo) VALUES ('OPERADOR');
INSERT INTO tb_perfil (tipo) VALUES ('ADMIN');

INSERT INTO tb_usuario_perfil(usuario_id, perfil_id) VALUES (1, 1);
INSERT INTO tb_usuario_perfil(usuario_id, perfil_id) VALUES (2, 1);
INSERT INTO tb_usuario_perfil(usuario_id, perfil_id) VALUES (2, 2);