package Capitulo_2.Ex2_3;

public class MiNumero {
    private int mn;

    MiNumero () {mn = 0;}
    MiNumero (int num) {mn = num;}

    public void cambiaNumero (int nuevo_num) {mn = nuevo_num;}
    public void suma         (int suma_num)  {mn = mn + suma_num;}
    public void resta        (int resta_num) {mn = mn + resta_num;}
    public int  getValor     ()              {return mn;}
    public int  getDoble     ()              {int i = mn * 2; return i;}
    public int  getTriple    ()              {int i = mn * 3; return i;}
    public int  getCuadruple ()              {int i = mn * 4; return i;}
}
