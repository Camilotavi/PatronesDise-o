package decoracionhotel.decoradores;

import decoracionhotel.habitacion.Decorador;
import decoracionhotel.habitacion.Habitacion;

public class DecoradorVino extends Decorador {
    public DecoradorVino(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con vino de alta calidad";
    }
}
