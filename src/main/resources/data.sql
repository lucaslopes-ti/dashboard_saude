INSERT INTO tb_usuarios (nome, email, nome_usuario,imagem,senha,createdAt,updatedAt) VALUES ('Lucas', 'lu.silva@senai.com.br', 'boltzmann', 'imagem01.jpg', '123456', NOW(), NOW());

INSERT INTO tb_atividade (tipo_atividade,distancia_percorrida,duracao_atividade,quantidade_calorias,createdAt,updatedAt,usuario_id) VALUES ('Corrida', 5000, 30, 300, NOW(), NOW(), 1);