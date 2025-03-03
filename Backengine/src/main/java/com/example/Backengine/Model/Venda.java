package com.example.Backengine.Model;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Venda {
    private String nome;
    private LocalDate dataVenda;
    private List<Produto> produtos;
    private int idVenda;
}