package org.formacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Para las soluciones de estos ejercicios utiliza streams, las 
 * operaciones intermedias que necesites y una operaci�n terminal
 * con una estructura mutante.
 */
public class ReduccionesUtil {

	/**
	 * Devuelve una coleccion con los Strings de la lista original con:
	 *  - los nulls eliminados del resultado
	 *  - el resto pasado a may�sculas.
	 *  
	 *  Es decir, si pasamos
	 *  {"a",null,"b",null} debe devolver {"A","B"}
	 *  
	 */
	public Collection<String> obtenSinNulosYMayusculas(List<String> original) {
		
		Collection<String> result = new ArrayList<String>();
		
		original.stream()
				.filter(obj -> obj != null)
				.map(obj -> obj.toUpperCase())
				.forEach(obj -> result.add(obj));
		
		return result;
	}

	/**
	 * Devolver un array de dos enteros. En la posicion 0 con 
	 * el numero de pares encontrado en la lista de numeros y en 
	 * la posicion 1 el numero de impares
	 * 
	 * Por ejemplo, 
	 * si numeros es { 0, 1, 2, 4 } debe devolver [3,1]
	 */
	public int[] paresImpares (List<Integer> numeros) {
		
		/* Ir acumulando en la posicion 0 el recuento de pares
		 * y en la posicion 1 el recuento de impares
		 */
		int[] acumular = {0,0};
		
//		 Modo bueno de agrupar, ejercicios futuros
//		 numeros.stream().collect(Collectors.groupingBy(ReduccionesUtil::isOdd));
		
		// Cualquier entero dividido entre 2 da como resto 0 o 1.
		numeros.stream().forEach(it -> acumular[it % 2] += 1);
		
		return acumular;
		
	}
	
	public static boolean isOdd(Integer num) {
		return num%2 != 0;
	}
	
}
