package decoracionhotel.decoradores;

import decoracionhotel.habitacion.Decorador;
import decoracionhotel.habitacion.Habitacion;

public class DecoradorChocolate extends Decorador {
    public DecoradorChocolate(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String describeHabitacion() {
        return super.describeHabitacion() + " con chocolate";
    }
}
