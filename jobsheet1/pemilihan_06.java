import java.util.Scanner;
public class pemilihan_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tgs, kuis, uts, uas;
        
        System.out.println("=================================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================\n");
        System.out.print("Masukkan Nilai Tugas    : ");
        tgs = input.nextInt();
        System.out.print("Masukkan Nilai Kuis     : ");
        kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS      : ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS      : ");
        uas = input.nextInt();
        System.out.println("=================================");

        if (tgs<100 && kuis<100 && uts<100 && uas<100 ) {
            
            double nA = (tgs * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
            System.out.println("Nilai Akhir     : "+ nA);

            if (nA > 80 && nA <= 100) {
                System.out.println("Nilai Huruf     : A");
            } else if (nA > 73 && nA <= 80) {
                System.out.println("Nilai Huruf     : B+");
            } else if(nA > 65 && nA <= 73){
                System.out.println("Nilai Huruf     : B");
            } else if(nA > 60 && nA <= 65){
                System.out.println("Nilai Huruf     : C+");
            } else if(nA > 50 && nA <= 60){
                System.out.println("Nilai Huruf     : C");
            } else if(nA > 39 && nA <= 50){
                System.out.println("Nilai Huruf     : D");
            } else{
                System.out.println("Nilai Huruf     : E");
            }

            System.out.println("=================================\n");

            if (nA <= 50) {
                System.out.println("Maaf Anda Tidak Lulus");
            } else {
                System.out.println("Selamat Anda Lulus");
            }

        } else {
            System.out.println("Nilai Tidak Valid");
        }
    }
}