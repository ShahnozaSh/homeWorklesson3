package com.company;

public class Main {

    public static void main(String[] args) {
        double[] num = {12.3, 32.5, -13.5, 5.6, 9.5, -6.7, 8.3, 2.1, -23.5, 24.6, -12.3, -35.7, -18.4, 32.6, 14.7};
        int positive =0;
        double summa=0;
        boolean negative= false;
        for (double r : num) {
            if (r < 0) {
                negative=true;
                continue;

            } else if (negative && r>0 ){
                summa+=r;
                positive++;
            }
            System.out.println(summa);
            System.out.println(positive);
            System.out.println("Avarage summery " + summa/positive);
            }

        }
    }
