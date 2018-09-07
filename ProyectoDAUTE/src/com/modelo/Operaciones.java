package com.modelo;

import java.util.ArrayList;

/**
 *
 * @author Isra Mendez
 */
public interface Operaciones {
    public boolean insertar(Object obj);
    public boolean modificar(Object obj);
    public boolean eliminar(Object obj);
    public ArrayList<Object[]> mostrar();
}
