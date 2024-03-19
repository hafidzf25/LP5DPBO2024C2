public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;

    private String pendidikanterakhiribu;
    private String pendidikanterakhirayah;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String ptibu, String ptayah) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.pendidikanterakhiribu = ptibu;
        this.pendidikanterakhirayah = ptayah;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setPendidikanterakhiribu(String ptibu) { this.pendidikanterakhiribu = ptibu; }

    public void setPendidikanterakhirayah(String ptayah) { this.pendidikanterakhirayah = ptayah; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getPendidikanterakhiribu() {return this.pendidikanterakhiribu;}

    public String getPendidikanterakhirayah() {return this.pendidikanterakhirayah;}
}
