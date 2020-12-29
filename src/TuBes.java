
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
        Control.SpecialSQL spes = new Control.SpecialSQL();
        data.Prepare prepare = new data.Prepare();


        Scanner sc = new Scanner(System.in);
        
        
        
        
        while (true) {
            mainDisplay.displayTabel(conn);
            mainDisplay.Display();
            try {
            
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
                    mainDisplay.cls();
                    mainDisplay.displayTabel(conn);
                    mainDisplay.showTabel(conn);
                    mainDisplay.cls();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            } 
                break;

            case 2:
                editorData.name(conn);
                
                break;
            case 3:
    
            try {
                prepare.preparing(conn);
                break;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("sto[[ed");
            }
            case 4:

                spes.driperCode(conn);
                break;
            
            }
            } catch(InputMismatchException e) {
                System.out.println("Error");
                e.printStackTrace();
                sc.nextLine();
                //sc = new Scanner(System.in);
            } 
        }
            
    }

}
