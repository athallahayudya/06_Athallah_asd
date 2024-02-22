import java.util.Scanner;

public class tugas2_06 {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("====================================");
        System.out.println("Pilih Rumus: ");
        System.out.println("====================================");
        System.out.println("1. Kecepatan (v)");
        System.out.println("2. Jarak (s)");
        System.out.println("3. Waktu (t)");
        System.out.print("Masukkan pilihan (masukkan angka): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                kecepatan();
                break;
            case 2:
                jarak();
                break;
            case 3:
                waktu();
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
        }
    }

    public static void kecepatan() {
        double j,k,w;
        System.out.println("=====================");
        System.out.println("1. Kecepatan (v)");
        System.out.println("=====================");

        System.out.print("Masukkan jarak (dalam Kilo Meter): ");
        j = input.nextDouble();

        System.out.print("Masukkan waktu (dalam jam): ");
        w = input.nextDouble();

        k = j / w;

        System.out.println("Kecepatan yang digunakan: " + k + " KM/Jam");
    }

    public static void jarak() {
        double j,k,w;
        System.out.println("-----------------------------------");
        System.out.println("2. Jarak (s)");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan kecepatan (dalam KM/jam): ");
        k = input.nextDouble();

        System.out.print("Masukkan waktu (dalam jam): ");
        w = input.nextDouble();

        j = k * w;

        System.out.println("Jarak yang di tempuh: " + j + " KM");
    }

    public static void waktu() {
        double j,k,w;
        System.out.println("-----------------------------------");
        System.out.println("3. Waktu (t)");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan jarak (dalam KM): ");
        j = input.nextDouble();

        System.out.print("Masukkan kecepatan (dalam KM/jam): ");
        k = input.nextDouble();

        w = j / k;

        System.out.println("Waktu yang dibutuhkan: " + w + " jam");
    }
}

