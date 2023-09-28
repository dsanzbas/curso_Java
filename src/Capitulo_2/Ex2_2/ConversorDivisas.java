package Capitulo_2.Ex2_2;

class ConversorDivisas {
    double tipo_cambio;
    double cambio;
    double imp_libras;
    double imp_euros;
    double  cambio;
    ConversorDivisas() {
        tipo_cambio = 0.85;
    }
    ConversorDivisas(double tc) {
        tipo_cambio = tc;
    }
    public void setLibras(double lb) {
        imp_libras = lb;
    }
    public double getLibras() {
        return imp_libras;
    }
    public void setEuros(double eu) {
        imp_libras = eu;
    }
    public double getEuros() {
        return imp_euros;
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
