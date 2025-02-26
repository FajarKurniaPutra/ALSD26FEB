import java.util.Scanner;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();
        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[jumlahMatkul];

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah10(); 
            arrayOfMatakuliah[i].tambahData(sc); 
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
