public class fungsi_06 {

    static int[][]stock = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
    static int[]harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock[i]);
            System.out.println("Pendapatan RoyalGarden "+ (i + 1) + ": Rp " + pendapatan);

        }

        System.out.println("\n");
        banyakStock();
        System.out.println("\n");
        hitungStock();
    }

    public static int hitungPendapatan(int[]stock){
        int pendapatan = 0;
        for (int i = 0; i < stock.length; i++) {
            pendapatan = (stock[i] * harga[i]);
        }
        return pendapatan;
    }

    public static void banyakStock(){
        System.out.println("==== Stock Bunga ====");
        for (int j = 0; j < stock.length; j++) {
            int cabang = j;
            int[] banyakStock = stock[cabang];

            System.out.println("Total Stock RoyalGaarden "+ (cabang+1)+": ");
            for (int i = 0; i < banyakStock.length; i++) {
                System.out.print(banyakStock[i]+ " ");
            }
            System.out.println(" ");
        }
    }

    public static void hitungStock(){
        System.out.println("==== Pengurangan Stock Bunga ====");
        for (int i = 0; i < stock.length; i++) {
            int cabang = i;
            int[] banyakStock = stock[cabang];
            int[] pengurangan = {1,2,0,5};

            System.out.print("Total stock RoyalGarden "+ (cabang+1)+": ");
            
            for (int j = 0; j < banyakStock.length; j++) {
                banyakStock[j] -= pengurangan[j];
                System.out.print(banyakStock[j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
