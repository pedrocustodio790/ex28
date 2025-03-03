package com.example.Backengine.View;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioView {

    // Supondo que existe um FuncionarioController injetado
    // @Autowired
    // private FuncionarioController funcionarioController;

    @GetMapping
    public String getFuncionarios() {
        return "Lista de funcionários (implementar lógica)";
    }

    @PostMapping
    public <Funcionario> String criarFuncionario(@RequestBody Funcionario funcionario) {
        return "Funcionário criado (implementar lógica)";
    }
}