package decoracionHotel.decoradores;

import decoracionHotel.habitacion.Decorador;
import decoracionHotel.habitacion.Habitacion;

public class DecoradorVino extends Decorador {
    public DecoradorVino(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con vino de alta calidad";
    }
}
