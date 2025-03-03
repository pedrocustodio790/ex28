package com.example.Backengine.View;


import com.example.Backengine.Model.Fornecedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorView {


    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return List.of();
    }

    @PostMapping
    public String criarFornecedor() {
        return criarFornecedor();
    }

    @PutMapping
    public String atualizarFornecedor() {
        return atualizarFornecedor();
    }


    @DeleteMapping("/{id}")
    public String deletarFornecedor() {
        return deletarFornecedor();
    }
}