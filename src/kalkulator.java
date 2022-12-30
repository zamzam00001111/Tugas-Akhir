import java.util.Scanner;

public class kalkulator implements proses{
    private int bil1;
    private int bil2;






    @Override
    public void penjumlahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MASUKAN ANGKA PERTAMA = ");
        bil1= sc.nextInt();
        System.out.println("MASUKAN ANGKA KEDUA = ");
        bil2= sc.nextInt();
        System.out.println("HASIL = "+(bil1+bil2));
    }

    @Override
    public void pengurangan() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("MASUKAN ANGKA PERTAMA = ");
        bil1= sc2.nextInt();
        System.out.println("MASUKAN ANGKA KEDUA = ");
        bil2= sc2.nextInt();
        System.out.println("HASIL = "+(bil1-bil2));
    }

    @Override
    public void perkalian() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("MASUKAN ANGKA PERTAMA = ");
        bil1= sc3.nextInt();
        System.out.println("MASUKAN ANGKA KEDUA = ");
        bil2= sc3.nextInt();

        System.out.println("HASIL = "+(bil1*bil2));
    }

    @Override
    public void pembagian() {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("MASUKAN ANGKA PERTAMA = ");
        bil1= sc4.nextInt();
        System.out.println("MASUKAN ANGKA KEDUA = ");
        bil2= sc4.nextInt();
        System.out.println("HASIL = "+(bil1/bil2));
    }
}