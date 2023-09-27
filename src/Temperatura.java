public class Temperatura {
    private double grados;
    double f;
    double c;

    public double celsiusToFarenheit(double c) {
        final int i = +32;
        grados = (1.8 * c) + i;
        return c;
    }
    public double farenheitToCelsius(double f) {
        final double i = 1.8;
        grados = (f - 32) / i;
        return f;
    }
}
