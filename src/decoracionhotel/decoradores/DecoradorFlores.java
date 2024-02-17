package decoracionhotel.decoradores;

import decoracionhotel.habitacion.Decorador;
import decoracionhotel.habitacion.Habitacion;

public class DecoradorFlores extends Decorador {
    public DecoradorFlores(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con flores frescas";
    }
}
