package Capitulo_2.Ex2_3;

class MiNumero_Main
{
    public static void main(String[] args)
    {
        int input_num  = 0;
        int num_mult   = 0;
        int inp_numero = 11;
        int out_numero = 0;

        MiNumero mi_num;
        mi_num = new MiNumero();

        out_numero = mi_num.getCuadruple();
        System.out.println("4 veces el número " + inp_numero + " es " + out_numero);

    }
}
