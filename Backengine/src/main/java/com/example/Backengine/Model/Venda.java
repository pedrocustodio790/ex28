package com.example.Backengine.Model;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Venda {
    public String Nome;
    public LocalDate datavenda;
    public ArrayList<Produto> produtos;
    public int idVenda;
}

