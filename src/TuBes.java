
import java.sql.*;
import java.util.*;


public class TuBes {
    
    
    public static void main(String[] args) {
        String serverName = "localhost";
        String databaseName = "TRANSPORTASI_PUBLIK_DB";
        String user = "user1";
        String password = "user1234";
        String url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName;
        //TuBes tuBes = new TuBes();
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            //tuBes.prepare(connection);
            System.out.println("Login Berhasil");

            TuBes window = new TuBes();
            
            window.features(conn);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Kesalahan ketika login");
            e.printStackTrace();
        }

    }


    private void features(Connection conn) throws SQLException {
        Control.MainDisplay mainDisplay = new Control.MainDisplay();
        Control.editData editorData = new Control.editData();
        data.Prepare prepare = new data.Prepare();


        Scanner sc = new Scanner(System.in);
        mainDisplay.displayTabel(conn);

        mainDisplay.Display();
        
        

        while (true) {
            
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Keluar...");
                sc.close();
                break;
            }
            // TODO: Menjalankan fitur
            switch (choice) {
            case 1:
            try {
                mainDisplay.displayTabel(conn);
                mainDisplay.showTabel(conn);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            } 
                break;

            case 2:
                editorData.name(conn);
                System.out.println("NOT YET");
                break;
            case 3:
            System.out.println("NOT YET");    
            try {
                prepare.preparing(conn);
                break;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("sto[[ed");
            }
            
            
            }
        }
    }

}
