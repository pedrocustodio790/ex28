package Controller;

import Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class Clientecontroller {
    @Autowired
    private Clientecontroller clientecontroller;

    @GetMapping
    public List<Cliente> ListarClientes(){
        return clientecontroller.listarTodos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorID(@PathVariable int IdVenda){
        Cliente cliente = clientecontroller.buscarPorID(IdVenda);
        return cliente != null ? ResponseEntity.ok(cliente) :  ResponseEntity.notFound().build();
    }
    @PostMapping
    public Cliente criaCliente(@Resquesbody Cliente cliente){
        return clientecontroller.salvar(cliente);
        @PutMapping("/{id}")
        public ResponseEntity<Cliente> atualizarCliente(@PathVariable int id, @RequestBody Cliente cliente) {
            Cliente existente = clienteService.buscarPorId(id);
            if (existente == null) {
                return ResponseEntity.notFound().build();
            }
            cliente.setIdCliente(id);
            return ResponseEntity.ok(clienteService.salvar(cliente));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletarCliente(@PathVariable int id) {
            clienteService.deletar(id);
            return ResponseEntity.noContent().build();
        }
    }
    }
}
