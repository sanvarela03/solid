package com.company.models.entity.generic;


import com.company.models.interfaces.AccionesGeneral;
import com.company.models.interfaces.AccionesHumano;

import java.security.SecureRandom;


public abstract class Humano implements AccionesHumano, AccionesGeneral {

    /**
     * Atributos
     */

    private int identificacion;
    private String nombre;
    private String tipoIdentificacion;

    /**
     * Metodos
     */
    @Override
    public abstract String alimentarse(String comida);

    @Override
    public abstract void bailar();

    @Override
    public abstract String comunicarse();

    @Override
    public void desplazarse() {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean dormir() {

        return new SecureRandom().nextBoolean();

    }

    @Override
    public abstract void estudiar();

    @Override
    public abstract void jugar();

    @Override
    public abstract String tocarInstrumento(String paremetroSinDefinir);

    @Override
    public abstract void trabajar();

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

}
