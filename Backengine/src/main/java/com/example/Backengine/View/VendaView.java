package com.example.Backengine.View;


import com.example.Backengine.Model.Venda;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaView {
    @GetMapping
    public <Venda> List<Venda> listarVendas() {
        return List.of(); // Implementar
    }

    @PostMapping
    public String criarVenda(@RequestBody Venda venda) {
        return "Venda registrada (implementar)";
    }

    @PutMapping
    public String atualizarVenda(@RequestBody Venda venda) {
        return "Venda atualizada (implementar)";
    }

    @DeleteMapping("/{id}")
    public String deletarVenda(@PathVariable int id) {
        return "Venda deletada (implementar)";
    }
}

