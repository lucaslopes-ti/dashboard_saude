package com.saepsaude.projeto.controller;


import com.saepsaude.projeto.model.Atividade;
import com.saepsaude.projeto.repository.AtividadeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Generated;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ApiController {
    
    @Autowired
    private AtividadeRepository atividadeRepository;

    @GetMapping("/atividades")
    public ResponseEntity<Page<Atividade>> getAtividades(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(required = false) String tipo) {
        Pageable pageable = PageRequest.of(page, 4); // 4 por pagina
        return ResponseEntity.ok(atividadeRepository.findByTipoAtividade(tipo, pageable));
    }
}
