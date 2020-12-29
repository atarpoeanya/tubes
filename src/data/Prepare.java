package data;

import java.sql.Connection;
import SQL.SQLCek;

public class Prepare {
    
    
    public void preparing(Connection connection) throws InterruptedException {
        SQLCek sqlCek = new SQLCek();
        GenerateData generate = new GenerateData();
        if (sqlCek.KOTA(connection) == 1 && sqlCek.FASILITAS(connection) == 1 && sqlCek.FITUR(connection) == 1 &&
                sqlCek.LAYANAN(connection) == 1 && sqlCek.PRODUSEN(connection) == 1 && sqlCek.CABANG_PRODUSEN(connection) == 1 &&
                sqlCek.PEMILIK(connection) == 1 && sqlCek.ALAT_TRANSPORTASI(connection) == 1 && sqlCek.PESAWAT(connection) == 1 &&
                sqlCek.HELIKOPTER(connection) == 1 && sqlCek.MOBIL_BUS(connection) == 1 && sqlCek.MOBIL_PENUMPANG(connection) == 1 &&
                sqlCek.KERETA(connection) == 1 && sqlCek.KAPAL(connection) == 1 && sqlCek.TEMPAT_PEMBERHENTIAN(connection) == 1 &&
                sqlCek.BANDARA(connection) == 1 && sqlCek.HELIPORT(connection) == 1 && sqlCek.TERMINAL(connection) == 1 &&
                sqlCek.STASIUN(connection) == 1 && sqlCek.PELABUHAN(connection) == 1 && sqlCek.RUTE(connection) == 1 &&
                sqlCek.TIKET(connection) == 1 && sqlCek.MEMILIKI_FITUR(connection) == 1 && sqlCek.MEMILIKI_RUTE(connection) == 1 &&
                sqlCek.MEMILIKI_LAYANAN(connection) == 1 && sqlCek.MEMILIKI_FASILITAS(connection) == 1) {
            for (int i=0; i<DataDummy.getListKota().size(); i++) {
                int row = generate.KOTA(connection, DataDummy.getListKota().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListFasilitas().size(); i++) {
                int row = generate.FASILITAS(connection, DataDummy.getListFasilitas().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListFitur().size(); i++) {
                int row = generate.FITUR(connection, DataDummy.getListFitur().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListLayanan().size(); i++) {
                int row = generate.LAYANAN(connection, DataDummy.getListLayanan().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListProdusen().size(); i++) {
                int row = generate.PRODUSEN(connection, DataDummy.getListProdusen().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListCabangProdusen().size(); i++) {
                int row = generate.CABANG_PRODUSEN(connection, DataDummy.getListCabangProdusen().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListPemilik().size(); i++) {
                int row = generate.PEMILIK(connection, DataDummy.getListPemilik().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListAlatTransportasi().size(); i++) {
                int row = generate.ALAT_TRANSPORTASI(connection, DataDummy.getListAlatTransportasi().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListPesawat().size(); i++) {
                int row = generate.PESAWAT(connection, DataDummy.getListPesawat().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListHelikopter().size(); i++) {
                int row = generate.HELIKOPTER(connection, DataDummy.getListHelikopter().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMobilBus().size(); i++) {
                int row = generate.MOBIL_BUS(connection, DataDummy.getListMobilBus().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMobilPenumpang().size(); i++) {
                int row = generate.MOBIL_PENUMPANG(connection, DataDummy.getListMobilPenumpang().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListKereta().size(); i++) {
                int row = generate.KERETA(connection, DataDummy.getListKereta().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListKapal().size(); i++) {
                int row = generate.KAPAL(connection, DataDummy.getListKapal().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListTempatPemberhentian().size(); i++) {
                int row = generate.TEMPAT_PEMBERHENTIAN(connection, DataDummy.getListTempatPemberhentian().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListBandara().size(); i++) {
                int row = generate.BANDARA(connection, DataDummy.getListBandara().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListHeliport().size(); i++) {
                int row = generate.HELIPORT(connection, DataDummy.getListHeliport().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListTerminal().size(); i++) {
                int row = generate.TERMINAL(connection, DataDummy.getListTerminal().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListStasiun().size(); i++) {
                int row = generate.STASIUN(connection, DataDummy.getListStasiun().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListPelabuhan().size(); i++) {
                int row = generate.PELABUHAN(connection, DataDummy.getListPelabuhan().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListRute().size(); i++) {
                int row = generate.RUTE(connection, DataDummy.getListRute().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListTiket().size(); i++) {
                int row = generate.TIKET(connection, DataDummy.getListTiket().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiFitur().size(); i++) {
                int row = generate.MEMILIKI_FITUR(connection, DataDummy.getListMemilikiFitur().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiRute().size(); i++) {
                int row = generate.MEMILIKI_RUTE(connection, DataDummy.getListMemilikiRute().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiLayanan().size(); i++) {
                int row = generate.MEMILIKI_LAYANAN(connection, DataDummy.getListMemilikiLayanan().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
            for (int i=0; i<DataDummy.getListMemilikiFasilitas().size(); i++) {
                int row = generate.MEMILIKI_FASILITAS(connection, DataDummy.getListMemilikiFasilitas().get(i));
                System.out.println(row);
            }
            System.out.println("insert");
        } else  {
            System.out.println("Dummy data sudah tersedia");
            Thread.sleep(3000);
        }
    }
}

