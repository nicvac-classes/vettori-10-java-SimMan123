
import java.util.Scanner;

import java.util.Random;
class Esercizio {
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        Random r = new Random();
        int i,n,m;
        System.out.print("inserire n");
        n=in.nextInt();
        int[] c = new int[n];
        int[] v = new int[n];
        String[] nomi = new String[n];
        m=0;
        for (i=0;i<n;i++) {
            System.out.print("inserire nomi " + i + "^ studente");
            nomi[i]= in.nextLine();
            c[i]=r.nextInt(10);
            v[i]=r.nextInt(10);
            m=m+v[i];
        }
        m=m/n;
        for (i=0;i<n;i++) {
            if (v[i]>m && c[i]>=6) {
                System.out.print(nomi[i] + " ha ottenuto un voto  e crediti superiore alla media ");
                System.out.print("voto : " + v[i] + " crediti : " + c[i] );
            }
           
            }
        }

    
    }
}

