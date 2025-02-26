package com.example.Backengine.View;


import com.example.Backengine.Controller.ClienteController;
import com.example.Backengine.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteView {

    ClienteController cc = new ClienteController();

    @GetMapping("/cliente")
    public List<Cliente> getAllClientes(){
        return cc.getAllClientes();
    }

}
