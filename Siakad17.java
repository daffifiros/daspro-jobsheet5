import java.util.Scanner;
public class Siakad17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas,nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine (). charAt(0);
        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        String huruf = "huruf", Kategori = "Kategori";
        if (nilaiAkhir>80 && nilaiAkhir<=100) {
            huruf = "A";
            Kategori = "Sangat Baik";
        }
         else if (nilaiAkhir>73 && nilaiAkhir<=80) {
            huruf = "B+";
            Kategori = "Lebih dari Baik";
        } 
        else if (nilaiAkhir>65 && nilaiAkhir<=73) {
            huruf = "B";
            Kategori = "Baik";
        }
         else if (nilaiAkhir>60 && nilaiAkhir<=65) {
            huruf = "C+";
            Kategori = "Lebih dari Cukup";
        } 
        else if (nilaiAkhir>50 && nilaiAkhir<=60) {
            huruf = "C";
            Kategori = "Cukup";
        }
         else if (nilaiAkhir>39 && nilaiAkhir<=50) {
            huruf = "D";
            Kategori = "Kurang";  
         }
         else if (nilaiAkhir<=39) {
            huruf = "E";
            Kategori = "Gagal";
         } else 
        System.out.println("Anda memasukkan nilai yang salah");

        System.out.println("Nama : " + nama + " NIM: " + nim);
        System.out.println("Kelas : " + kelas + "Absen:" + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf " + huruf);
        System.out.println("Kategori " + Kategori);
       

    }
}