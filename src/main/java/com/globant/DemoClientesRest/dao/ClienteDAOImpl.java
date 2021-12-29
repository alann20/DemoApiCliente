package com.globant.DemoClientesRest.dao;

import com.globant.DemoClientesRest.entity.Cliente;
import com.globant.DemoClientesRest.model.ClienteDTO;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    /*
    EntityManager maneja la interacción de la base de datos
     y los metadatos para las correlaciones relacionales de objetos.
     */
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Cliente> findAll() {
        Session session=entityManager.unwrap(Session.class);
        Query query=session.createQuery("from cliente",Cliente.class);
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

    @Override
    public Cliente findByID(int id) {
        Session session=entityManager.unwrap(Session.class);
        Cliente cliente=session.get(Cliente.class,id);
        return cliente;
    }

    @Override
    public void save(ClienteDTO clienteDTO) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(clienteDTO);
    }


    @Override
    public void deleteById(int id) {
        Session session=entityManager.unwrap(Session.class);
        Query query=session.createQuery("delete from Cliente where id=:idCliente");
        query.setParameter("idCliente",id);
        query.executeUpdate();

    }
}
