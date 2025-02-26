package com.example.Backengine.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    private int idFuncionario;
    private String nome;
    private String cpf;
}
