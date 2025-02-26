public class DataDosen10 {
    public static void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i].tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== JUMLAH DOSEN BERDASARKAN JENIS KELAMIN ===");
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalPria = 0, jumlahPria = 0;
        int totalWanita = 0, jumlahWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalPria += arrayOfDosen[i].usia;
                jumlahPria++;
            } else {
                totalWanita += arrayOfDosen[i].usia;
                jumlahWanita++;
            }
        }

        double rataPria = (jumlahPria == 0) ? 0 : (double) totalPria / jumlahPria;
        double rataWanita = (jumlahWanita == 0) ? 0 : (double) totalWanita / jumlahWanita;

        System.out.println("\n=== RATA-RATA USIA DOSEN ===");
        System.out.println("Rata-rata usia Dosen Pria   : " + rataPria + " tahun");
        System.out.println("Rata-rata usia Dosen Wanita : " + rataWanita + " tahun");
    }

    public static void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 tertua = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > tertua.usia) {
                tertua = arrayOfDosen[i];
            }
        }
        System.out.println("\n=== DOSEN PALING TUA ===");
        tertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 termuda = arrayOfDosen[0];
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda.usia) {
                termuda = arrayOfDosen[i];
            }
        }
        System.out.println("\n=== DOSEN PALING MUDA ===");
        termuda.tampilkanInfo();
    }
}
