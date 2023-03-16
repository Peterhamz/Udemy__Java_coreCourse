package Udemy__SqliteDatabase;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:/volume/TestDb/Testjsva.db");

            Statement statement = con.createStatement();
            statement.execute("CREATE table contacts ()");


           // statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while(results.next()){
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + "" +
                       results.getString("email"));
            }
            results.close();

            statement.close();
            con.close();



        }catch (SQLException e){
            System.out.println(" something went wrong " + e.getMessage());
        }
    }
}
