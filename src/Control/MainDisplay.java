package Control;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;





public class MainDisplay {
    Scanner sc = new Scanner(System.in);
    public void Display() {

        System.out.println("\n===============\nPerintah tersedia:\n1. Tampilkan isi tabel\n2. Edit Tabel\n3. Masukan Dummy Data\n4. Special Query\n0. Keluar");

        System.out.print("Selamat Datang\n\nSilahkan masukan perintah anda (Angka 0 - 3): ");
    }

    public void displayTabel(Connection conn) throws SQLException {
        //int counter = 0;
        DatabaseMetaData md = conn.getMetaData();
        String[] types = {"TABLE"};
        ResultSet rs = md.getTables(/*"TRANSPORTASI_PUBLIK_DB"*/null, null, "%",types /*new String [] {"TRANSPORTASI_PUBLIK_DB"}*/);
        while (rs.next()) {
            if (rs.getString("TABLE_NAME").equalsIgnoreCase("trace_xe_action_map") || rs.getString("TABLE_NAME").equalsIgnoreCase("trace_xe_event_map")||rs.getString("TABLE_NAME").equalsIgnoreCase("sysdiagrams"))
                continue;
            else {
            //System.out.println(rs.getString("TABLE_NAME"));
            System.out.printf("%-30.30s", rs.getString("TABLE_NAME"));
            System.out.printf("\t");
            rs.next();
            if (rs.getString("TABLE_NAME").equalsIgnoreCase("trace_xe_action_map") || rs.getString("TABLE_NAME").equalsIgnoreCase("trace_xe_event_map")||rs.getString("TABLE_NAME").equalsIgnoreCase("sysdiagrams"))
                continue;
            else
                System.out.printf("%-30.30s%n", rs.getString("TABLE_NAME"));
            }

        }
    }


    public void showTabel(Connection conn) throws SQLException {
        while(true){
            
            try {
                System.out.println("\nMasukan nama tabel yang ingin dilihat (Masukan \"Kembali\" untuk mengakhiri perintah ini)");
                String str = sc.next();
                if(str.equalsIgnoreCase("kembali"))
                break;
                
                
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

                while (rs.next())
                {
                    for(int e = 1; e <= rSetMetaData.getColumnCount(); e++)
                {
                    System.out.print(String.format("| %-10s", rs.getString(e)));
                }
                    System.out.println();
                 }
                        }

            catch (Exception e) {
                //TODO: handle exception
                System.out.println("Invalid Input");
            }

        }

        
    }



    

    public void cls (){
        try {
            new ProcessBuilder("cmd", "/C", "cls").inheritIO().start().waitFor();
        } catch (Exception exc) {
            System.out.println("ERROR: internal");
            System.exit(1);
        }
    }

}
