package com.kavecanem.adiestramiento.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Guillote
 */
@Entity
public class Tutor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_tutor;
    private String nombreTutor;
    private String telefono;
    private String direccion;
    private String observaciones;

    public Tutor() {
    }

    public Tutor(int id_tutor, String nombreTutor, String telefono, String direccion, String observaciones) {
        this.id_tutor = id_tutor;
        this.nombreTutor = nombreTutor;
        this.telefono = telefono;
        this.direccion = direccion;
        this.observaciones = observaciones;
    }

    public int getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Tutor{" + "id_tutor=" + id_tutor + ", nombreTutor=" + nombreTutor + ", telefono=" + telefono + ", direccion=" + direccion + ", observaciones=" + observaciones + '}';
    }

}
