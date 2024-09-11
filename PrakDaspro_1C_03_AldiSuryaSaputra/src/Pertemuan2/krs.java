package Pertemuan2;

public class krs {
    public class RencanaStudiMahasiswa {
        public static void main(String[] args) {
            // Header informasi mahasiswa
            System.out.println("Data Rencana Studi Mahasiswa\n");
            System.out.println("Tahun Akademik : 2024/2025 Ganjil");
            System.out.println("Kelas : 1C");
            System.out.println("IP Semester Lalu : 0.00");
            System.out.println("IP Kumulatif : 0.00\n");

            // Membuat tabel dengan data mata kuliah
            String[][] data = {
                    { "1", "RTI241001", "Pancasila", "1", "2", "2" },
                    { "2", "RTI241002", "Konsep Teknologi Informasi", "1", "2", "4" },
                    { "3", "RTI241003", "Critical Thinking dan Problem Solving", "1", "2", "4" },
                    { "4", "RTI241004", "Matematika Dasar", "1", "3", "6" },
                    { "5", "RTI241005", "Rekayasa Perangkat Lunak", "1", "2", "4" },
                    { "6", "RTI241006", "Dasar Pemrograman", "1", "2", "4" },
                    { "7", "RTI241007", "Praktikum Dasar Pemrograman", "1", "3", "6" },
                    { "8", "RTI241008", "Keselamatan dan Kesehatan Kerja", "1", "2", "4" }
            };

            // Tampilkan header tabel
            System.out.printf("%-5s %-12s %-40s %-10s %-5s %-5s\n", "NO", "KODE MK", "MATA KULIAH", "SEMESTER", "SKS",
                    "JAM");

            // Tampilkan isi tabel
            for (String[] row : data) {
                System.out.printf("%-5s %-12s %-40s %-10s %-5s %-5s\n", row[0], row[1], row[2], row[3], row[4], row[5]);
            }
        }
    }

}
