package Pegawai;

public class Main {
    public static void main(String[] args) {
        pegawai karyawanZ , karyawanX;
        karyawanZ = new pegawai();
        karyawanX = new pegawai();

        System.out.println();
        karyawanZ.setNIP("2211103046");
        karyawanZ.setNama("Andi Syafar Ilham");
        karyawanZ.setAlamat("Purwokerto");
        karyawanZ.setInfo(12,5000000);
        karyawanZ.cetak();
        System.out.println();

        karyawanX.setNIP("2211103044");
        karyawanX.setNama("Andhika W");
        karyawanX.setAlamat("Jawa Tengah");
        karyawanX.setInfo(4500000);
        karyawanX.cetak();
    }
}
