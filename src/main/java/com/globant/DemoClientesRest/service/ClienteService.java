package com.globant.DemoClientesRest.service;

import com.globant.DemoClientesRest.entity.Cliente;
import com.globant.DemoClientesRest.model.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClienteService {
    public List<Cliente> findAll();
    public Cliente findByID(int id);
    public void save(Cliente cliente);
    public void deleteByID(int id);

}
