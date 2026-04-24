import java.util.Scanner;

public class TK01_B04 {
    static String[] daftarData = new String[100];
    static int jumlahData = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean berjalan = true;

        System.out.println("=========================================");
        System.out.println("   PROGRAM MANAJEMEN DATA SEDERHANA");
        System.out.println("=========================================");

        while (berjalan) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanData();
                    break;
                case 2:
                    System.out.print("Masukkan data baru: ");
                    String dataBaru = scanner.nextLine();
                    tambahData(dataBaru);
                    break;
                case 3:
                    tampilkanData();
                    if (jumlahData > 0) {
                        System.out.print("Masukkan nomor data yang ingin dihapus: ");
                        int nomorHapus = scanner.nextInt();
                        hapusData(nomorHapus);
                    }
                    break;
                case 4:
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    static void tampilkanData() {
        System.out.println("\n--- Daftar Data Saat Ini ---");
        if (jumlahData == 0) {
            System.out.println("Data masih kosong.");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". " + daftarData[i]);
            }
        }
        System.out.println("----------------------------");
    }

    static void tambahData(String data) {
        if (jumlahData < daftarData.length) {
            daftarData[jumlahData] = data;
            jumlahData++;
            System.out.println("Notifikasi: Data '" + data + "' berhasil ditambahkan!");
        } else {
            System.out.println("Peringatan: Kapasitas penyimpanan penuh!");
        }
    }

    static void hapusData(int nomor) {
        int index = nomor - 1;
        if (index >= 0 && index < jumlahData) {
            String dataDihapus = daftarData[index];
            for (int i = index; i < jumlahData - 1; i++) {
                daftarData[i] = daftarData[i + 1];
            }
            daftarData[jumlahData - 1] = null;
            jumlahData--;
            System.out.println("Notifikasi: Data '" + dataDihapus + "' berhasil dihapus!");
        } else {
            System.out.println("Peringatan: Nomor data tidak ditemukan!");
        }
    }
}