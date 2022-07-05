/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.dao.ArticuloDao;
import com.Tienda.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Brandon R
 */
@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloDao articuloDao;

    //Los que son de lectura @Transactional(readOnly = true) y sino normal.
    
    @Override
    @Transactional(readOnly = true)
    public List<Articulo> getArticulos(boolean activo) { // actiivo == true
        var lista = (List<Articulo>) articuloDao.findAll();
        
        if (activo) {
            lista.removeIf(e -> !e.isActivo()); //Remueva los negativos o false
        }
        return lista;
    }

    /**
     * Buscamos un registro de un articulo y si no encuentra devuelve null.
     *
     * @param articulo Dato del articulo en la base de datos.
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    /**
     * Para guardar o sobreescribir
     *
     * @param articulo
     */
    @Override
    @Transactional
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }

    /**
     * Para borrar datos.
     *
     * @param articulo
     */
    @Override
    @Transactional
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }

}