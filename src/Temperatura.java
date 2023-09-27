public class Temperatura {
    double grados;
    double f;
    double c;

    public double celsiusToFarenheit(double grados) {
        final int i = 32;
        c = (1.8 * grados) + i;
        return c;
    }
    public double farenheitToCelsius(double grados) {
        final double i = 1.8;
        f = (grados - 32) / i;
        return f;
    }
}
