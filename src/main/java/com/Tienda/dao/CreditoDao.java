/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.dao;


import com.Tienda.domain.Credito;
import org.springframework.data.repository.CrudRepository;

/**
 * DAO Data Access Objet, Crud son métodos implícitos
 *
 * @author Brandon R
 */
public interface CreditoDao extends CrudRepository<Credito, Long>{
    
}
