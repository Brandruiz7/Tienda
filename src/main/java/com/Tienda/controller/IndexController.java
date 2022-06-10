/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Segundo Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 */
package com.Tienda.controller;

import com.Tienda.ClienteDao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Importar anotaciones Controller,Slf4j
 *
 * @author Brandon R
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ClienteDao clienteDao;
    /**
     * Revisar los HTTP Verbs de peticiones, en el paréntesis va una ruta.
     *
     * @param model
     * @return
     */
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizamos MVC");

        /**
         * Cliente cliente = new Cliente("Brandon", "Ruiz Miranda",
         * "brandruiz7@gmail.com", "7215-3137"); Cliente cliente2 = new
         * Cliente("Juan", "López Rojas", "brandruiz7@gmail.com", "7215-3137");
         * Cliente cliente3 = new Cliente("Pedro", "López Rojas",
         * "brandruiz7@gmail.com", "7215-3137"); var clientes =
         * Arrays.asList(cliente,cliente2,cliente3);
         * model.addAttribute("cliente",cliente);
         * model.addAttribute("clientes",clientes);
         */
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes",clientes);
        return "index";
    }
}
