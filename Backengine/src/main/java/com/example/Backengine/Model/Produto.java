package com.example.Backengine.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    public int idProduto;
    public String nomeproduto;
    public Double preco;
    public Integer quantidade;
    public String status;
}
