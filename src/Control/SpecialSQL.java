package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SpecialSQL {
    int choice;
    Scanner sc = new Scanner(System.in);

    public void driperCode(Connection conn) throws SQLException {
        System.out.println("Perintah yang dapat dijalankan: "
        + "\n1. Tiket pesawat dari kota Jakarta yang belum terbeli"
        + "\n2. Kendaraan yang berangkat dari kota Jakarta"
        + "\n3. Kendaraan asal Semarang dengan tujuan Jogja"
        + "\n4. Tiket dengan harga termurah"
        + "\n5. Rute terpendek yang dilalui kendaraan");


        choice = sc.nextInt();
        switch (choice) {
            case 1:
                state1(conn);
                System.out.print("Masukan angka 0 untuk kembali");
                sc.next();
                break;
            case 2:
                state2(conn);
                System.out.print("Masukan angka 0 untuk kembali");
                sc.next();
                break;
            case 3:
                state3(conn);
                System.out.print("Masukan angka 0 untuk kembali");
                sc.next();
                break;
            case 4:
                state4(conn);
                System.out.print("Masukan angka 0 untuk kembali");
                sc.next();
                break;
            case 5:
                state5(conn);
                System.out.print("Masukan angka 0 untuk kembali");
                sc.next();
                break;

            default:
                break;
        }
    }

    void state1(Connection conn) throws SQLException {
        String sql = "SELECT Harga, Kelas, Posisi_Duduk"
                    + " FROM TIKET INNER JOIN RUTE ON TIKET.Kode_Rute = RUTE.Kode_Rute"
                    + " WHERE Telah_Terbeli = 0 AND RUTE.Kode_Tempat_Pemberhentian_Asal IN ("
                    + "SELECT Kode_Tempat_Pemberhentian FROM TEMPAT_PEMBERHENTIAN" 
                    + " INNER JOIN KOTA ON TEMPAT_PEMBERHENTIAN.Kode_Kota = KOTA.Kode_Kota"
                    + " WHERE KOTA.Nama = 'Jakarta') AND RUTE.Kode_Rute IN ("
                    + "SELECT Kode_Rute FROM MEMILIKI_RUTE INNER JOIN PESAWAT"
                    + " ON MEMILIKI_RUTE.Kode_Kendaraan = PESAWAT.Kode_Kendaraan)";
                    //System.out.println(sql);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        ResultSetMetaData rSetMetaData = rs.getMetaData();

        int numberOfColumns = rSetMetaData.getColumnCount();
        StringBuilder sb=new StringBuilder();

        for(int i = 1; i <= numberOfColumns; i++)
        {
            sb.append(String.format("| %-10s",rSetMetaData.getColumnLabel(i)));
        }
        //Display top
        System.out.println(sb);

        while (rs.next())
        {
            for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
        {
            System.out.print(String.format("| %-10s", rs.getString(e)));
        }
            System.out.println();
         }
                }
        

        void state2(Connection conn) throws SQLException {
                    String sql = "SELECT ALAT_TRANSPORTASI.Nama"
                                + " FROM ALAT_TRANSPORTASI INNER JOIN MEMILIKI_RUTE ON ALAT_TRANSPORTASI.Kode_Kendaraan = MEMILIKI_RUTE.Kode_Kendaraan"
                                + " INNER JOIN RUTE ON MEMILIKI_RUTE.Kode_Rute = RUTE.Kode_Rute"
                                + " INNER JOIN TEMPAT_PEMBERHENTIAN ON RUTE.Kode_Tempat_Pemberhentian_Asal = TEMPAT_PEMBERHENTIAN.Kode_Tempat_Pemberhentian"
                                + " INNER JOIN KOTA ON TEMPAT_PEMBERHENTIAN.Kode_Kota = KOTA.Kode_Kota"
                                + " WHERE KOTA.Nama = 'Jakarta';";
                                System.out.println(sql);
                    Statement statement = conn.createStatement();
                    ResultSet rs = statement.executeQuery(sql);
                    ResultSetMetaData rSetMetaData = rs.getMetaData();
            
                    int numberOfColumns = rSetMetaData.getColumnCount();
                    StringBuilder sb=new StringBuilder();
            
                    for(int i = 1; i <= numberOfColumns; i++)
                    {
                        sb.append(String.format("| %-10s",rSetMetaData.getColumnLabel(i)));
                    }
                    //Display top
                    System.out.println(sb);
            
                    while (rs.next())
                    {
                        for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
                    {
                        System.out.print(String.format("| %-10s", rs.getString(e)));
                    }
                        System.out.println();
                     }
        }

        void state3(Connection conn) throws SQLException {
            String sql = "SELECT ALAT_TRANSPORTASI.Nama"
                        + " FROM ALAT_TRANSPORTASI INNER JOIN MEMILIKI_RUTE ON ALAT_TRANSPORTASI.Kode_Kendaraan = MEMILIKI_RUTE.Kode_Kendaraan"
                        + " INNER JOIN RUTE ON MEMILIKI_RUTE.Kode_Rute = RUTE.Kode_Rute"
                        + " WHERE Kode_Tempat_Pemberhentian_Asal IN ("
                        + "SELECT Kode_Tempat_Pemberhentian FROM TEMPAT_PEMBERHENTIAN INNER JOIN KOTA ON TEMPAT_PEMBERHENTIAN.Kode_Kota = KOTA.Kode_Kota"
                        + " WHERE KOTA.Nama = 'Semarang' ) AND Kode_Tempat_Pemberhentian_Tujuan IN ("
                        + " SELECT Kode_Tempat_Pemberhentian FROM TEMPAT_PEMBERHENTIAN INNER JOIN KOTA ON TEMPAT_PEMBERHENTIAN.Kode_Kota = KOTA.Kode_Kota"
                        + " WHERE KOTA.Nama = 'Yogyakarta')";
                        System.out.println(sql);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rSetMetaData = rs.getMetaData();
    
            int numberOfColumns = rSetMetaData.getColumnCount();
            StringBuilder sb=new StringBuilder();
    
            for(int i = 1; i <= numberOfColumns; i++)
            {
                sb.append(String.format("| %-10s",rSetMetaData.getColumnLabel(i)));
            }
            //Display top
            System.out.println(sb);
    
            while (rs.next())
            {
                for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
            {
                System.out.print(String.format("| %-10s", rs.getString(e)));
            }
                System.out.println();
             }
        }
        void state4(Connection conn) throws SQLException {
            String sql = "SELECT TOP(1) Harga, COUNT(Kode_Tiket) AS Jumlah_Tersedia"
                        + " FROM TIKET WHERE Telah_Terbeli = 0"
                        + " GROUP BY Harga ORDER BY Harga ASC";
                        System.out.println(sql);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rSetMetaData = rs.getMetaData();

            int numberOfColumns = rSetMetaData.getColumnCount();
            StringBuilder sb=new StringBuilder();

            for(int i = 1; i <= numberOfColumns; i++)
            {
                sb.append(String.format("| %-10s",rSetMetaData.getColumnLabel(i)));
            }
            //Display top
            System.out.println(sb);

            while (rs.next())
            {
                for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
            {
                System.out.print(String.format("| %-10s", rs.getString(e)));
            }
                System.out.println();
            }
        }

        void state5(Connection conn) throws SQLException {
            String sql = "SELECT (SELECT Nama FROM TEMPAT_PEMBERHENTIAN"
                        + " WHERE Kode_Tempat_Pemberhentian IN ("
                        + "SELECT Kode_Tempat_Pemberhentian_Asal"
                        + " FROM RUTE INNER JOIN (SELECT TOP(1) Jarak"
                        + " FROM RUTE GROUP BY Jarak ORDER BY Jarak ASC) AS JARAK_TERPENDEK"
                        + " ON RUTE.Jarak = JARAK_TERPENDEK.Jarak)) AS Asal, (SELECT Nama"
                        + " FROM TEMPAT_PEMBERHENTIAN WHERE Kode_Tempat_Pemberhentian IN ("
                        + "SELECT Kode_Tempat_Pemberhentian_Tujuan FROM RUTE INNER JOIN (SELECT TOP(1) Jarak"
                        + " FROM RUTE GROUP BY Jarak ORDER BY Jarak ASC) AS JARAK_TERPENDEK"
                        + " ON RUTE.Jarak = JARAK_TERPENDEK.Jarak)) AS Tujuan";
                        System.out.println(sql);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rSetMetaData = rs.getMetaData();

            int numberOfColumns = rSetMetaData.getColumnCount();
            StringBuilder sb=new StringBuilder();

            for(int i = 1; i <= numberOfColumns; i++)
            {
                sb.append(String.format("| %-10s",rSetMetaData.getColumnLabel(i)));
            }
            //Display top
            System.out.println(sb);

            while (rs.next())
            {
                for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
            {
                System.out.print(String.format("| %-10s", rs.getString(e)));
            }
                System.out.println();
            }
        }



}
