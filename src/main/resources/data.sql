INSERT INTO tb_usuarios (nome, email, nome_usuario,imagem,senha,created_at,updated_at) VALUES ('Lucas', 'lu.silva@senai.com.br', 'boltzmann', 'imagem01.jpg', '123456', NOW(), NOW());

INSERT INTO tb_atividade (tipo_atividade,distancia_percorrida,duracao_atividade,quantidade_calorias,created_at,updated_at,usuario_id) VALUES ('Corrida', 5000, 30, 300, NOW(), NOW(), 1);