package decoracionHotel.decoradores;

import decoracionHotel.habitacion.Decorador;
import decoracionHotel.habitacion.Habitacion;

public class DecoradorChocolate extends Decorador {
    public DecoradorChocolate(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con chocolate";
    }
}
