package com.projeto_as.chatbot.controller;

import com.projeto_as.chatbot.model.MatriculaModel;
import com.projeto_as.chatbot.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matriculas")
@CrossOrigin
public class MatriculaController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @PostMapping
    public String criarMatricula(@RequestBody MatriculaModel matricula) {
        matriculaRepository.save(matricula);
        return "Matrícula realizada com sucesso!";
    }
}
