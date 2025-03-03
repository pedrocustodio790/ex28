package Controller;

import Model.Compra;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
    @RequestMapping("/compras")
    public class CompraController {

        @Autowired
        private CompraService compraService;

        @GetMapping
        public List<Compra> listarCompras() {
            return compraService.listarTodas();
        }

        @PostMapping
        public Compra criarCompra(@RequestBody Compra compra) {
            return compraService.salvar(compra);
        }
    }