/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.dao.CreditoDao;
import com.Tienda.domain.Cliente;
import com.Tienda.domain.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Brandon R
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    
    @Autowired
    private CreditoDao creditoDao;

    //Los que son de lectura @Transactional(readOnly = true) y sino normal.
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    /**
     * Buscamos un registro de un cliente y si no encuentra devuelve null.
     *
     * @param cliente Dato del cliente en la base de datos.
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    /**
     * Para guardar o sobreescribir
     *
     * @param cliente
     */
    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito= cliente.getCredito(); //Se extrae el dato de la base
        credito = creditoDao.save(credito); // Si no tiene crea uno y guarda
        cliente.setCredito(credito); // Se actualiza el dato.
        clienteDao.save(cliente); // Se guarda el dato del cliente.
    }

    /**
     * Para borrar datos.
     *
     * @param cliente
     */
    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

}
