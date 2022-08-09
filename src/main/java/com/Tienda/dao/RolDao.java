/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.dao;

import com.Tienda.domain.Rol;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author Brandon R
 */
public interface RolDao extends CrudRepository<Rol, Long>{
    
}
