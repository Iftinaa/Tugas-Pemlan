import java.util.ArrayList;
import java.util.Scanner;


public class datamahasiswa {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean addMore = true;
        while (addMore) {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            String alamat = scanner.nextLine();

            mahasiswa1.add(new Mahasiswa(nim, nama, alamat));

            System.out.print("Tambah lagi? (y/t): ");
            String response = scanner.nextLine();
            addMore = response.equalsIgnoreCase("y");
        }

        System.out.println("==================================");
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswa1) {
            System.out.println(mahasiswa.getNim() + " | " + mahasiswa.getNama() + " | " + mahasiswa.getAlamat());
        }
    }
}
