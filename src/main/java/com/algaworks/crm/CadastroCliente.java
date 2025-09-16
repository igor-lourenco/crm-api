package com.algaworks.crm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CadastroCliente {
    private final List<Cliente> clientes = new ArrayList();

    public CadastroCliente() {
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void adicionar(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> consultar(Predicate<Cliente> filtro) {
        List<Cliente> clientesFiltrados = new ArrayList();
        Iterator var3 = this.clientes.iterator();

        while(var3.hasNext()) {
            Cliente cliente = (Cliente)var3.next();
            if (filtro.test(cliente)) {
                clientesFiltrados.add(cliente);
            }
        }

        return clientesFiltrados;
    }
}
