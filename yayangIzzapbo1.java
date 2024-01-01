/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas1;

/**
 *
 * @author LENOVO
 */
public class Uas1 {

    public static void main(String[] args) {
        MahasiswaBaru mBaru = new MahasiswaBaru("Yayang Izzatul Haq", 19, 22205052);
        mBaru.displayInfo();

        MahasiswaLama mLama = new MahasiswaLama("Nadiya Auliya Nisa", 20, 2022);
        mLama.displayInfo();
    }

    static class Mahasiswa {
        private String nama;
        private int umur;
        private int nim;

        public Mahasiswa(String nama, int umur, int nim) {
            this.nama = nama;
            this.umur = umur;
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getUmur() {
            return umur;
        }

        public void setUmur(int umur) {
            this.umur = umur;
        }

        public int getNim() {
            return nim;
        }

        public void setNim(int nim) {
            this.nim = nim;
        }

        public void displayInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);
            System.out.println("NIM: " + nim);
        }
    }

    static class MahasiswaBaru extends Mahasiswa {
        private int nim;

        public MahasiswaBaru(String nama, int umur, int nim) {
            super(nama, umur, nim);
            this.nim = nim;
        }

        public int getNim() {
            return nim;
        }

        public void setNim(int nim) {
            this.nim = nim;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Angkatan: " + (2022 - (nim % 10000)));
        }
    }

    static class MahasiswaLama extends Mahasiswa {
        private int angkatan;

        public MahasiswaLama(String nama, int umur, int angkatan) {
            super(nama, umur, 0);
            this.angkatan = angkatan;
        }

        public int getAngkatan() {
            return angkatan;
        }

        public void setAngkatan(int angkatan) {
            this.angkatan = angkatan;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Angkatan: " + angkatan);
        }
    }
}
    