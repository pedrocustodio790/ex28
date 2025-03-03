package com.example.Backengine.Controller;

import com.example.Backengine.Model.Funcionario;

import java.util.List;

public class FuncionarioController {

    BancoDeFuncionarios bf = new BancodeFuncionarios();

    public List<Funcionario> getAllFuncionarios() {
        return bf.findAll();
    }

}