package Controller;

import Model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarTodos();
    }

    @PostMapping
    public Funcionario criarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvar(funcionario);
    }
}
