import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu;
        Scanner in = new Scanner(System.in);
        kalkulator t1 = new kalkulator();
        do{
            System.out.println("KALKULATOR SEDERHANA");
            System.out.println("1.PERKALIAN");
            System.out.println("2.PEMBAGIAN");
            System.out.println("3.PENGURANGAN");
            System.out.println("4.PENAMBAHAN");
            System.out.println("MASUKAN PILIHAN ANDA = ");
            menu=in.nextInt();
            if(menu==1){
                t1.perkalian();
            }else if(menu==2){
                t1.pembagian();
            } else if (menu==3) {
                t1.pengurangan();
            } else if (menu==4){
                t1.penjumlahan();
            }else {
                System.out.println("TERIMAKASIH !!!!!");
            }

        }while (menu!=4);
    }
}