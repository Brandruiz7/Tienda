/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.ClienteDao;

import com.Tienda.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 * DAO Data Access Objet
 *
 * @author Brandon R
 */
public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
