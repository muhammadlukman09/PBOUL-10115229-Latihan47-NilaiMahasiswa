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
public class Nilai {
    private double quis;
    private double uts;
    private double uas;
    private double na;
    private String index;
    private String keterangan;
    
    public Nilai(){
        
        
    }

    public double getQuis() {
        return quis;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double getNa() {
        return na;
    }

    public String getIndex() {
        return index;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public Nilai (double quis, double uts, double uas){
        this.quis = quis;
        this.uts = uts;
        this.uas = uas;
        
    }
    
    public double hitungnilaiAkhir(){
        na = (0.2*quis)+(0.3*uts)+(0.5*uas);
        return na;
    }
    
    public String getIndex(double Na){
        if (Na > 80){
            index = "A";
        }
        else
            if (Na > 68){
                index = "B";
                
            }
        else
                if (Na >56){
                    index = "C";
                    
                }
        else
                    if (Na > 45){
                        index = "D";
                        
                    }
        else
                        index ="E";
        
        return index;
    }
    
                        
    public String getketerangan(String index){
        switch(index){
            case "A" : keterangan = "Sangat Baik";
                break;
            case "B" : keterangan = "Baik";
                break;
            case "C" : keterangan = "Cukup";
                break;
            case "D" : keterangan = "Kurang";
                break;  
            case "E" : keterangan = "Sangat Kurang";
                break;
            default: keterangan = "Cek nilai";
        }
        return keterangan ;
    }
 
        
    }
    
    
    

