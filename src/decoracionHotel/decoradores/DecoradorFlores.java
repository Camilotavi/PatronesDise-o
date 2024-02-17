package decoracionHotel.decoradores;

import decoracionHotel.habitacion.Decorador;
import decoracionHotel.habitacion.Habitacion;

public class DecoradorFlores extends Decorador {
    public DecoradorFlores(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con flores frescas";
    }
}
