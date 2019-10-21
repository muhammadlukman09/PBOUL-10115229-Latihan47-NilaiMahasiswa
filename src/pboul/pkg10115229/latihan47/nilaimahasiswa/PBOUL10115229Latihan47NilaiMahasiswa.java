/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan47.nilaimahasiswa;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG 
 */
public class PBOUL10115229Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai1 = new Nilai(81, 81, 81);
        
        double na = nilai1.hitungnilaiAkhir();
        String index = nilai1.getIndex(na);
        String keterangan = nilai1.getketerangan(index);
        
        System.out.println("QUIS \t\t: "+nilai1.getQuis());
        System.out.println("UTS \t\t: "+nilai1.getUts());
        System.out.println("UAS \t\t: "+nilai1.getUas()+"\n");
        System.out.println("NILAI AKHIR \t\t: "+nilai1.getNa()+"\n");
        System.out.println("Index \t\t: "+index);
        System.out.println("Keterangan \t: "+keterangan+"\n");
        
        
        
        
 
        
        
    }
    
}
