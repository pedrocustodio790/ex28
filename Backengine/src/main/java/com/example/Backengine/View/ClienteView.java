package com.example.Backengine.View;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteView {


    @GetMapping
    public <Cliente> List<Cliente> listarClientes() {
        return List.of(); // Implementar
    }

    @PostMapping
    public <Cliente> String criarCliente(@RequestBody Cliente cliente) {
        return "Cliente criado (implementar)";
    }

    @PutMapping
    public <Cliente> String atualizarCliente(@RequestBody Cliente cliente) {
        return "Cliente atualizado (implementar)";
    }

    @DeleteMapping("/{id}")
    public String deletarCliente(@PathVariable int id) {
        return "Cliente deletado (implementar)";
    }
}