package View;

import Model.Cliente;
import Model.Compra;

import java.util.List;

@RestController
public class CompraView {
    public CompraView cv = new CompraView();
    public List<CompraView>getinformaçãoCompra(){
        return cv ListarCompra();
    }
    @PostMapping
    public String postInformationsCompra(@RequestBody Cliente cliente) {
        cv.postarCompra(CompraView);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsClientes(@RequestBody Cliente cliente){
        if(cv.atualizarCompra(cliente)){
            return "Sucesso ao atualizar a compra";
        } else {
            return "Falha ao atualizar a compra ";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsCliente(@RequestParam int id) {
        if (cv.deletarCompra(id)) {
            return "compra efetuada com sucesso";
        } else {
            return "Falha ao efetuar a compra";
        }
    }
