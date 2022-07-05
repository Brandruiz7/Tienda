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
 *
 * @author Brandon R
 */
@Data
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente; //id_cliente
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    
    
    //Se hace la referencia de id credito en la base de datos
    @JoinColumn(name="id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    private Credito credito;

    /**
     * Se agrega después de agregar o hacer referencia a credito.
     * @param nombre
     * @param apellidos
     * @param correo
     * @param telefono
     * @param credito
     */
    public Cliente(String nombre, String apellidos, String correo, String telefono, Credito credito) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.credito = credito;
    }
    
    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

}
