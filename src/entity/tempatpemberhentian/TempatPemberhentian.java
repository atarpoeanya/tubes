package entity.tempatpemberhentian;

public class TempatPemberhentian {
    private String Kode_Tempat_Pemberhentian;
    private String Kode_Kota;
    private String Nama;
    private String Alamat;
    private int Kapasitas_Alat_Transportasi;
    private String Tahun_Operasi;
    private int Jumlah_Karyawan;
    private int Luas_Area;
    private int Kapasitas_Pengunjung;
    private String Nomor_Telepon;

    public TempatPemberhentian(String kode_Tempat_Pemberhentian, String kode_Kota, String nama, String alamat, int kapasitas_Alat_Transportasi, String tahun_Operasi, int jumlah_Karyawan, int luas_Area, int kapasitas_Pengunjung, String nomor_Telepon) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
        Kode_Kota = kode_Kota;
        Nama = nama;
        Alamat = alamat;
        Kapasitas_Alat_Transportasi = kapasitas_Alat_Transportasi;
        Tahun_Operasi = tahun_Operasi;
        Jumlah_Karyawan = jumlah_Karyawan;
        Luas_Area = luas_Area;
        Kapasitas_Pengunjung = kapasitas_Pengunjung;
        Nomor_Telepon = nomor_Telepon;
    }

    public String getKode_Tempat_Pemberhentian() {
        return Kode_Tempat_Pemberhentian;
    }

    public void setKode_Tempat_Pemberhentian(String kode_Tempat_Pemberhentian) {
        Kode_Tempat_Pemberhentian = kode_Tempat_Pemberhentian;
    }

    public String getKode_Kota() {
        return Kode_Kota;
    }

    public void setKode_Kota(String kode_Kota) {
        Kode_Kota = kode_Kota;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public int getKapasitas_Alat_Transportasi() {
        return Kapasitas_Alat_Transportasi;
    }

    public void setKapasitas_Alat_Transportasi(int kapasitas_Alat_Transportasi) {
        Kapasitas_Alat_Transportasi = kapasitas_Alat_Transportasi;
    }

    public String getTahun_Operasi() {
        return Tahun_Operasi;
    }

    public void setTahun_Operasi(String tahun_Operasi) {
        Tahun_Operasi = tahun_Operasi;
    }

    public int getJumlah_Karyawan() {
        return Jumlah_Karyawan;
    }

    public void setJumlah_Karyawan(int jumlah_Karyawan) {
        Jumlah_Karyawan = jumlah_Karyawan;
    }

    public int getLuas_Area() {
        return Luas_Area;
    }

    public void setLuas_Area(int luas_Area) {
        Luas_Area = luas_Area;
    }

    public int getKapasitas_Pengunjung() {
        return Kapasitas_Pengunjung;
    }

    public void setKapasitas_Pengunjung(int kapasitas_Pengunjung) {
        Kapasitas_Pengunjung = kapasitas_Pengunjung;
    }

    public String getNomor_Telepon() {
        return Nomor_Telepon;
    }

    public void setNomor_Telepon(String nomor_Telepon) {
        Nomor_Telepon = nomor_Telepon;
    }
}
