package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;


public class editData {

    public void name(Connection conn) throws SQLException {
        MainDisplay disp = new MainDisplay();
        Scanner sc = new Scanner(System.in);

        while (true) {

            
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Keluar...");
                sc.close();
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
                    deletData(conn);
                    System.out.print("NOT YET");
                    break;

                default:
                    break;
            }
        }
        //sc.close();
    }

    private void deletData(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//sc.next();
        

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
        
        
        System.out.println(rSetMetaData.getColumnLabel(1));
        String str1 = sc.nextLine();
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
