package View;

import Controller.ProdutoController;
import Model.Produto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class Produtoview {
    ProdutoController pc = new ProdutoController();

    @GetMapping("/produto")
    public List<Produto> getAllProdutos(){
        return pc.pegarprodutos();
    }

    @PostMapping("/produto")
    public String postNovoProduto(@RequestBody Produto m){
        pc.inserirNoBanco(m);
        return "Sucesso";
    }

}





}
