package GestionTareas.ModeloTareas;

public class Tarea {
    private String descripcionTarea;
    private boolean tareaCompletada;

    public Tarea(String descripcion){
        this.descripcionTarea=descripcion;
        this.tareaCompletada=false;
    }

    public void crearTarea(){
        System.out.println("Creando Tarea...");
    }
    public void editarTarea(){
        System.out.println("Editando Tarea...");
    }
    public void borrarTarea(){
        System.out.println("Borrando tarea...");
    }
    public void completarTarea(){
        System.out.println("Completando tarea...");
        this.tareaCompletada=true;

    }


    public void getTarea(){
        System.out.println( "Tarea -> Descripcion = "+this.descripcionTarea+" || Completada? = "+ this.tareaCompletada);
    }
}
