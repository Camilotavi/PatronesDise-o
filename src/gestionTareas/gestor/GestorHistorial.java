package gestionTareas.gestor;

import gestionTareas.memento.Memento;

import java.util.ArrayList;

public class GestorHistorial {

    private ArrayList<Memento> marcadores = new ArrayList<Memento>();

    public void agregarMarcador(Memento memento){
        marcadores.add(memento);
    }

    public Memento obtenerMarcador(int index){
        return marcadores.get(index);
    }

    public int obtenerLargoMarcadores() {
        return marcadores.size();
    }
}
