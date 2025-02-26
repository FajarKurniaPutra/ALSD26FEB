import java.util.Scanner;

public class DosenDemo10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        Dosen10[] daftarDosen = new Dosen10[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen    : ");
            String kode = sc.nextLine();
            System.out.print("Nama Dosen    : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            sc.nextLine(); 

            Boolean jenisKelamin = (jk == 'L' || jk == 'l');

            System.out.print("Usia Dosen    : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------");
        }

        DataDosen10.dataSemuaDosen(daftarDosen);
        DataDosen10.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen10.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen10.infoDosenPalingTua(daftarDosen);
        DataDosen10.infoDosenPalingMuda(daftarDosen);

        sc.close(); 
    }
}

