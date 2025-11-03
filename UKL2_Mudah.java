import java.util.Scanner;

public class UKL2_Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        // Bagian 2: Menentukan Ganjil atau Genap
        
        System.out.println("\n--- CEK BILANGAN GANJIL / GENAP ---");
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan GENAP");
        } else {
            System.out.println(bilangan + " adalah bilangan GANJIL");
        }

        input.close();
    }
}
    
