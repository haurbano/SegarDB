package com.moviles.salt.dbfacil.entidades;

import com.orm.SugarRecord;

/**
 * Created by Diana M on 01/10/2015.
 */
public class Carro extends SugarRecord {

    String referencia,color,marca,imagen;
    int modelo;

    public Carro(String referencia, String color, String marca, String imagen, int modelo) {
        this.referencia = referencia;
        this.color = color;
        this.marca = marca;
        this.imagen = imagen;
        this.modelo = modelo;
    }

    public Carro() {
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
