public class Temperatura {
    private double celsius;
    private double farenheit;

    public double celsiusToFarenheit(double c) {
        final int i = +32;
        farenheit = (1.8 * c) + i;
        return farenheit;
    }
    public double farenheitToCelsius(double f) {
        final double i = 1.8;
        celsius = (f - 32) / i;
        return celsius;
    }
}
