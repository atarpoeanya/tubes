package data;

import entity.*;
import entity.alatransportasi.*;
import entity.produsen.CabangProdusen;
import entity.produsen.Produsen;
import entity.tempatpemberhentian.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenerateData {
    public int KOTA(Connection connection, Kota kota) {
        int hasil = 0;
        String sql = "INSERT INTO KOTA (Kode_Kota, Nama, Luas_Wilayah)"
                + " VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kota.getKode_Kota());
            preparedStatement.setString(2, kota.getNama());
            preparedStatement.setInt(3, kota.getLuas_Wilayah());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel KOTA");
        }
        return hasil;
    }

    public int FASILITAS(Connection connection, Fasilitas fasilitas) {
        int hasil = 0;
        String sql = "INSERT INTO FASILITAS (Kode_Fasilitas, Nama)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fasilitas.getKode_Fasilitas());
            preparedStatement.setString(2, fasilitas.getNama());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel FASILITAS");
        }
        return hasil;
    }

    public int FITUR(Connection connection, Fitur fitur) {
        int hasil = 0;
        String sql = "INSERT INTO FITUR (Kode_Fitur, Nama)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, fitur.getKode_Fitur());
            preparedStatement.setString(2, fitur.getNama());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel FITUR");
        }
        return hasil;
    }

    public int LAYANAN(Connection connection, Layanan layanan) {
        int hasil = 0;
        String sql = "INSERT INTO LAYANAN (Kode_Layanan, Nama)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, layanan.getKode_Layanan());
            preparedStatement.setString(2, layanan.getNama());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel LAYANAN");
        }
        return hasil;
    }

    public int PRODUSEN(Connection connection, Produsen produsen) {
        int hasil = 0;
        String sql = "INSERT INTO PRODUSEN (Kode_Produsen, Kode_Kota, Nama, Alamat_Pusat, Email, Nomor_Telepon, Website, Kapasitas_Produksi, Jumlah_Karyawan)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, produsen.getKode_Produsen());
            preparedStatement.setString(2, produsen.getKode_Kota());
            preparedStatement.setString(3, produsen.getNama());
            preparedStatement.setString(4, produsen.getAlamat_Pusat());
            preparedStatement.setString(5, produsen.getEmail());
            preparedStatement.setString(6, produsen.getNomor_Telepon());
            preparedStatement.setString(7, produsen.getWebsite());
            preparedStatement.setInt(8, produsen.getKapasitas_Produksi());
            preparedStatement.setInt(9, produsen.getJumlah_Karyawan());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel PRODUSEN");
        }
        return hasil;
    }

    public int CABANG_PRODUSEN(Connection connection, CabangProdusen cabangProdusen) {
        int hasil = 0;
        String sql = "INSERT INTO CABANG_PRODUSEN (Kode_Cabang_Produsen, Kode_Produsen, Kode_Kota, Alamat_Cabang, Kapasitas_Produksi)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cabangProdusen.getKode_Cabang_Produsen());
            preparedStatement.setString(2, cabangProdusen.getKode_Produsen());
            preparedStatement.setString(3, cabangProdusen.getKode_Kota());
            preparedStatement.setString(4, cabangProdusen.getAlamat_Cabang());
            preparedStatement.setInt(5, cabangProdusen.getKapasitas_Produksi());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel CABANG_PRODUSEN");
        }
        return hasil;
    }

    public int PEMILIK(Connection connection, Pemilik pemilik) {
        int hasil = 0;
        String sql = "INSERT INTO PEMILIK (Kode_Pemilik, Kode_Kota, Nama, Alamat, Email, Nomor_Telepon, Website)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pemilik.getKode_Pemilik());
            preparedStatement.setString(2, pemilik.getKode_Kota());
            preparedStatement.setString(3, pemilik.getNama());
            preparedStatement.setString(4, pemilik.getAlamat());
            preparedStatement.setString(5, pemilik.getEmail());
            preparedStatement.setString(6, pemilik.getNomor_Telepon());
            preparedStatement.setString(7, pemilik.getWebsite());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel PEMILIK");
        }
        return hasil;
    }

    public int ALAT_TRANSPORTASI(Connection connection, AlatTransportasi alatTransportasi) {
        int hasil = 0;
        String sql = "INSERT INTO ALAT_TRANSPORTASI (Kode_Kendaraan, Kode_Produsen, Kode_Pemilik, Nama, Kecepatan_Maksimum, Kapasitas_Muatan, Tahun_Pengadaan, Jenis_Mesin, Hotline, Kapasitas_tangki, Berat_kendaraan, Jenis_Bahan_Bakar, Kapasitas_Penumpang, Panjang, Tahun_Mulai_Dimiliki)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, alatTransportasi.getKode_Kendaraan());
            preparedStatement.setString(2, alatTransportasi.getKode_Produsen());
            preparedStatement.setString(3, alatTransportasi.getKode_Pemilik());
            preparedStatement.setString(4, alatTransportasi.getNama());
            preparedStatement.setInt(5, alatTransportasi.getKecepatan_Maksimum());
            preparedStatement.setInt(6, alatTransportasi.getKapasitas_Muatan());
            preparedStatement.setString(7, alatTransportasi.getTahun_Pengadaan());
            preparedStatement.setString(8, alatTransportasi.getJenis_Mesin());
            preparedStatement.setString(9, alatTransportasi.getHotline());
            preparedStatement.setInt(10, alatTransportasi.getKapasitas_tangki());
            preparedStatement.setInt(11, alatTransportasi.getBerat_kendaraan());
            preparedStatement.setString(12, alatTransportasi.getJenis_Bahan_Bakar());
            preparedStatement.setInt(13, alatTransportasi.getKapasitas_Penumpang());
            preparedStatement.setInt(14, alatTransportasi.getPanjang());
            preparedStatement.setString(15, alatTransportasi.getTahun_Mulai_Dimiliki());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel ALAT_TRANSPORTASI");
        }
        return hasil;
    }

    public int PESAWAT(Connection connection, Pesawat pesawat) {
        int hasil = 0;
        String sql = "INSERT INTO PESAWAT (Kode_Kendaraan, Ketinggian_Maksimal, Luas_Sayap, Sudut_Sayap, Tinggi_Ekor, Lebar_Kabin, Bentang_Sayap)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pesawat.getKode_Kendaraan());
            preparedStatement.setInt(2, pesawat.getKetinggian_Maksimal());
            preparedStatement.setInt(3, pesawat.getLuas_Sayap());
            preparedStatement.setInt(4, pesawat.getSudut_Sayap());
            preparedStatement.setInt(5, pesawat.getTinggi_Ekor());
            preparedStatement.setInt(6, pesawat.getLebar_Kabin());
            preparedStatement.setInt(7, pesawat.getBentang_Sayap());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel PESAWAT");
        }
        return hasil;
    }

    public int HELIKOPTER(Connection connection, Helikopter helikopter) {
        int hasil = 0;
        String sql = "INSERT INTO HELIKOPTER (Kode_Kendaraan, Ketinggian_Maksimal, Diameter_Baling_Baling)"
                + " VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, helikopter.getKode_Kendaraan());
            preparedStatement.setInt(2, helikopter.getKetinggian_Maksimal());
            preparedStatement.setInt(3, helikopter.getDiameter_Baling_Baling());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel HELIKOPTER");
        }
        return hasil;
    }

    public int MOBIL_BUS(Connection connection, MobilBus mobilBus) {
        int hasil = 0;
        String sql = "INSERT INTO MOBIL_BUS ((Kode_Kendaraan, Jumlah_Roda, Plat_Nomor, Karoseri, Manual_Atau_Matik)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mobilBus.getKode_Kendaraan());
            preparedStatement.setInt(2, mobilBus.getJumlah_Roda());
            preparedStatement.setString(3, mobilBus.getPlat_Nomor());
            preparedStatement.setString(4, mobilBus.getKaroseri());
            preparedStatement.setInt(5, mobilBus.getManual_Atau_Matik());

            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel MOBIL_BUS");
        }
        return hasil;
    }

    public int MOBIL_PENUMPANG(Connection connection, MobilPenumpang mobilPenumpang) {
        int hasil = 0;
        String sql = "INSERT INTO MOBIL_PENUMPANG (Kode_Kendaraan, Jumlah_Roda, Plat_Nomor, Manual_Atau_Matik)"
                + " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mobilPenumpang.getKode_Kendaraan());
            preparedStatement.setInt(2, mobilPenumpang.getJumlah_Roda());
            preparedStatement.setString(3, mobilPenumpang.getPlat_Nomor());
            preparedStatement.setInt(4, mobilPenumpang.getManual_Atau_Matik());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel MOBIL_PENUMPANG");
        }
        return hasil;
    }

    public int KERETA(Connection connection, Kereta kereta) {
        int hasil = 0;
        String sql = "INSERT INTO KERETA (Kode_Kendaraan, Jumlah_Roda, Plat_Nomor, Jumlah_Lokomotif, Jumlah_Gerbong)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kereta.getKode_Kendaraan());
            preparedStatement.setInt(2, kereta.getJumlah_Roda());
            preparedStatement.setString(3, kereta.getPlat_Nomor());
            preparedStatement.setInt(4, kereta.getJumlah_Lokomotif());
            preparedStatement.setInt(5, kereta.getJumlah_Gerbong());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel KERETA");
        }
        return hasil;
    }

    public int KAPAL(Connection connection, Kapal kapal) {
        int hasil = 0;
        String sql = "INSERT INTO KAPAL (Kode_Kendaraan, Jumlah_Geladak)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kapal.getKode_Kendaraan());
            preparedStatement.setInt(2, kapal.getJumlah_Geladak());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel KAPAL");
        }
        return hasil;
    }

    public int TEMPAT_PEMBERHENTIAN(Connection connection, TempatPemberhentian tempatPemberhentian) {
        int hasil = 0;
        String sql = "INSERT INTO TEMPAT_PEMBERHENTIAN (Kode_Tempat_Pemberhentian, Kode_Kota, Nama, Alamat, Kapasitas_Alat_Transportasi, Tahun_Operasi, Jumlah_Karyawan, Luas_Area, Kapasitas_Pengunjung, Nomor_Telepon)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tempatPemberhentian.getKode_Tempat_Pemberhentian());
            preparedStatement.setString(2, tempatPemberhentian.getKode_Kota());
            preparedStatement.setString(3, tempatPemberhentian.getNama());
            preparedStatement.setString(4, tempatPemberhentian.getAlamat());
            preparedStatement.setInt(5, tempatPemberhentian.getKapasitas_Alat_Transportasi());
            preparedStatement.setString(6, tempatPemberhentian.getTahun_Operasi());
            preparedStatement.setInt(7, tempatPemberhentian.getJumlah_Karyawan());
            preparedStatement.setInt(8, tempatPemberhentian.getLuas_Area());
            preparedStatement.setInt(9, tempatPemberhentian.getKapasitas_Pengunjung());
            preparedStatement.setString(10, tempatPemberhentian.getNomor_Telepon());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel TEMPAT_PEMBERHENTIAN");
        }
        return hasil;
    }

    public int BANDARA(Connection connection, Bandara bandara) {
        int hasil = 0;
        String sql = "INSERT INTO BANDARA (Kode_Tempat_Pemberhentian, Klasifikasi_Bandara, Jumlah_Landasan, Jumlah_Gate, Jumlah_Terminal, Jenis_Bandara)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bandara.getKode_Tempat_Pemberhentian());
            preparedStatement.setString(2, bandara.getKlasifikasi_Bandara());
            preparedStatement.setInt(3, bandara.getJumlah_Landasan());
            preparedStatement.setInt(4, bandara.getJumlah_Gate());
            preparedStatement.setInt(5, bandara.getJumlah_Terminal());
            preparedStatement.setInt(6, bandara.getJenis_Bandara());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel BANDARA");
        }
        return hasil;
    }

    public int HELIPORT(Connection connection, Heliport heliport) {
        int hasil = 0;
        String sql = "INSERT INTO HELIPORT (Kode_Tempat_Pemberhentian, Jumlah_Helipad)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, heliport.getKode_Tempat_Pemberhentian());
            preparedStatement.setInt(2, heliport.getJumlah_Helipad());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel HELIPORT");
        }
        return hasil;
    }

    public int TERMINAL(Connection connection, Terminal terminal) {
        int hasil = 0;
        String sql = "INSERT INTO TERMINAL (Kode_Tempat_Pemberhentian, Jumlah_Jalur, Klasifikas)"
                + " VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, terminal.getKode_Tempat_Pemberhentian());
            preparedStatement.setInt(2, terminal.getJumlah_Jalur());
            preparedStatement.setString(3, terminal.getKlasifikasi());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel TERMINAL");
        }
        return hasil;
    }

    public int STASIUN(Connection connection, Stasiun stasiun) {
        int hasil = 0;
        String sql = "INSERT INTO STASIUN (Kode_Tempat_Pemberhentian, Jumlah_Jalur, Klasifikasi, Jumlah_Peron)"
                + " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, stasiun.getKode_Tempat_Pemberhentian());
            preparedStatement.setInt(2, stasiun.getJumlah_Jalur());
            preparedStatement.setString(3, stasiun.getKlasifikasi());
            preparedStatement.setInt(4, stasiun.getJumlah_Peron());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel STASIUN");
        }
        return hasil;
    }

    public int PELABUHAN(Connection connection, Pelabuhan pelabuhan) {
        int hasil = 0;
        String sql = "INSERT INTO PELABUHAN (Kode_Tempat_Pemberhentian, Jumlah_Dermaga)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pelabuhan.getKode_Tempat_Pemberhentian());
            preparedStatement.setInt(2, pelabuhan.getJumlah_Dermaga());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel PELABUHAN");
        }
        return hasil;
    }

    public int RUTE(Connection connection, Rute rute) {
        int hasil = 0;
        String sql = "INSERT INTO RUTE (Kode_Rute, Kode_Tempat_Pemberhentian_Asal, Kode_Tempat_Pemberhentian_Tujuan, Jarak, Waktu_Berangkat, Waktu_Tiba, Tanggal_Berangkat, Tanggal_Tiba)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, rute.getKode_Rute());
            preparedStatement.setString(2, rute.getKode_Tempat_Pemberhentian_Asal());
            preparedStatement.setString(3, rute.getKode_Tempat_Pemberhentian_Tujuan());
            preparedStatement.setInt(4, rute.getJarak());
            preparedStatement.setString(5, rute.getWaktu_Berangkat());
            preparedStatement.setString(6, rute.getWaktu_Tiba());
            preparedStatement.setString(7, rute.getTanggal_Berangkat());
            preparedStatement.setString(8, rute.getTanggal_Tiba());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel RUTE");
        }
        return hasil;
    }

    public int TIKET(Connection connection, Tiket tiket) {
        int hasil = 0;
        String sql = "INSERT INTO TIKET (Kode_Tiket, Kode_Rute, Harga, Kelas, Posisi_Duduk, Telah_Terbeli)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tiket.getKode_Tiket());
            preparedStatement.setString(2, tiket.getKode_Rute());
            preparedStatement.setInt(3, tiket.getHarga());
            preparedStatement.setString(4, tiket.getKelas());
            preparedStatement.setString(5, tiket.getPosisi_Duduk());
            preparedStatement.setInt(6, tiket.getTelah_Terbeli());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel TIKET");
        }
        return hasil;
    }

    public int MEMILIKI_FITUR(Connection connection, MemilikiFitur memilikiFitur) {
        int hasil = 0;
        String sql = "INSERT INTO MEMILIKI_FITUR (Kode_Kendaraan, Kode_Fitur)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memilikiFitur.getKode_Kendaraan());
            preparedStatement.setString(2, memilikiFitur.getKode_Fitur());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel MEMILIKI_FITUR");
        }
        return hasil;
    }

    public int MEMILIKI_RUTE(Connection connection, MemilikiRute memilikiRute) {
        int hasil = 0;
        String sql = "INSERT INTO MEMILIKI_RUTE (Kode_Kendaraan, Kode_Rute)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memilikiRute.getKode_Kendaraan());
            preparedStatement.setString(2, memilikiRute.getKode_Rute());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel MEMILIKI_RUTE");
        }
        return hasil;
    }

    public int MEMILIKI_LAYANAN(Connection connection, MemilikiLayanan memilikiLayanan) {
        int hasil = 0;
        String sql = "INSERT INTO MEMILIKI_LAYANAN (Kode_Tempat_Pemberhentian, Kode_Layanan)"
                + " VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memilikiLayanan.getKode_Tempat_Pemberhentian());
            preparedStatement.setString(2, memilikiLayanan.getKode_Layanan());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel MEMILIKI_LAYANAN");
        }
        return hasil;
    }

    public int MEMILIKI_FASILITAS(Connection connection, MemilikiFasilitas memilikiFasilitas) {
        int hasil = 0;
        String sql = "INSERT INTO MEMILIKI_FASILITAS (Kode_Tempat_Pemberhentian, Kode_Kendaraan, Kode_Fasilitas)"
                + " VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memilikiFasilitas.getKode_Tempat_Pemberhentian());
            preparedStatement.setString(1, memilikiFasilitas.getKode_Kendaraan());
            preparedStatement.setString(1, memilikiFasilitas.getKode_Fasilitas());
            hasil = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Terjadi error saat insert ke tabel MEMILIKI_FASILITAS");
        }
        return hasil;
    }
}