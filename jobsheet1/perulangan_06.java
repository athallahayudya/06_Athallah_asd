import java.util.Scanner;
public class perulangan_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim;
        int n, i;

        System.out.print("Masukkan NIM    : ");
        nim = input.nextLine();

        n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        } 
        System.out.print("n = " + n + "\n");

        for (i=1; i<=n; i++) {
            if (i == 6 || i ==10) {
                continue;
            } else if (i % 2 != 0) {
                System.out.print(" * ");
            }else{
            System.out.print(i + " ");
          }
        }
    }
}

