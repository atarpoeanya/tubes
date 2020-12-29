package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;


public class editData {
    Scanner sc = new Scanner(System.in);

    public void name(Connection conn) throws SQLException {
        MainDisplay disp = new MainDisplay();

        while (true) {
            System.out.println("Edit Menu (Masukan Angka)\n\n1. \n2.Ubah suatu data\n3. Hapus data\n0. Kembali ke menu utama");
            
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Keluar...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("NOT YET");
                    break;

                case 2:
                    System.out.print("NOT YET");
                    break;

                case 3:

                    disp.displayTabel(conn);
                    System.out.println("\nPilih tabel yang ingin di edit");
                    deletData(conn);
                    break;

                default:
                    break;
            }
        }
        //sc.close();
    }

    private void deletData(Connection conn) throws SQLException {
        String str = sc.next();
        

        java.sql.Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM " + str);
        ResultSetMetaData rSetMetaData = rs.getMetaData();

        int numberOfColumns = rSetMetaData.getColumnCount();
        
        StringBuilder sb=new StringBuilder();

        for(int i = 1; i <= numberOfColumns; i++)
        {
            sb.append(String.format("| %-10s",rSetMetaData.getColumnLabel(i)));
        }
        //Display top
        System.out.println(sb);

        while (rs.next()){
            for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
        {
            System.out.print(String.format("| %-10s", rs.getString(e)));
        }
            System.out.println();
        }
        
        //Display
        System.out.print("\nKode tabel: " + rSetMetaData.getColumnLabel(1) + "\nMasukan row kode yang akan dihapus: ");

        String str1 = sc.next();
        String sql = "DELETE FROM " + str + " WHERE " + rSetMetaData.getColumnLabel(1) + " = '"+ str1 + "'";
        try {
            statement = conn.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Data Terhapus");
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println("Gagal");
            System.out.println(sql);
            e.printStackTrace();
        }
        //sc.close();
    }
}
