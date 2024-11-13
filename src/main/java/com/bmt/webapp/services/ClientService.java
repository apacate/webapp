package com.bmt.webapp.services;

import com.bmt.webapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clienteRepository;

    @Autowired
    public ClientService(ClientRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Long contarRegistros() {
        return clienteRepository.count();
    }

    public Long contarClientesNoAno(int ano) {
        return clienteRepository.countByYear(ano);
    }

    public Long contarClientesNoMes(int ano, int mes) {
        return clienteRepository.countByMonth(ano, mes);
    }
}


