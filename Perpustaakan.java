/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainil
 */
class buku {
    String judul_buku ; 
    String jenis_buku ; 
    int jumlah_buku ; 
    
    void setBuku(String newJudulBuku, String newJenisBuku, int newJumlahBuku ) {
        this.judul_buku = newJudulBuku; 
        this.jenis_buku = newJenisBuku ; 
        this.jumlah_buku = newJumlahBuku; 
    }
    
    String getJudul(){
        return judul_buku ; 
    } 
    String getJenis(){
        return jenis_buku;
    }
    int getJumlah(){
        return jumlah_buku;
    }
    void dipinjam (int jumlahDipinjam) {
        this.jumlah_buku = jumlah_buku - jumlahDipinjam ;
    }
    
}

class pengunjung {
    String nama_pengunjung ; 
    int umur ; 
    
    void setPengunjung(String newNamaPengunjung, int newNomorKtp){
        this.nama_pengunjung = newNamaPengunjung ; 
        this.umur = newNomorKtp; 
            
    }
    
    String getPengunjung() {
        return nama_pengunjung;
    }
    int getUmur(){
        return umur;
    }
    void pinjamBuku (String NamaBuku) {
        System.out.println(this.nama_pengunjung+" meminjam buku berjudul "+NamaBuku);
        
    }
}

public class Perpustaakan {
    public static void main(String[] args) {
        buku buku1 = new buku();
        buku1.setBuku("Serigala Berbulu Domba", "Dongeng", 3);
        
        
        pengunjung pengunjung1 = new pengunjung();
        pengunjung1.setPengunjung("Noraini Latifah", 19);
        
        System.out.println("Data buku 1 adalah : ");
        System.out.println(buku1.getJudul());
        System.out.println(buku1.getJenis());
        System.out.println("Jumlah buku: "+buku1.getJumlah());
        
        System.out.println("Pengunjung 1 adalah ");
        System.out.println(pengunjung1.getPengunjung());
        System.out.println(pengunjung1.getUmur());
        
        
        

        
        pengunjung1.pinjamBuku(buku1.getJudul());
        buku1.dipinjam(1);
        
        System.out.println("Jumlah buku sekarang: "+buku1.getJumlah());
        
    }
  }

    
