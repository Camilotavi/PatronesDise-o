package GestionTareas.Main;

import GestionTareas.Invoker.Invoker;
import GestionTareas.ModeloComandos.Comando;
import GestionTareas.ModeloComandos.ComandoCompletar;
import GestionTareas.ModeloComandos.ComandoCrear;
import GestionTareas.ModeloTareas.Tarea;

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
