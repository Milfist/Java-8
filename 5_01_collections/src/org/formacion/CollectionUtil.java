package org.formacion;

import java.util.List;
import java.util.Map;

public class CollectionUtil {

	/**
	 * Modifica la lista orignial de personas eliminando las personas que 
	 * tengan un nombre con un espacio en blanco 
	 */
	public void eliminaNombresConEspacios(List<Persona> original) {
		original.removeIf(persona -> persona.getNombre().indexOf(' ') != -1);
	}
	
	/**
	 * Modifica la lista con pasando todos los nombres a mayúscula (nombre, primer y segundo apellido)
	 * Id con cuidado con el segundo apellido, que es optional!
	 */
	public void pasarAMayusculas (List<Persona> original) {
		original.replaceAll(persona -> new Persona(persona.getNombre().toUpperCase(),
												   persona.getApellido1().toUpperCase(),
												   persona.getApellido2().map(p -> p.toUpperCase())));
	}
	
	
	/**
	 * Devuelve una cadena con el contenido del map
	 * si map es
	 * [ "prod1", 4
	 *   "prod2", 5 ]
	 * El metodo debe devolver "prod1:4,prod2:5," 
	 */
	public String aTexto (Map<String, Integer> factura) {
		StringBuilder res = new StringBuilder();
		
		factura.forEach((k, v) -> res.append(k + ":" + v +","));
		
		return res.toString();
	}
}
