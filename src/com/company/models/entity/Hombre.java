/**
 * 
 */
package com.company.models.entity;

import com.company.models.entity.generic.Humano;

/**
 * @author USUARIO
 *
 */
public class Hombre extends Humano {

	@Override
	public String alimentarse(String comida) {
		
		return "Estoy cominedo "+comida;
	}

	@Override
	public void bailar() {
		System.out.println("Yo no sé bailar");

	}

	@Override
	public String comunicarse() {
		
		return "...";
	}

	@Override
	public void desplazarse() {
		// TODO Auto-generated method stub
		super.desplazarse();
	}

	@Override
	public boolean dormir() {
		// TODO Auto-generated method stub
		return super.dormir();
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String tocarInstrumento(String instrumento) {
		return "estoy tocando "+instrumento;
	}

	@Override
	public void trabajar() {
		System.out.println("no molestar estoy trabajando");

	}
	
	
	public void tomarCerveza() {
		System.out.println("tomando una cerveza");
	}
	/**
	 * Constructores
	 */
	
	public Hombre() {
		
	}
	public Hombre(String nombre, String tipoIdentificacion, int identificacion) {
		setNombre(nombre);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
	}

}
