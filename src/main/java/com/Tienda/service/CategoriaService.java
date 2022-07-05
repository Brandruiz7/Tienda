/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author Brandon R
 */
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activo);
    public Categoria getCategoria(Categoria categoria); 
    public void save(Categoria categoria);
    public void delete (Categoria categoria);
    
}