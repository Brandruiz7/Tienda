/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Esta clase se referencia para la tabla de credito de la base
 * @author Brandon R
 */
@Data
@Entity
@Table(name="credito")
public class Credito  implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito") //Se referencia el id de la columna
    private Long idCredito; // id_credito
    private double limite;

    /**
     * Constructor vacío
     */
    public Credito() {
    }

    /**
     * Construccción de la variable limite.
     * 
     * @param limite
     */
    public Credito(double limite) {
        this.limite = limite;
    }
    
    
}
