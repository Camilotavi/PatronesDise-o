package DecoracionHotel.Decoradores;

import DecoracionHotel.Habitracion.Decorador;
import DecoracionHotel.Habitracion.Habitacion;

public class DecoradorFlores extends Decorador {
    public DecoradorFlores(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con flores frescas";
    }
}
