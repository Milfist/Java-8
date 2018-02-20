package org.formacion;

import java.util.Collection;
import java.util.Iterator;

public interface Agrupador {

	void add(Object elemento);

	int numeroElementos();

	default void addAll(Collection<Object> c) {
		for (Iterator<Object> iterator = c.iterator(); iterator.hasNext();) {
			this.add(iterator.next());
		}
	}

}
