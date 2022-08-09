/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.domain.Carrito;

/**
 *
 * @author Brandon R
 */
public interface CarritoService {

    public Carrito getCarrito(Carrito carrito);

    public Carrito getCarritoCliente(long idCliente);
}
