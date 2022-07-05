/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author Brandon R
 */
public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activo);
    public Articulo getArticulo(Articulo articulo); 
    public void save(Articulo articulo);
    public void delete (Articulo articulo);
    
}
