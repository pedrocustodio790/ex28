package com.example.Backengine.View;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraView {


    @GetMapping
    public <Compra> List<Compra> listarCompras() {
        return List.of(); // Implementar chamada ao controller
    }

    @PostMapping
    public <Compra> String criarCompra(@RequestBody Compra compra) {
        return "Compra cadastrada (implementar lógica)";
    }

    @PutMapping
    public <Compra> String atualizarCompra(@RequestBody Compra compra) {
        return "Compra atualizada (implementar lógica)";
    }

    @DeleteMapping("/{id}")
    public String deletarCompra(@PathVariable int id) {
        return "Compra deletada (implementar lógica)";
    }
}