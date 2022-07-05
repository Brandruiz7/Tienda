/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Segundo Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 */
package com.Tienda.controller;

import com.Tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Importar anotaciones Controller,Slf4j
 *
 * @author Brandon R
 */
@Controller
@Slf4j
public class IndexController {

    /**
     * @Autowired private ClienteDao clienteDao;
     */
    @Autowired
    private ArticuloService articuloService;

    /**
     * Revisar los HTTP Verbs de peticiones, en el paréntesis va una ruta.
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        return "index";
    }

}
