import java.util.Scanner;
public class Ganjil {
    public static void main(String[] args) {
        /* menghitung bilangan ganjil/genap */
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int Angka = inputan.nextInt();

        if(Angka % 2 ==0) {
            System.out.println("Bilangan Genap");
        }else {
            System.out.print("Bilangan Ganjil");
        }
        inputan.close();
    }
}
