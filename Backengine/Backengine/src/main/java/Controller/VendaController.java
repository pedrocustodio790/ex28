package Controller;

import Model.Venda;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @GetMapping
    public List<Venda> listarVendas() {
        return vendaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venda> buscarPorId(@PathVariable int id) {
        Venda venda = vendaService.buscarPorId(id);
        return venda != null ? ResponseEntity.ok(venda) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Venda criarVenda(@RequestBody Venda venda) {
        return vendaService.salvar(venda);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVenda(@PathVariable int id) {
        vendaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
