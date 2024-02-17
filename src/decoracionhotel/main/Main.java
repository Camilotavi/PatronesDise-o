package decoracionhotel.main;


import decoracionhotel.decoradores.DecoradorFlores;
import decoracionhotel.decoradores.DecoradorVino;
import decoracionhotel.habitacion.Habitacion;
import decoracionhotel.habitacion.HabitacionBasica;

public class Main {

    public static void main(String[] args){

        Habitacion habitacion= new HabitacionBasica();
        System.out.println(habitacion.describeHabitacion());


        habitacion= new DecoradorFlores(habitacion);
        System.out.println(habitacion.describeHabitacion());
        //Añade flores


        habitacion= new DecoradorVino(habitacion);
        System.out.println(habitacion.describeHabitacion());
        //Añade flores y vino
    }
}
