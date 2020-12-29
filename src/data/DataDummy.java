package data;

import entity.*;
import entity.alatransportasi.*;
import entity.produsen.CabangProdusen;
import entity.produsen.Produsen;
import entity.tempatpemberhentian.*;

import java.util.ArrayList;

public class DataDummy {
    private static String[] Kode_Kota = {
            "KT-0",
            "KT-1",
            "KT-2",
            "KT-3",
            "KT-4",
            "KT-5",
            "KT-6",
            "KT-7",
            "KT-8",
            "KT-9",
            "KT-10",
            "KT-11",
            "KT-12",
            "KT-13"
    };

    private static String[] Nama_Kota = {
            "Luar Negeri",
            "Medan",
            "Lampung",
            "Banten",
            "Jakarta",
            "Bandung",
            "Semarang",
            "Yogyakarta",
            "Surabaya",
            "Bali",
            "Jayapura",
            "Madiun",
            "Makassar",
            "Sidoarjo"
    };

    private static int[] Luas_Wilayah_Kota = {
            1000,
            265,
            35375,
            9663,
            661,
            167,
            373,
            3186,
            350,
            5780,
            935,
            33,
            199,
            602
    };

    public static ArrayList<Kota> getListKota() {
        ArrayList<Kota> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kota.length; i++) {
            Kota kota = new Kota(
                    Kode_Kota[i],
                    Nama_Kota[i],
                    Luas_Wilayah_Kota[i]
            );
            list.add(kota);
        }
        return list;
    }

    private static String[] Kode_Fasilitas = {
            "FSLTS-1",
            "FSLTS-2",
            "FSLTS-3",
            "FSLTS-4",
            "FSLTS-5"
    };

    private static String[] Nama_Fasilitas = {
            "Toilet",
            "LED TV",
            "Tempat ibadah",
            "POS Kesehatan",
            "Charger HP"
    };

    public static ArrayList<Fasilitas> getListFasilitas() {
        ArrayList<Fasilitas> list = new ArrayList<>();
        for (int i = 0; i < Kode_Fasilitas.length; i++) {
            Fasilitas fasilitas = new Fasilitas(
                    Kode_Fasilitas[i],
                    Nama_Fasilitas[i]
            );
            list.add(fasilitas);
        }
        return list;
    }

    private static String[] Kode_Fitur = {
            "FTR-1",
            "FTR-2",
            "FTR-3"
    };

    private static String[] Nama_Fitur = {
            "anti-lock braking system",
            "LED daytime running light",
            "acceleration skid control"
    };

    public static ArrayList<Fitur> getListFitur() {
        ArrayList<Fitur> list = new ArrayList<>();
        for (int i = 0; i < Kode_Fitur.length; i++) {
            Fitur fitur = new Fitur(
                    Kode_Fitur[i],
                    Nama_Fitur[i]
            );
            list.add(fitur);
        }
        return list;
    }

    private static String[] Kode_Layanan = {
            "LYNN-1",
            "LYNN-2",
            "LYNN-3"
    };

    private static String[] Nama_Layanan = {
            "Kesehatan",
            "Keamanan",
            "Kehilangan"
    };

    public static ArrayList<Layanan> getListLayanan() {
        ArrayList<Layanan> list = new ArrayList<>();
        for (int i = 0; i < Kode_Layanan.length; i++) {
            Layanan layanan = new Layanan(
                    Kode_Layanan[i],
                    Nama_Layanan[i]
            );
            list.add(layanan);
        }
        return list;
    }

    private static String[] Kode_Produsen = {
            "PRDSN-1",
            "PRDSN-2",
            "PRDSN-3",
            "PRDSN-4",
            "PRDSN-5"
    };

    private static String[] Kode_Kota_Produsen = {
            "KT-11",
            "KT-0",
            "KT-0",
            "KT-12",
            "KT-0"
    };

    private static String[] Nama_Produsen = {
            "INKA",
            "Mercedes-Benz",
            "Boeing",
            "Industri Kapal Indonesia",
            "Airbus"
    };

    private static String[] Alamat_Pusat_Produsen = {
            "Jl. Yos Sudarso No. 71 Madiun 63122, Jawa Timur",
            "Mercedesstraße 120 D-70372 Stuttgart Deutschland",
            "Chicago, IL, US (HQ) 100 N Riverside Plaza.",
            "JL Galangan Kapal No. 31, Makassar, Sulawesi Selatan, Indonesia, 90211.",
            "Airbus Group SE PO Box 32008 2303 DA Leiden The Netherlands"
    };

    private static String[] Email_Produsen = {
            "sekretariat@inka.co.id",
            "dialog.mb@daimler.com",
            "paul.j.lewis2@boeing.com",
            "ptiki@ikishipyard.co.id",
            "erecruiting@airbus.com"
    };

    private static String[] Nomor_Telepon_Produsen = {
            "(0351) 452271-74",
            "+49 7 11 17-0",
            "562-234-1391",
            "+62 411 448 653",
            "+33 5 81 31 75 00"
    };

    private static String[] Website_Produsen = {
            "https://www.inka.co.id/",
            "https://www.mercedes-benz.com/en/",
            "https://www.boeing.com/",
            "https://www.ikishipyard.co.id/",
            "https://www.airbus.com/"
    };

    private static int[] Kapasitas_Produksi_Produsen = {
            60,
            200,
            31,
            21,
            35
    };

    private static int[] Jumlah_Karyawan_Produsen = {
            5000,
            10000,
            15000,
            2000,
            12000
    };

    public static ArrayList<Produsen> getListProdusen() {
        ArrayList<Produsen> list = new ArrayList<>();
        for (int i = 0; i < Kode_Produsen.length; i++) {
            Produsen produsen = new Produsen(
                    Kode_Produsen[i],
                    Kode_Kota_Produsen[i],
                    Nama_Produsen[i],
                    Alamat_Pusat_Produsen[i],
                    Email_Produsen[i],
                    Nomor_Telepon_Produsen[i],
                    Website_Produsen[i],
                    Kapasitas_Produksi_Produsen[i],
                    Jumlah_Karyawan_Produsen[i]
            );
            list.add(produsen);
        }
        return list;
    }

    private static String[] Kode_Cabang_Produsen = {
            "CBNG_PRDSN-1",
            "CBNG_PRDSN-2"
    };

    private static String[] Kode_Produsen_Cabang_Produsen = {
            "PRDSN-3",
            "PRDSN-5"
    };

    private static String[] Kode_Kota_Cabang_Produsen = {
            "KT-0",
            "KT-0"
    };

    private static String[] Alamat_Cabang_Cabang_Produsen = {
            "Crawley United Kingdom Park House, Crawley Business Quarter, Manor Royal",
            "Airbus Defence and Space North America 2550 Wasser Terrace, Suite 9000 20171 Herndon, Virginia - UNITED STATES"
    };

    private static int[] Kapasitas_Produksi_Cabang_Produsen = {
            20,
            18
    };

    public static ArrayList<CabangProdusen> getListCabangProdusen() {
        ArrayList<CabangProdusen> list = new ArrayList<>();
        for (int i = 0; i < Kode_Cabang_Produsen.length; i++) {
            CabangProdusen cabangProdusen = new CabangProdusen(
                    Kode_Cabang_Produsen[i],
                    Kode_Produsen_Cabang_Produsen[i],
                    Kode_Kota_Cabang_Produsen[i],
                    Alamat_Cabang_Cabang_Produsen[i],
                    Kapasitas_Produksi_Cabang_Produsen[i]
            );
            list.add(cabangProdusen);
        }
        return list;
    }

    private static String[] Kode_Pemilik = {
            "PMLK-1",
            "PMLK-2",
            "PMLK-3",
            "PMLK-4",
            "PMLK-5",
            "PMLK-6"
    };

    private static String[] Kode_Kota_Pemilik = {
            "KT-4",
            "KT-4",
            "KT-13",
            "KT-7",
            "KT-5",
            "KT-4"
    };

    private static String[] Nama_Pemilik = {
            "Garuda Indonesia",
            "Jaya Trishindo",
            "Eka Patas",
            "Angkot Jalan",
            "KAI",
            "PELNI"
    };

    private static String[] Alamat_Pemilik = {
            "Gedung Garuda Indonesia Jl. Kebon Sirih No. 44, Jakarta 10110, Indonesia",
            "Rukan Grand Aries Niaga, Jl. Taman Aries Blok E1 No.1A, Kembangan, Kota Jakarta Barat, DKI Jakarta 11620 Indonesia.",
            "Jl.Raya Gilang No.10, Gilang Selatan, Gilang, Kec. Taman, Kabupaten Sidoarjo, Jawa Timur 61257",
            "Jl. Dewan Karang Nongko Yogyakarta",
            "Jalan Perintis Kemerdekaan No. 1 Bandung 40117",
            "Jl. Gajah Mada No. 14, Jakarta Pusat, 10130 DKI Jakarta, Indonesia"
    };

    private static String[] Email_Pemilik = {
            "investor@garuda-indonesia.com",
            "info@jatigroup.com",
            "-",
            "-",
            "cs@kai.id",
            "infopelni162@pelni.co.id"
    };

    private static String[] Nomor_Telepon_Pemilik = {
            "0 804 1 807 807",
            "(021) 5890 0300",
            "0817-6765-000",
            "0888-0666-6660",
            "022-4230031",
            "+62 21 6385 4130"
    };

    private static String[] Website_Pemilik = {
            "https://www.garuda-indonesia.com/id/id/index",
            "http://www.jatigroup.com/",
            "https://www.ekapatas.com/",
            "-",
            "https://kai.id/",
            "https://www.pelni.co.id/"
    };

    public static ArrayList<Pemilik> getListPemilik() {
        ArrayList<Pemilik> list = new ArrayList<>();
        for (int i = 0; i < Kode_Pemilik.length; i++) {
            Pemilik pemilik = new Pemilik(
                    Kode_Pemilik[i],
                    Kode_Kota_Pemilik[i],
                    Nama_Pemilik[i],
                    Alamat_Pemilik[i],
                    Email_Pemilik[i],
                    Nomor_Telepon_Pemilik[i],
                    Website_Pemilik[i]
            );
            list.add(pemilik);
        }
        return list;
    }

    private static String[] Kode_Kendaraan = {
            "KDRN-1",
            "KDRN-2",
            "KDRN-3",
            "KDRN-4",
            "KDRN-5",
            "KDRN-6",
    };

    private static String[] Kode_Produsen_Kendaraan = {
            "PRDSN-3",
            "PRDSN-5",
            "PRDSN-2",
            "PRDSN-2",
            "PRDSN-1",
            "PRDSN-4",
    };

    private static String[] Kode_Pemilik_Kendaraan = {
            "PMLK-1",
            "PMLK-2",
            "PMLK-3",
            "PMLK-4",
            "PMLK-5",
            "PMLK-6"
    };

    private static String[] Nama_Kendaraan = {
            "Boeing 737",
            "Eurocopter EC135",
            "OC 500 RF 2542",
            "MERCEDES GLS-CLASS",
            "Joglosemarkerto",
            "KM Awu"
    };

    private static int[] Kecepatan_Maksimum_Kendaraan = {
            876,
            259,
            120,
            246,
            120,
            30
    };

    private static int[] Kapasitas_Muatan_Kendaraan = {
            9000,
            1500,
            1000,
            500,
            2000,
            500000
    };

    private static String[] Tahun_Pengadaan_Kendaraan = {
            "2000-03-17",
            "2003-07-27",
            "2010-04-13",
            "2016-05-14",
            "2015-12-05",
            "2009-09-22"
    };

    private static String[] Jenis_Mesin_Kendaraan = {
            "Jet",
            "reciprocating",
            "Diesel",
            "Diesel",
            "Diesel",
            "Diesel"
    };

    private static String[] Hotline_Kendaraan = {
            "0 804 1 807 807",
            "(021) 5890 0300",
            "0823 4567 9089",
            "0888 2322 4212",
            "022-4230031",
            "0555 6666 6666"
    };

    private static int[] Kapasitas_tangki_Kendaraan = {
            23000,
            224,
            600,
            90,
            3000,
            400000
    };

    private static int[] Berat_kendaraan_Kendaraan = {
            60000,
            1455,
            20000,
            2500,
            18000,
            15000000
    };

    private static String[] Jenis_Bahan_Bakar_Kendaraan = {
            "Aviation kerosene",
            "Aviation kerosene",
            "Solar",
            "Petrol",
            "HSD",
            "Solar"
    };

    private static int[] Kapasitas_Penumpang_Kendaraan = {
            200,
            7,
            40,
            7,
            300,
            2000
    };

    private static int[] Panjang_Kendaraan = {
            30,
            10,
            14,
            5,
            90,
            120
    };

    private static String[] Tahun_Mulai_Dimiliki_Kendaraan = {
            "2013-11-02",
            "2006-01-23",
            "2014-02-23",
            "2017-07-04",
            "2018-02-25",
            "2013-01-18"
    };

    public static ArrayList<AlatTransportasi> getListAlatTransportasi() {
        ArrayList<AlatTransportasi> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan.length; i++) {
            AlatTransportasi alatTransportasi = new AlatTransportasi(
                    Kode_Kendaraan[i],
                    Kode_Produsen_Kendaraan[i],
                    Kode_Pemilik_Kendaraan[i],
                    Nama_Kendaraan[i],
                    Kecepatan_Maksimum_Kendaraan[i],
                    Kapasitas_Muatan_Kendaraan[i],
                    Tahun_Pengadaan_Kendaraan[i],
                    Jenis_Mesin_Kendaraan[i],
                    Hotline_Kendaraan[i],
                    Kapasitas_tangki_Kendaraan[i],
                    Berat_kendaraan_Kendaraan[i],
                    Jenis_Bahan_Bakar_Kendaraan[i],
                    Kapasitas_Penumpang_Kendaraan[i],
                    Panjang_Kendaraan[i],
                    Tahun_Mulai_Dimiliki_Kendaraan[i]
            );
            list.add(alatTransportasi);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_Pesawat = {
            "KDRN-1"
    };

    private static int[] Ketinggian_Maksimal_Pesawat = {
            13000
    };

    private static int[] Luas_Sayap_Pesawat = {
            91
    };

    private static int[] Sudut_Sayap_Pesawat = {
            25
    };

    private static int[] Tinggi_Ekor_Pesawat = {
            11
    };

    private static int[] Lebar_Kabin_Pesawat = {
            3
    };

    private static int[] Bentang_Sayap_Pesawat = {
            28
    };

    public static ArrayList<Pesawat> getListPesawat() {
        ArrayList<Pesawat> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_Pesawat.length; i++) {
            Pesawat pesawat = new Pesawat(
                    Kode_Kendaraan_Pesawat[i],
                    Ketinggian_Maksimal_Pesawat[i],
                    Luas_Sayap_Pesawat[i],
                    Sudut_Sayap_Pesawat[i],
                    Tinggi_Ekor_Pesawat[i],
                    Lebar_Kabin_Pesawat[i],
                    Bentang_Sayap_Pesawat[i]
            );
            list.add(pesawat);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_Helikopter = {
            "KDRN-2"
    };
    private static int[] Ketinggian_Maksimal_Helikopter = {
            6000
    };
    private static int[] Diameter_Baling_Baling_Helikopter = {
            10
    };

    public static ArrayList<Helikopter> getListHelikopter() {
        ArrayList<Helikopter> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_Helikopter.length; i++) {
            Helikopter helikopter = new Helikopter(
                    Kode_Kendaraan_Helikopter[i],
                    Ketinggian_Maksimal_Helikopter[i],
                    Diameter_Baling_Baling_Helikopter[i]
            );
            list.add(helikopter);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_MobilBus = {
            "KDRN-3"
    };

    private static int[] Jumlah_Roda_MobilBus = {
            6
    };

    private static String[] Plat_Nomor_MobilBus = {
            "S 7523 US"
    };

    private static String[] Karoseri_MobilBus = {
            "Adiputro"
    };

    private static int[] Manual_Atau_Matik_MobilBus = {
            1
    };

    public static ArrayList<MobilBus> getListMobilBus() {
        ArrayList<MobilBus> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_MobilBus.length; i++) {
            MobilBus mobilBus = new MobilBus(
                    Kode_Kendaraan_MobilBus[i],
                    Jumlah_Roda_MobilBus[i],
                    Plat_Nomor_MobilBus[i],
                    Karoseri_MobilBus[i],
                    Manual_Atau_Matik_MobilBus[i]
            );
            list.add(mobilBus);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_MobilPenumpang = {
            "KDRN-4"
    };

    private static int[] Jumlah_Roda_MobilPenumpang = {
            4
    };

    private static String[] Plat_Nomor_MobilPenumpang = {
            "AB 1010 MH"
    };

    private static int[] Manual_Atau_Matik_MobilPenumpang = {
            1
    };

    public static ArrayList<MobilPenumpang> getListMobilPenumpang() {
        ArrayList<MobilPenumpang> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_MobilPenumpang.length; i++) {
            MobilPenumpang mobilPenumpang = new MobilPenumpang(
                    Kode_Kendaraan_MobilPenumpang[i],
                    Jumlah_Roda_MobilPenumpang[i],
                    Plat_Nomor_MobilPenumpang[i],
                    Manual_Atau_Matik_MobilPenumpang[i]
            );
            list.add(mobilPenumpang);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_Kereta = {
            "KDRN-5"
    };

    private static int[] Jumlah_Roda_Kereta = {
            80
    };

    private static String[] Plat_Nomor_Kereta = {
            "193"
    };

    private static int[] Jumlah_Lokomotif_Kereta = {
            1
    };

    private static int[] Jumlah_Gerbong_Kereta = {
            6
    };

    public static ArrayList<Kereta> getListKereta() {
        ArrayList<Kereta> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_Kereta.length; i++) {
            Kereta kereta = new Kereta(
                    Kode_Kendaraan_Kereta[i],
                    Jumlah_Roda_Kereta[i],
                    Plat_Nomor_Kereta[i],
                    Jumlah_Lokomotif_Kereta[i],
                    Jumlah_Gerbong_Kereta[i]
            );
            list.add(kereta);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_Kapal = {
            "KDRN-6"
    };

    private static int[] Jumlah_Geladak_Kapal = {
            3
    };

    public static ArrayList<Kapal> getListKapal() {
        ArrayList<Kapal> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_Kapal.length; i++) {
            Kapal kapal = new Kapal(
                    Kode_Kendaraan_Kapal[i],
                    Jumlah_Geladak_Kapal[i]
            );
            list.add(kapal);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian = {
            "TP-1",
            "TP-2",
            "TP-3",
            "TP-4",
            "TP-5",
            "TP-6",
            "TP-7",
            "TP-8",
            "TP-9",
            "TP-10"
    };

    private static String[] Kode_Kota_TempatPemberhentian = {
            "KT-4",
            "KT-7",
            "KT-3",
            "KT-3",
            "KT-6",
            "KT-8",
            "KT-6",
            "KT-7",
            "KT-2",
            "KT-3",
    };

    private static String[] Nama_TempatPemberhentian = {
            "Bandara Soekarno-Hatta",
            "Yogyakarta International Airport",
            "Heliport Lippo Karawaci",
            "Cengkareng Heliport Capt. A. Toos Sanitioso",
            "Terminal Mangkang",
            "Terminal Purabaya",
            "Stasiun Semarang Tawang",
            "Stasiun Yogyakarta",
            "Pelabuhan Bakauheni",
            "Pelabuhan Merak"
    };

    private static String[] Alamat_TempatPemberhentian = {
            "Tangerang City, Banten 19120",
            "Jl. Wates - Purworejo No.Km, RW.42, Area Kebun, Glagah, Kec. Temon, Kabupaten Kulon Progo, Daerah Istimewa Yogyakarta 55654",
            "Jl. Boulevard Diponegoro No.105, Klp. Dua, Kec. Klp. Dua, Tangerang, Banten 15810",
            "RT.003/RW.008, Pajang, Benda, Tangerang City, Banten 15126",
            "Mangkang Kulon, Tugu, Semarang City, Central Java 50155",
            "Jl. Bungurasih Timur, Kasian, Bungurasih, Kec. Waru, Kabupaten Sidoarjo, Jawa Timur 61256",
            "Jl. Taman Tawang No.1, Tj. Mas, Kec. Semarang Utara, Kota Semarang, Jawa Tengah 50211",
            "Jl. Margo Utomo, Sosromenduran, Gedongtengen, Yogyakarta Special Region of Yogyakarta Indonesia",
            "Jl. Pelabuhan Bakauheni, Bakauheni, Kec. Bakauheni, Kabupaten Lampung Selatan, Lampung 35592, Indonesia",
            "Jl. Pelabuhan Merak, Merak, Tamansari, Pulomerak, Kota Cilegon, Banten 42438, Indonesia"
    };

    private static int[] Kapasitas_Alat_Transportasi_TempatPemberhentian = {
            50,
            40,
            3,
            2,
            8,
            10,
            80,
            90,
            15,
            18
    };

    private static String[] Tahun_Operasi_TempatPemberhentian = {
            "1985-05-01",
            "2020-03-29",
            "2016-02-13",
            "2013-11-24",
            "2009-08-10",
            "1991-01-01",
            "1914-06-01",
            "1887-05-02",
            "1980-01-01",
            "1912-01-01"
    };

    private static int[] Jumlah_Karyawan_TempatPemberhentian = {
            5400,
            4000,
            100,
            130,
            1000,
            1300,
            2000,
            2100,
            3400,
            4100
    };

    private static int[] Luas_Area_TempatPemberhentian = {
            1200000,
            219000,
            500,
            750,
            90000,
            120000,
            150000,
            140000,
            750000,
            150000
    };

    private static int[] Kapasitas_Pengunjung_TempatPemberhentian = {
            63000000,
            20000000,
            1000,
            1300,
            40000000,
            37000000,
            25000000,
            27500000,
            100000000,
            97000000,
    };

    private static String[] Nomor_Telepon_TempatPemberhentian = {
            "62811984138",
            "(0274) 486000",
            "-",
            "0877-4168-0090",
            "-",
            "031 8530192",
            "024 3544544",
            "+62-274-589685",
            "(0727) 331032",
            "0254 571083"
    };

    public static ArrayList<TempatPemberhentian> getListTempatPemberhentian() {
        ArrayList<TempatPemberhentian> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian.length; i++) {
            TempatPemberhentian tempatPemberhentian = new TempatPemberhentian(
                    Kode_Tempat_Pemberhentian[i],
                    Kode_Kota_TempatPemberhentian[i],
                    Nama_TempatPemberhentian[i],
                    Alamat_TempatPemberhentian[i],
                    Kapasitas_Alat_Transportasi_TempatPemberhentian[i],
                    Tahun_Operasi_TempatPemberhentian[i],
                    Jumlah_Karyawan_TempatPemberhentian[i],
                    Luas_Area_TempatPemberhentian[i],
                    Kapasitas_Pengunjung_TempatPemberhentian[i],
                    Nomor_Telepon_TempatPemberhentian[i]
            );
            list.add(tempatPemberhentian);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_Bandara = {
            "TP-1",
            "TP-2"
    };

    private static String[] Klasifikasi_Bandara_Bandara = {
            "A",
            "A"
    };

    private static int[] Jumlah_Landasan_Bandara = {
            3,
            1
    };

    private static int[] Jumlah_Gate_Bandara = {
            73,
            47,
    };

    private static int[] Jumlah_Terminal_Bandara = {
            3,
            2
    };

    private static int[] Jenis_Bandara_Bandara = {
            1,
            1
    };

    public static ArrayList<Bandara> getListBandara() {
        ArrayList<Bandara> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_Bandara.length; i++) {
            Bandara bandara = new Bandara(
                    Kode_Tempat_Pemberhentian_Bandara[i],
                    Klasifikasi_Bandara_Bandara[i],
                    Jumlah_Landasan_Bandara[i],
                    Jumlah_Gate_Bandara[i],
                    Jumlah_Terminal_Bandara[i],
                    Jenis_Bandara_Bandara[i]
            );
            list.add(bandara);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_Heliport = {
            "TP-3",
            "TP-4"
    };

    private static int[] Jumlah_Helipad_Heliport = {
            3,
            2
    };

    public static ArrayList<Heliport> getListHeliport() {
        ArrayList<Heliport> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_Heliport.length; i++) {
            Heliport heliport = new Heliport(
                    Kode_Tempat_Pemberhentian_Heliport[i],
                    Jumlah_Helipad_Heliport[i]
            );
            list.add(heliport);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_Terminal = {
            "TP-5",
            "TP-6"
    };

    private static int[] Jumlah_Jalur_Terminal = {
            8,
            10
    };

    private static String[] Klasifikasi_Terminal = {
            "B",
            "A"
    };

    public static ArrayList<Terminal> getListTerminal() {
        ArrayList<Terminal> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_Terminal.length; i++) {
            Terminal terminal = new Terminal(
                    Kode_Tempat_Pemberhentian_Terminal[i],
                    Jumlah_Jalur_Terminal[i],
                    Klasifikasi_Terminal[i]
            );
            list.add(terminal);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_Stasiun = {
            "TP-7",
            "TP-8"
    };

    private static int[] Jumlah_Jalur_Stasiun = {
            10,
            14
    };

    private static String[] Klasifikasi_Stasiun = {
            "B",
            "A"
    };

    private static int[] Jumlah_Peron_Stasiun = {
            4,
            6
    };

    public static ArrayList<Stasiun> getListStasiun() {
        ArrayList<Stasiun> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_Stasiun.length; i++) {
            Stasiun stasiun = new Stasiun(
                    Kode_Tempat_Pemberhentian_Stasiun[i],
                    Jumlah_Jalur_Stasiun[i],
                    Klasifikasi_Stasiun[i],
                    Jumlah_Peron_Stasiun[i]
            );
            list.add(stasiun);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_Pelabuhan = {
            "TP-9",
            "TP-10"
    };

    private static int[] Jumlah_Dermaga_Pelabuhan = {
            5,
            6
    };

    public static ArrayList<Pelabuhan> getListPelabuhan() {
        ArrayList<Pelabuhan> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_Pelabuhan.length; i++) {
            Pelabuhan pelabuhan = new Pelabuhan(
                    Kode_Tempat_Pemberhentian_Pelabuhan[i],
                    Jumlah_Dermaga_Pelabuhan[i]
            );
            list.add(pelabuhan);
        }
        return list;
    }

    private static String[] Kode_Rute = {
            "RT-1",
            "RT-2",
            "RT-3",
            "RT-4",
            "RT-5",
            "RT-6"
    };

    private static String[] Kode_Tempat_Pemberhentian_Asal = {
            "TP-1",
            "TP-3",
            "TP-5",
            "TP-1",
            "TP-7",
            "TP-9",
    };

    private static String[] Kode_Tempat_Pemberhentian_Tujuan = {
            "TP-2",
            "TP-4",
            "TP-6",
            "TP-8",
            "TP-8",
            "TP-10",
    };

    private static int[] Jarak = {
            500,
            100,
            250,
            700,
            150,
            50
    };

    private static String[] Waktu_Berangkat = {
            "06:00:00",
            "13:20:00",
            "01:30:00",
            "21:00:00",
            "17:45:00",
            "09:00:00"
    };

    private static String[] Waktu_Tiba = {
            "21:00:00",
            "06:00:00",
            "09:00:00",
            "13:20:00",
            "01:30:00",
            "17:45:00"
    };

    private static String[] Tanggal_Berangkat = {
            "2020-12-31",
            "2021-01-01",
            "2021-01-07",
            "2021-01-02",
            "2021-01-01",
            "2021-01-05",
    };

    private static String[] Tanggal_Tiba = {
            "2020-12-31",
            "2021-01-02",
            "2021-01-07",
            "2021-01-03",
            "2021-01-02",
            "2021-01-05",
    };

    public static ArrayList<Rute> getListRute() {
        ArrayList<Rute> list = new ArrayList<>();
        for (int i = 0; i < Kode_Rute.length; i++) {
            Rute rute = new Rute(
                    Kode_Rute[i],
                    Kode_Tempat_Pemberhentian_Asal[i],
                    Kode_Tempat_Pemberhentian_Tujuan[i],
                    Jarak[i],
                    Waktu_Berangkat[i],
                    Waktu_Tiba[i],
                    Tanggal_Berangkat[i],
                    Tanggal_Tiba[i]
            );
            list.add(rute);
        }
        return list;
    }

    private static String[] Kode_Tiket = {
            "TKT-1",
            "TKT-2",
            "TKT-3",
            "TKT-4",
            "TKT-5",
            "TKT-6",
            "TKT-7",
            "TKT-8",
            "TKT-9",
            "TKT-10",
            "TKT-11",
            "TKT-12",
            "TKT-13",
            "TKT-14",
            "TKT-15",
            "TKT-16",
            "TKT-17",
            "TKT-18",
            "TKT-19",
            "TKT-20",
            "TKT-21",
            "TKT-22",
            "TKT-23",
            "TKT-24",
            "TKT-25",
            "TKT-26",
            "TKT-27",
            "TKT-28",
            "TKT-29",
            "TKT-30",
    };

    private static String[] Kode_Rute_Tiket = {
            "RT-1",
            "RT-1",
            "RT-1",
            "RT-1",
            "RT-1",
            "RT-2",
            "RT-2",
            "RT-2",
            "RT-2",
            "RT-2",
            "RT-3",
            "RT-3",
            "RT-3",
            "RT-3",
            "RT-3",
            "RT-4",
            "RT-4",
            "RT-4",
            "RT-4",
            "RT-4",
            "RT-5",
            "RT-5",
            "RT-5",
            "RT-5",
            "RT-5",
            "RT-6",
            "RT-6",
            "RT-6",
            "RT-6",
            "RT-6",
    };

    private static int[] Harga = {
            1000000,
            1000000,
            600000,
            600000,
            600000,
            2000000,
            2000000,
            2000000,
            2000000,
            2000000,
            100000,
            100000,
            100000,
            100000,
            100000,
            300000,
            300000,
            300000,
            300000,
            300000,
            140000,
            140000,
            140000,
            80000,
            80000,
            50000,
            50000,
            50000,
            50000,
            50000,
    };

    private static String[] Kelas = {
            "Bisnis",
            "Bisnis",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Premium",
            "Premium",
            "Premium",
            "Premium",
            "Premium",
            "eksekutif",
            "eksekutif",
            "eksekutif",
            "eksekutif",
            "eksekutif",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Premium",
            "Premium",
            "Premium",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
            "Ekonomi",
    };

    private static String[] Posisi_Duduk = {
            "A1",
            "A2",
            "H1",
            "H2",
            "H3",
            "1",
            "2",
            "3",
            "4",
            "5",
            "A1",
            "A2",
            "A3",
            "A4",
            "B1",
            "1",
            "2",
            "3",
            "4",
            "5",
            "A1",
            "A2",
            "B1",
            "B7",
            "C3",
            "1A1",
            "1A2",
            "1A3",
            "1A4",
            "1A5"
    };

    private static int[] Telah_Terbeli = {
            1,
            0,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            1,
            1,
            1,
            1,
            1,
            0,
            0,
            0,
            1
    };

    public static ArrayList<Tiket> getListTiket() {
        ArrayList<Tiket> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tiket.length; i++) {
            Tiket tiket = new Tiket(
                    Kode_Tiket[i],
                    Kode_Rute_Tiket[i],
                    Harga[i],
                    Kelas[i],
                    Posisi_Duduk[i],
                    Telah_Terbeli[i]
            );
            list.add(tiket);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_KF = {
            "KDRN-3",
            "KDRN-3",
            "KDRN-3",
            "KDRN-4",
            "KDRN-4"
    };

    private static String[] Kode_Fitur_KF = {
            "FTR-1",
            "FTR-2",
            "FTR-3",
            "FTR-1",
            "FTR-2"
    };

    public static ArrayList<MemilikiFitur> getListMemilikiFitur() {
        ArrayList<MemilikiFitur> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_KF.length; i++) {
            MemilikiFitur memilikiFitur = new MemilikiFitur(
                    Kode_Kendaraan_KF[i],
                    Kode_Fitur_KF[i]
            );
            list.add(memilikiFitur);
        }
        return list;
    }

    private static String[] Kode_Kendaraan_KR = {
            "KDRN-1",
            "KDRN-2",
            "KDRN-3",
            "KDRN-4",
            "KDRN-5",
            "KDRN-6",
    };

    private static String[] Kode_Rute_KR = {
            "RT-1",
            "RT-2",
            "RT-3",
            "RT-4",
            "RT-5",
            "RT-6"
    };

    public static ArrayList<MemilikiRute> getListMemilikiRute() {
        ArrayList<MemilikiRute> list = new ArrayList<>();
        for (int i = 0; i < Kode_Kendaraan_KR.length; i++) {
            MemilikiRute memilikiRute = new MemilikiRute(
                    Kode_Kendaraan_KR[i],
                    Kode_Rute_KR[i]
            );
            list.add(memilikiRute);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_TPL = {
            "TP-1",
            "TP-1",
            "TP-1",
            "TP-2",
            "TP-2",
            "TP-2",
            "TP-3",
            "TP-3",
            "TP-3",
            "TP-4",
            "TP-4",
            "TP-4",
            "TP-5",
            "TP-5",
            "TP-6",
            "TP-6",
            "TP-7",
            "TP-7",
            "TP-8",
            "TP-9",
            "TP-9",
            "TP-10"
    };

    private static String[] Kode_Layanan_TPL = {
            "LYNN-1",
            "LYNN-2",
            "LYNN-3",
            "LYNN-1",
            "LYNN-2",
            "LYNN-3",
            "LYNN-1",
            "LYNN-2",
            "LYNN-3",
            "LYNN-1",
            "LYNN-2",
            "LYNN-3",
            "LYNN-2",
            "LYNN-3",
            "LYNN-2",
            "LYNN-3",
            "LYNN-2",
            "LYNN-3",
            "LYNN-2",
            "LYNN-2",
            "LYNN-3",
            "LYNN-2"
    };

    public static ArrayList<MemilikiLayanan> getListMemilikiLayanan() {
        ArrayList<MemilikiLayanan> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_TPL.length; i++) {
            MemilikiLayanan memilikiLayanan = new MemilikiLayanan(
                    Kode_Tempat_Pemberhentian_TPL[i],
                    Kode_Layanan_TPL[i]
            );
            list.add(memilikiLayanan);
        }
        return list;
    }

    private static String[] Kode_Tempat_Pemberhentian_TPKF = {
            "TP-1",
            "TP-2",
            "TP-3",
            "TP-4",
            "TP-5",
            "TP-6",
            "TP-7",
            "TP-8",
            "TP-9",
            "TP-10",
            "TP-1",
            "TP-2",
            "TP-1",
            "TP-2",
            "TP-3",
            "TP-4",
            "TP-5",
            "TP-6",
            "TP-7",
            "TP-8",
            "TP-9",
            "TP-10",
            "TP-1",
            "TP-1",
            "TP-2",
            "TP-3",
            "TP-4",
            "TP-5",
            "TP-6",
            "TP-7",
            "TP-8",
            "TP-9",
            "TP-10",
    };

    private static String[] Kode_Kendaraan_TPKF = {
            "KDRN-1",
            "NULL",
            "KDRN-3",
            "NULL",
            "KDRN-5",
            "KDRN-6",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "KDRN-1",
            "KDRN-3",
            "KDRN-6",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
            "KDRN-1",
            "NULL",
            "KDRN-3",
            "KDRN-4",
            "KDRN-5",
            "KDRN-6",
            "NULL",
            "NULL",
            "NULL",
            "NULL",
    };

    private static String[] Kode_Fasilitas_TPKF = {
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-1",
            "FSLTS-2",
            "FSLTS-2",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-3",
            "FSLTS-4",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5",
            "FSLTS-5"
    };

    public static ArrayList<MemilikiFasilitas> getListMemilikiFasilitas() {
        ArrayList<MemilikiFasilitas> list = new ArrayList<>();
        for (int i = 0; i < Kode_Tempat_Pemberhentian_TPKF.length; i++) {
            MemilikiFasilitas memilikiFasilitas = new MemilikiFasilitas(
                    Kode_Tempat_Pemberhentian_TPKF[i],
                    Kode_Kendaraan_TPKF[i],
                    Kode_Fasilitas_TPKF[i]
            );
            list.add(memilikiFasilitas);
        }
        return list;
    }
}