package com.example.Backengine.Banco;

import com.example.Backengine.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoDeClientes {
    private List<Cliente> clientes;

    public BancoDeClientes() {
        this.clientes = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Cliente p) {
        clientes.add(p);
    }

    // Busca um produto pelo ID
    public Cliente findOne(int id) {
        for (Cliente p : clientes) {
            if (p.getIdCliente() == id) {
                return p;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Retorna todos os produtos cadastrados
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    // Atualiza um produto existente na lista
    public boolean update(Cliente p) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getIdCliente() == p.getIdCliente()) {
                clientes.set(i, p);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(int id) {
        return clientes.removeIf(p -> p.getIdCliente() == id);
    }
}