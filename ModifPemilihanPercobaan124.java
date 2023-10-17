import java.util.Scanner;
public class ModifPemilihanPercobaan124 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input24.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + hasil);
    }
}
