package Capitulo_2.Ex2_2;

class ConversorDivisas {
    double tipo_cambio;
    double cambio;
    double imp_libras;
    double imp_euros;
    //Constructor Divisas 1
    ConversorDivisas() {
        tipo_cambio = 0.85;
    }
    //Constructor Divisas 2
    ConversorDivisas(double tc) {
        tipo_cambio = tc;
    }

    public double getTipo_cambio() {
        return tipo_cambio;
    }

    public double librasToEuros (double imp_libras) {
        cambio = imp_libras * tipo_cambio;
        return cambio;
    }
    public double eurosTolibras (double imp_euros) {
        cambio = imp_euros * tipo_cambio;
        return cambio;
    }
}
