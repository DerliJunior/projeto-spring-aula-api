package br.com.santander.mssx.mssx.demo.controllers;

import br.com.santander.mssx.mssx.demo.models.Aluno;
import br.com.santander.mssx.mssx.demo.repository.IAlunoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class TestController {
    @Autowired
    IAlunoRepository alunoRepository;

    @GetMapping("/lista")
    public ResponseEntity<List<Aluno>> getController() {

        List<Aluno> aluno = alunoRepository.findAll();

        if(aluno.isEmpty()) return ResponseEntity.noContent().build();

        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping("criar")
    public ResponseEntity<Aluno> adicionarAluno(@RequestBody Aluno aluno) {
        var alunoCriado = alunoRepository.save(aluno);

        return ResponseEntity.created(null).body(alunoCriado);
    }
}
