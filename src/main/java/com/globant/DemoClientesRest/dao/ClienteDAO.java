package com.globant.DemoClientesRest.dao;

import com.globant.DemoClientesRest.entity.Cliente;
import com.globant.DemoClientesRest.model.ClienteDTO;
import org.apache.tomcat.jni.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClienteDAO {
    public List<Cliente> findAll();
    public Cliente findByID(int id);
    public void save(ClienteDTO clienteDTO);
    public void deleteById(int id);

}
