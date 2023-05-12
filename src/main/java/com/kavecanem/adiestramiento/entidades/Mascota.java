package com.kavecanem.adiestramiento.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Guillote
 */
@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    private int num_cliente;
    private String nombrePerro;
    private String raza;
    private String comidas;
    private String duerme;
    private String frecPaseo;
    private String juega;
    private String paseo;
    private String dispoJug;
    @OneToOne
    private Tutor tutor;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombrePerro, String raza, String comidas, String duerme, String frecPaseo, String juega, String paseo, String dispoJug, Tutor tutor) {
        this.num_cliente = num_cliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.comidas = comidas;
        this.duerme = duerme;
        this.frecPaseo = frecPaseo;
        this.juega = juega;
        this.paseo = paseo;
        this.dispoJug = dispoJug;
        this.tutor = tutor;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getComidas() {
        return comidas;
    }

    public void setComidas(String comidas) {
        this.comidas = comidas;
    }

    public String getDuerme() {
        return duerme;
    }

    public void setDuerme(String duerme) {
        this.duerme = duerme;
    }

    public String getFrecPaseo() {
        return frecPaseo;
    }

    public void setFrecPaseo(String frecPaseo) {
        this.frecPaseo = frecPaseo;
    }

    public String getJuega() {
        return juega;
    }

    public void setJuega(String juega) {
        this.juega = juega;
    }

    public String getPaseo() {
        return paseo;
    }

    public void setPaseo(String paseo) {
        this.paseo = paseo;
    }

    public String getDispoJug() {
        return dispoJug;
    }

    public void setDispoJug(String dispoJug) {
        this.dispoJug = dispoJug;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_cliente=" + num_cliente + ", nombrePerro=" + nombrePerro + ", raza=" + raza + ", comidas=" + comidas + ", duerme=" + duerme + ", frecPaseo=" + frecPaseo + ", juega=" + juega + ", paseo=" + paseo + ", dispoJug=" + dispoJug + ", tutor=" + tutor + '}';
    }
    
    

    
}
