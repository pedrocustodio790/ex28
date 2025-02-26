package com.example.Backengine.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    private String cep;
    private String cpf;
    private String cnpj;
    private String nome;
}
