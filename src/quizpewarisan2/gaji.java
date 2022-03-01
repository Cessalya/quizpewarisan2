/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizpewarisan2;

/**
 *
 * @author LENOVO
 */
public class gaji extends pegawai {
    int gaji;
    String nama;
    String jeniskelamin;
    int nomorKaryawan;
    
    public void setnama (String nama){
        this.nama=nama;
    }
    public void cetak (){
        super.data1();
        System.out.println("Nama : "+super.nama);
        System.out.println("Jenis Kelamin : "+super.jeniskelamin);
        System.out.println("Nomor Karyawan : "+super.nomorKaryawan);
        super.data2();
    }
    public void gaji(){
        gaji = 1200000;
        System.out.println("Gaji Utama Yang didapat : "+ gaji);
    }
    public void gaji(String kata){
        if (kata=="dapat"){
            System.out.println("Gaji yang didapat jika bekerja secara baik menjadi " +gaji*2+ "\n");
        }
    }
}
