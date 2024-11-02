/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Nilai Terbesar dan Terkecil
 */ 

package Pertemuan6;
import java.util.Scanner; 

public class Latihan23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Meminta nama petugas untuk nanti dicetak dibagian akhir program
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();
        
        //Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: "); 
        int jumlahMahasiswa = scanner.nextInt(); 
        
        /*Karena nantinya banyak nilai yang akan dibandingkan jumlahnya tidak diketahui, 
          maka dibutuhkan sebuah penyimpanan yang mampu menyimpan data secara fleksibel, sehingga
          otomatis kita tidak dapat menyimpan banyaknya input nilai mahasiswa dalam suatu variabel.
          Oleh karena itu, di sini kita membuat sebuah array yang nantinya panjang array tersebut
          akan menyesuaikan input jumlahMahasiswa.      
        */
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa]; //Array untuk menyimpan nilai-nilai mahasiswa
        
        //Input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) { //Banyaknya looping akan menyesuaikan jumlah mahasiswa
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = scanner.nextInt(); 
        }
        
        /*Untuk menentukan nilai terbesar dan terkecil, maka dibuatlah variabel nilaiTerbesar dan 
          nilaiTerkecil lalu variabel tersebut diberi nilai awal yaitu dari array pada indeks 0
          yang tujuannya untuk mempermudah penentuan nilai terbesar dan terkecil nantinya.         
        */
        
        int nilaiTerbesar = nilaiMahasiswa[0]; 
        int nilaiTerkecil = nilaiMahasiswa[0]; 
        
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) { 
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        
        /*Pada For loop di atas, program akan diperintahkan untuk terus membandingkan nilai mahasiswa 
          pada array sampai ditemukan nilai Terbesar dan Terkecilnya. Jika nilaiTerbesar atau nilaiTerkecil 
          yang berisi array diindex 0 ketika dibandingkan dalam statement if dia terpenuhi (dalam baris ke-49 atau 52), 
          maka variabel nilaiTerbesar atau nilaiTerkecil tersebut akan diganti dengan nilaiMahasiswa diindex yang memenuhi
          statement tersebut.
          Tetapi jika tidak memnuhi statement if, maka variabel nilaiTerbesar atau nilaiTerkecil akan tetap merujuk pada
          nilai defaultnya yaitu berisi array nilaiMahasiswa[0].
        
        */
        
        //Menampilkan hasil analisis nilai terbesar dan terkecil 
        System.out.println("\n=======Hasil Nilai Mahasiswa=======");
        for (int i = 0; i < jumlahMahasiswa; i++) { 
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }
        
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("\nPetugas: " + namaPetugas); 
    }
} 

