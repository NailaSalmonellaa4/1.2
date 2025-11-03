
    import java.util.Scanner;

public class GanjilGenap12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        // Menentukan apakah bilangan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        input.close(); // Menutup scanner untuk mencegah kebocoran resource
    }
}
    

