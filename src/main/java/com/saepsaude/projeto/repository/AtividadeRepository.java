package com.saepsaude.projeto.repository;

import com.saepsaude.projeto.model.Atividade;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    @Query("SELECT a FROM Atividade a WHERE :tipo IS NULL OR a.tipoAtividade = :tipo ORDER BY a.createdAt DESC")
    List<Atividade> findByTipoAtividade(@Param("tipo") String tipo, Pageable pageable);

    long countByTipoAtividade(Long usuarioId);

    @Query("SELECT COALESCE(SUM(a.quantidadeCalorias), 0) FROM Atividade a WHERE a.usuario.id = :usuarioId")
    long sumQuantidadeCaloriasByUsuarioId(@Param("usuarioId") Long usuarioId);
}
