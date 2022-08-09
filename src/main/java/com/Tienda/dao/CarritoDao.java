/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.dao;

import com.Tienda.domain.Carrito;
import java.util.*;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Brandon R
 */
public interface CarritoDao extends CrudRepository<Carrito, Long> {

    Optional<Carrito> findByIdCliente(Long idCliente);
}
