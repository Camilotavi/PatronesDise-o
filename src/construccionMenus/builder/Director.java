package construccionMenus.builder;

import construccionMenus.menus.Menu;

public class Director {
    public Menu construct(Builder builder) {
        builder.constryeEntrada("Nachos");
        builder.construyePrincipal("Pasta carbonara");
        builder.construyeBebida("Limonada");
        builder.construyePostre("Pie de limon");
        return builder.getMenu();
    }
}
