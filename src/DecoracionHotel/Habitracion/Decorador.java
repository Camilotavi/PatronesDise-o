package DecoracionHotel.Habitracion;

public abstract class Decorador implements Habitacion {
    private Habitacion habitacion;

    public Decorador(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String describeHabitacion() {
        return habitacion.describeHabitacion();
    }
}
