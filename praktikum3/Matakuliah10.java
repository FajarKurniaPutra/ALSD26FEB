import java.util.Scanner;

public class Matakuliah10 {
    Scanner sc = new Scanner(System.in);

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    String dummy;

    public Matakuliah10(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah10() {}

    public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : "+ kode);
        System.out.println("Nama       : "+ nama);
        System.out.println("SKS        : "+ sks);
        System.out.println("Jumlah Jam : "+ jumlahJam);
        System.out.println("--------------------------------");
    }
}
