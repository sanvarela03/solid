package com.company.models.imprimir;


import com.company.models.entity.*;
import com.company.models.entity.generic.Animal;
import com.company.models.interfaces.AccionesGeneral;
import com.company.models.interfaces.AccionesHumano;

public class Imprimir {

    public static AccionesGeneral IAnimal;
    public static AccionesHumano IHombre = new Hombre("Santiago", "CC", 1016104565);
    public static AccionesHumano IMujer = new Mujer("Diana", "TI", 3241341);

    public static AccionesGeneral CrearPerro(AccionesGeneral IAnimal) {
        IAnimal = new Perro("Firulais");
        return IAnimal;
    }

    public static AccionesGeneral CrearPez(AccionesGeneral IAnimal) {
        IAnimal = new Pez("Nemo");
        return IAnimal;
    }

    public static void main(String[] args) {
        Animal animal = (Perro) CrearPerro(IAnimal);

        System.out.println(animal.alimentarse("croquetas"));
        System.out.println(animal.comunicarse());
        System.out.println(animal.getTipoAlimentacion());

        animal = (Pez) CrearPez(IAnimal);
        animal.desplazarse();
        animal.jugar();

        if (animal.dormir()) {
            System.out.println("zzzz");
        } else {
            System.out.println("estoy despierto");
        }

        Hombre hombre = (Hombre) IHombre;
        hombre.bailar();
        System.out.println(hombre.comunicarse());
        System.out.println(hombre.tocarInstrumento("guitarra"));
        hombre.trabajar();

        Mujer mujer = (Mujer) IMujer;
        mujer.bailar();
        mujer.comunicarse();
        mujer.tocarInstrumento("violin");
        mujer.trabajar();
        mujer.estudiar();

    }
}
