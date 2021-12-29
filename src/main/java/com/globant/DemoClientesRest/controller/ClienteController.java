package com.globant.DemoClientesRest.controller;

import com.globant.DemoClientesRest.entity.Cliente;
import com.globant.DemoClientesRest.impl.ClienteServiceImpl;
import com.globant.DemoClientesRest.model.ClienteDTO;
import com.globant.DemoClientesRest.repository.ClienteRepository;
import com.globant.DemoClientesRest.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequestMapping("/api")
public class ClienteController {
   // @Autowired
    private ClienteServiceImpl clienteService;
    @Autowired
    private ClienteRepository clienteRepository;
    /*
    el repo cuenta con metodos
    findAll, findOne,save
     */
    //Obtener
    @GetMapping("/cliente/{id}")
    public Cliente getUser(@PathVariable("id") Integer id){
    //   Cliente cliente=clienteService.findByID(id);
     //   if(cliente==null){
      //      throw new RuntimeException("id no encontrado "+id);
        //}
        return clienteRepository.getById(id);
    }
    //Guardar
    @PostMapping("/cliente")
    public Cliente addCliente(@RequestBody Cliente cliente){

        return clienteRepository.save(cliente);
    }

    @PutMapping("/cliente")
    public Cliente updateCliente(@RequestBody Cliente cliente){
        clienteService.save(cliente);
        return cliente;
    }
    @DeleteMapping("/cliente/{id}")
    public void deleteCliente(@PathVariable("id") Integer id){
      /*  Cliente cliente=clienteService.findByID(id);
        if (cliente==null){
            throw new RuntimeException("Id no encontrado" + id);
        }
        clienteService.deleteByID(id);
        return "Usuario eliminado id"+ id;

       */
        clienteRepository.deleteById(id);
    }


}
