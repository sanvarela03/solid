/**
 * 
 */
package com.company.models.entity;

import com.company.models.entity.generic.Animal;

/**
 * @author USUARIO
 *
 */
public class Perro extends Animal {

	/**
	 * Metodos
	 */
	@Override
	public String alimentarse(String comida) {
		String mensaje = "ñum ñum " + comida;
		return mensaje;
	}

	@Override
	public String comunicarse() {
		String mensaje = "wof wof !";
		return mensaje;
	}

	@Override
	public void desplazarse() {
		// TODO Auto-generated method stub
		super.desplazarse();
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String tipoAnimal(String tipo) {

		return "soy un perro de tipo" + tipo;
	}

	@Override
	public String getTipoAlimentacion() {
		// TODO Auto-generated method stub
		return super.getTipoAlimentacion();
	}

	@Override
	public void setTipoAlimentacion(String tipoAlimentacion) {
		// TODO Auto-generated method stub
		super.setTipoAlimentacion(tipoAlimentacion);
	}

	/**
	 * Constructor
	 */
	public Perro() {
		setTipoAlimentacion("Carnivoro");
	}

	public Perro(String nombre) {
		setTipoAlimentacion("Carnivoro");
		setNombre(nombre);
	}

}
