class Temperatura_main
{
    public static void main(String[] args)
    {
        Temperatura convTemp;
        convTemp = new Temperatura();

        convTemp.setCelsius(100);
        convTemp.setFarenheit(212);

        System.out.println(convTemp.getCelsius() + " grados Celsius son " + convTemp.celsiusToFarenheit() + " grados Farenheit");
        System.out.println(convTemp.getFarenheit() + " grados Farenheit son " + convTemp.farenheitToCelsius() + " grados Celsius");
    }
}
