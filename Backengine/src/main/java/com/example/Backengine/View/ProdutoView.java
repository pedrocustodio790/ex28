package com.example.Backengine.View;


import com.example.Backengine.Model.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoView {

    // @Autowired
    // private ProdutoController produtoController;

    @GetMapping
    public List<Produto> listarProdutos() {
        return List.of(); // Implementar
    }

    @PostMapping
    public String criarProduto(@RequestBody Produto produto) {
        return "Produto cadastrado (implementar)";
    }
}