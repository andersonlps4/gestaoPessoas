package com.example.gestaoPessoas.controller;

import com.example.gestaoPessoas.model.Funcionario;
import com.example.gestaoPessoas.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> getAllFuncionarios(){
        return funcionarioRepository.findAll();
    }
    @PostMapping
    public Funcionario criarFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }
}
