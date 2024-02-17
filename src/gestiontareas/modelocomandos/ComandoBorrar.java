package gestiontareas.modelocomandos;

import gestiontareas.modelotareas.Tarea;

public class ComandoBorrar implements Comando{
    private Tarea tarea;

    public ComandoBorrar(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        tarea.borrarTarea();
    }
}
