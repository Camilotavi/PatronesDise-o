package DecoracionHotel.Decoradores;

import DecoracionHotel.Habitracion.Decorador;
import DecoracionHotel.Habitracion.Habitacion;

public class DecoradorChocolate extends Decorador {
    public DecoradorChocolate(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con chocolate";
    }
}
