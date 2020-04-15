/**
 * 
 */
package com.company.models.entity;

import com.company.models.entity.generic.Humano;

/**
 * @author USUARIO
 *
 */
public class Mujer extends Humano {

	/**
	 * Metodos
	 */
	@Override
	public String alimentarse(String comida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void bailar() {
		
		System.out.println("estoy bailando salsa");
	}

	@Override
	public String comunicarse() {
		
		return "bla bla ......";
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
		
		System.out.println("Aprendiendo ...");

	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String tocarInstrumento(String instrumento) {
		
		return "Me gusta tocar "+instrumento;
	}

	@Override
	public void trabajar() {
		System.out.println("Estoy trabajando");	
	}
	
	public void maquillarse() {
		System.out.println("Me estoy maquillando");
	}

	/**
	 * Constructores
	 */
	public Mujer() {

	}

	public Mujer(String nombre, String tipoIdentificacion, int identificacion) {
		setNombre(nombre);
		setIdentificacion(identificacion);
		setTipoIdentificacion(tipoIdentificacion);
	}

}
