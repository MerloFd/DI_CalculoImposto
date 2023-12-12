package br.com.merlofd.dinjection;

public class app {
    public static void main (String[] Args){
        PayService ps = new PayService(new MGDeductionService());

        double tax = ps.tax(1000.00);
        System.out.println(tax);
    }
}
