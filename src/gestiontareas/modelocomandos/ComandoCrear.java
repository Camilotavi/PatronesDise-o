package gestiontareas.modelocomandos;

import gestiontareas.modelotareas.Tarea;

public class ComandoCrear implements Comando{
    private Tarea tarea;

    public ComandoCrear(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        tarea.crearTarea();
    }
}
