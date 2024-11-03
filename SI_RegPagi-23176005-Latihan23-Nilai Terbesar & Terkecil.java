/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 23 - Nilai Terbesar dan Terkecil
 * Deskripsi Program    : Program ini meminta pengguna untuk memasukkan nama petugas dan jumlah mahasiswa,
                          kemudian mengumpulkan nilai dari setiap mahasiswa.Program menggunakan loop for
                          untuk menerima input nilai, sekaligus mencari nilai tertinggi dan terendah.
 * @author
 **/
package pertemuan.pkg6;
 import java.util.Scanner;
public class Latihan23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input operator's name
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        // Input number of students
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Declare variables to store scores and find the highest and lowest scores
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        // Input student scores
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();

            // Update highest and lowest scores
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }

        // Output student scores
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        // Output highest and lowest scores
        System.out.println("\nNilai Terbesar adalah " + nilaiTertinggi);
        System.out.println("Nilai Terkecil adalah " + nilaiTerendah);

        // Output operator's name
        System.out.println("\nPetugas: " + namaPetugas);
        
        scanner.close();
    }
}
