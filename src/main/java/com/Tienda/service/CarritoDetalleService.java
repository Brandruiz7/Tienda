/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.domain.Articulo;
import com.Tienda.domain.CarritoDetalle;
import java.util.List;

/**
 *
 * @author Brandon R
 */
public interface CarritoDetalleService {

    CarritoDetalle getCarritoDetalle(Long idCarrito, Articulo articulo);

    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);

    public void save(CarritoDetalle carritoDetalle);

    public void delete(CarritoDetalle carritoDetalle);

    public void deleteAll(Long idCarrito);
}
