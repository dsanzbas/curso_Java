public class Temperatura {
    public double celsiusToFarenheit(double grados) {
        final int i = 32;
        double c = (1.8 * grados) + i;
        return c;
    }
    public double farenheitToCelsius(double grados) {
        final double i = 1.8;
        double f = (grados - 32) / i;
        return f;
    }
}
