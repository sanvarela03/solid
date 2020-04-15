package com.company.models.entity.generic;


import com.company.models.interfaces.AccionesGeneral;

import java.security.SecureRandom;

/**
 * @author Santiago
 */
public abstract class Animal implements AccionesGeneral {

    /**
     * Atributos
     */
    private String nombre;
    private String tipoAlimentacion;

    /**
     * Metodos
     */
    @Override
    public abstract String alimentarse(String comida);

    @Override
    public String comunicarse() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void desplazarse() {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean dormir() {
        return new SecureRandom().nextBoolean();
    }

    @Override
    public abstract void jugar();

    public String tipoAnimal(String tipo) {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void reproducir() {

    }


}
