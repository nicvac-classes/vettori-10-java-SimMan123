//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int i,n,m;
        System.out.print("inserire n");
        n=in.nextInt;
        int[] c = new int[n];
        int[] v = new int[n];
        String[] nomi = new String[n];
        m=0;
        for (i=0;i<n;i++) {
            System.out.print("inserire nomi " + i + "^ studente");
            nomi[i]= in.nextLine;
            c[i]=random(10);
            v[i]=ramdom(10);
            m=m+v[i];
        }
        m=m/n;
        for (i=0;i<n;i++) {
            if (v[i])>m {
                System.out.print(nomi[i] + " ha ottenuto un voto superiore alla media ");
                System.out.print("voto : " + v[i]);
            }
            if (c[i]>=6) {
                System.out.print(c[i] + " ha ottenuto crediti superiore alla media ");
                System.out.print("crediti " +  c[i]);
            }
        }

    
    }
}

