import java.util.Scanner;

public class bangundatar {

    private float r;
    private double phi = 3.14;
    private int s, p, l,a,t;

    public void persegiluas(){
        Scanner a = new Scanner(System.in);
        int hasil;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                LUAS PERSEGI                        ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI SISI = ");
        s = a.nextInt();
        hasil = s * s;
        System.out.println();
        System.out.printf("LUAS PERSEGI       = " + hasil);
        System.out.println();

    }
    public void persegi_panjangluas(){
        Scanner d = new Scanner(System.in);
        int hasil4;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("           LUAS  PERSEGI PANJANG                 ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI PANJANG = ");
        p = d.nextInt();
        System.out.printf("MASUKAN NILAI LEBAR   = ");
        l = d.nextInt();
        hasil4 = p*l;
        System.out.println();
        System.out.printf("LUAS PERSEGI PANJANG  = " + hasil4);
        System.out.println();
    }
    public void segitigaluas(){
        Scanner f = new Scanner(System.in);
        double hasil5;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                  LUAS SEGITIGA                     ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN NILAI ALAS    = ");
        a = f.nextInt();
        System.out.printf("MASUKAN NILAI TINGGI  = ");
        t = f.nextInt();
        hasil5 = 0.5*a*t;
        System.out.println();
        System.out.printf("LUAS     SEGITIGA     = " + hasil5);
        System.out.println();
    }
    public void lingkaranluas(){
        Scanner g = new Scanner(System.in);
        double hasil5;
        System.out.println();
        System.out.println("____________________________________________________");
        System.out.println("                  LUAS SEGITIGA                     ");
        System.out.println("____________________________________________________");
        System.out.printf("MASUKAN JARI JARI LINGKARAN    = ");
        r = g.nextInt();
        hasil5 = phi*r*r;
        System.out.println();
        System.out.printf("LUAS     LINGKARAN             = " + hasil5);
        System.out.println();
    }

}
