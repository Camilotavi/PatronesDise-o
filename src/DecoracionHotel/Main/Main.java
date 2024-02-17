package DecoracionHotel.Main;


import DecoracionHotel.Decoradores.DecoradorFlores;
import DecoracionHotel.Decoradores.DecoradorVino;
import DecoracionHotel.Habitracion.Habitacion;
import DecoracionHotel.Habitracion.HabitacionBasica;

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