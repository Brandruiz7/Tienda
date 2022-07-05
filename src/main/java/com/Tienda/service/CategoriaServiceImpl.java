/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.service;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Brandon R
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    //Los que son de lectura @Transactional(readOnly = true) y sino normal.
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activo) { // actiivo == true
        var lista = (List<Categoria>) categoriaDao.findAll();
        
        if (activo) {
            lista.removeIf(e -> !e.isActivo()); //Remueva los negativos o false
        }
        return lista;
    }

    /**
     * Buscamos un registro de un categoria y si no encuentra devuelve null.
     *
     * @param categoria Dato del categoria en la base de datos.
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    /**
     * Para guardar o sobreescribir
     *
     * @param categoria
     */
    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    /**
     * Para borrar datos.
     *
     * @param categoria
     */
    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

}
