/**
 * 
 */
package com.company.models.entity;

import com.company.models.entity.generic.Animal;

/**
 * @author Santiago
 *
 */
public class Pez extends Animal {

	/**
	 * Metodos
	 */
	@Override
	public String alimentarse(String comida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void desplazarse() {
		System.out.println("Nadando ando...");
	}

	@Override
	public void jugar() {
		System.out.println("Soy un pez y estoy jugando");

	}

	@Override
	public String tipoAnimal(String tipo) {
		
		return "soy un pez de tipo"+tipo;
	}

	/**
	 * Constructores
	 */
	public Pez() {

	}

	public Pez(String nombre) {
		setNombre(nombre);
	}
}
