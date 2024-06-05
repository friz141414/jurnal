import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lomba {
    private TreeMap<Integer, String> data;

    public Lomba() {
        data = new TreeMap<>();
    }

    public void tambahData(String RT, String nama, int nilai) {
        String key = RT + ", nama = " + nama;
        if (!data.containsKey(nilai) || !data.get(nilai).equals(key)) {
            data.put(nilai, key);
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("gagal");
        }
    }

    public void cariData(String RT, String nama, int nilai) {
        String key = RT + ", nama = " + nama + nilai;
        if (data.containsValue(key)) {
            System.out.println("Data telah dimasukkan");
        } else {
            System.out.println("Data tidak ditemukan, belum dimasukkan");
        }
    }

    public void tampilkanPemenang() {
        if (data.isEmpty()) {
            System.out.println("Data tidak ditemukan, belum dimasukkan");
        } else {
            System.out.println("Urutan Peserta");
            for (Map.Entry<Integer, String> entry : data.entrySet()) {
                System.out.println("Asal RT = " + entry.getValue() + ", nilai = " + entry.getKey());
            }

            Map.Entry<Integer, String> pemenang = data.lastEntry();
            System.out.println("Pemenang");
            System.out.println("Asal RT = " + pemenang.getValue() + ", nilai = " + pemenang.getKey());
        }
    }

    public static void main(String[] args) {
        Lomba lomba = new Lomba();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nmasukkan pilihan menu");
            System.out.println("1. Input data peserta lomba");
            System.out.println("2. Cari data");
            System.out.println("3. Pemenang lomba");
            System.out.println("4. Keluar");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan RT, nama dan nilai");
                    String RT = scanner.nextLine();
                    String nama = scanner.nextLine();
                    int nilai = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi newline
                    lomba.tambahData(RT, nama, nilai);
                    break;
                case 2:
                    System.out.println("Masukkan RT, nama dan nilai yang dicari");
                    String cariRT = scanner.nextLine();
                    String cariNama = scanner.nextLine();
                    int cariNilai = scanner.nextInt();
                    lomba.cariData(cariRT, cariNama, cariNilai);
                    break;
                case 3:
                    lomba.tampilkanPemenang();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("pilihan tidak ada, coba lagi");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
