package com.algaworks.crm;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Principal {
    private static final Logger log = LoggerFactory.getLogger(Principal.class);

    public static void main(String[] args) {
        log.debug("Iniciando a classe main...");

        CadastroCliente cadastroCliente = new CadastroCliente();

        cadastroCliente.adicionar(new Cliente("João da Silva", 30));
        cadastroCliente.adicionar(new Cliente("Maria Conceição", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião das Couves", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina de Jesus", 45));
        cadastroCliente.adicionar(new Cliente("Josefina Amaral", 25));


        log.warn("Quantidade de clientes adicionados: " + cadastroCliente.getClientes().size());

        List<Cliente> clientes = cadastroCliente.consultar(c -> c.getIdade() > 40);

        for (Cliente cliente : clientes) {
            log.info("{} - {} anos", StringUtils.abbreviate(cliente.getNome(), 15), cliente.getIdade());
        }

        try {
            clientes.get(10);
        } catch (IndexOutOfBoundsException e) {
            log.error("Simulando log para captura da exception... " + e.getMessage());
        }


        log.debug("Fim :-)");
    }
}
