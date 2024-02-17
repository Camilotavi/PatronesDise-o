package decoracionHotel.main;


import decoracionHotel.decoradores.DecoradorFlores;
import decoracionHotel.decoradores.DecoradorVino;
import decoracionHotel.habitacion.Habitacion;
import decoracionHotel.habitacion.HabitacionBasica;

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
