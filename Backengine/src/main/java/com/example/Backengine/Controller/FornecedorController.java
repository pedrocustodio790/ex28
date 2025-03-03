package com.example.Backengine.Controller;

import com.example.Backengine.Model.Fornecedor;

import java.util.List;

public class FornecedorController {

    BancoDeFornecedores bc = new BancoDeFornecedores();

    public List<Fornecedor> getAllFornecedores() {return bc.findAll();}

    public void deleteFornecedor(Long id) {

    }

    public Fornecedor getFornecedorById(Long id) {

    }

    public Fornecedor createFornecedor(Fornecedor fornecedor) {

    }

    public Fornecedor updateFornecedor(Long id, Fornecedor fornecedor) {
    }
}

