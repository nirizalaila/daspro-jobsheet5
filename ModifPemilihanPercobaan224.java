import java.util.Scanner;
public class ModifPemilihanPercobaan124 {
    public static void main (String[]args){
        Scanner input24 = new Scanner(System.in);
        System.out.print("Nilai uas   : ");
        float uas = input24.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input24.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input24.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input24.nextFloat();
        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String message, nilaiHuruf;
        double nilaiSetara;
        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            message = "Sangat Baik";
        } else if (total > 73 && total <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            message = "Lebih dari Baik";
        } else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            message = "Baik";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            message = "Lebih dari Cukup";        
        } else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            message = "Cukup";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            message = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            message = "Gagal";
        }
        System.out.println("Nilai Akhir = " + total + ", Nilai Huruf = " + nilaiHuruf + ", Nilai Setara = " + nilaiSetara + ", Kualifikasi = " + message);
    }
}