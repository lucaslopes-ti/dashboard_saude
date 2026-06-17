package com.saepsaude.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_usuarios")
public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String nomeUsuario;
    private String imagem;
    private String senha;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
