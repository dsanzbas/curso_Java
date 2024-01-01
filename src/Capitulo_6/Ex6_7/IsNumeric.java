package Capitulo_6.Ex6_7;

public class IsNumeric {
    boolean numeric = false;

    public boolean Numeric (String input) {
        if (input.matches("[0-9]+") ) {
            numeric = true;
        }
        return numeric;
    }
}
