/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author ACER
 */
public class Resource {
    int id;
    String nama_obat;
    String jumlah_obat;
    String deskripsi;

    public Resource() {
    }

    public Resource(int id, String nama_obat, String jumlah_obat, String deskripsi) {
        this.id = id;
        this.nama_obat = nama_obat;
        this.jumlah_obat = jumlah_obat;
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getJumlah_obat() {
        return jumlah_obat;
    }

    public void setJumlah_obat(String jumlah_obat) {
        this.jumlah_obat = jumlah_obat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    

    
}
