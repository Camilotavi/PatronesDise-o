package gestiontareas.main;

import gestiontareas.invoker.Invoker;
import gestiontareas.modelocomandos.Comando;
import gestiontareas.modelocomandos.ComandoCompletar;
import gestiontareas.modelocomandos.ComandoCrear;
import gestiontareas.modelotareas.Tarea;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Invoker invocador =new Invoker();

        Tarea tarea = new Tarea("Realizar ejercicios calculo");


        Comando comandoCrearTarea = new ComandoCrear(tarea);
        Comando comandoCompletarTarea = new ComandoCompletar(tarea);

        invocador.ejecutarComando(comandoCrearTarea);

        tarea.getTarea();

        Thread.sleep(5000);

        invocador.ejecutarComando(comandoCompletarTarea);

        tarea.getTarea();
    }
}
