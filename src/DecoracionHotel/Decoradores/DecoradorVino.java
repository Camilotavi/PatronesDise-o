package DecoracionHotel.Decoradores;

import DecoracionHotel.Habitracion.Decorador;
import DecoracionHotel.Habitracion.Habitacion;

public class DecoradorVino extends Decorador {
    public DecoradorVino(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con vino de alta calidad";
    }
}
