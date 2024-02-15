package ConstruccionMenus.Builder;

import ConstruccionMenus.Menus.Menu;

public class Director {
    public Menu construct(Builder builder) {
        builder.constryeEntrada("Nachos");
        builder.construyePrincipal("Pasta carbonara");
        builder.construyeBebida("Limonada");
        builder.construyePostre("Pie de limon");
        return builder.getMenu();
    }
}
