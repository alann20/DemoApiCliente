package com.globant.DemoClientesRest.impl;

import com.globant.DemoClientesRest.dao.ClienteDAO;
import com.globant.DemoClientesRest.entity.Cliente;
import com.globant.DemoClientesRest.model.ClienteDTO;
import com.globant.DemoClientesRest.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/*
Se agrega la etiqueta service para indicarle que es un servicio
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    ClienteDAO clienteDAO;


    @Override
    public List<Cliente> findAll() {
        List<Cliente> listCliente=clienteDAO.findAll();
        return listCliente;
    }

    @Override
    public Cliente findByID(int id) {
        Cliente cliente=clienteDAO.findByID(id);
        return cliente;
    }

    @Override
    public void save(Cliente cliente) {

    }



    @Override
    public void deleteByID(int id) {
        clienteDAO.deleteById(id);

    }
}
