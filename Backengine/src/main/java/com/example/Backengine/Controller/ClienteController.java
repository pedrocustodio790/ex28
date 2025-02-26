package com.example.Backengine.Controller;

import com.example.Backengine.Banco.BancoDeClientes;
import com.example.Backengine.Model.Cliente;

import java.util.List;

public class ClienteController {

    BancoDeClientes bc = new BancoDeClientes();

    public List<Cliente> getAllClientes(){
        return bc.findAll();
    }
}
