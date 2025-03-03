package com.example.Backengine.Controller;

import com.example.Backengine.Model.Venda;

import java.util.List;

public class VendaController {

    BancoDeVendas bc = new BancoDeVendas();

    public List<Venda> getAllVendas() {return bc.findAll();}
