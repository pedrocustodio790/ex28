package com.example.Backengine.Controller;

import com.example.Backengine.Model.Compra;

import java.util.List;

public class CompraController {

    BancoDeCompras bc = new BancodeCompra();

    public List<Compra> getAllCompras() {return bc.findAll();}

}