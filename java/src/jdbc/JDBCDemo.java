package jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        PreparedStatement insertStmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtility.getConnection();
            System.out.println("✅ Connected to MySQL!");

            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "department VARCHAR(50))";

            stmt = conn.createStatement();
            stmt.executeUpdate(createTableSQL);

            // Insert data
            String insertSQL = "INSERT INTO student (id, name, department) VALUES (?, ?, ?)";
            insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setInt(1, 1);
            insertStmt.setString(2, "Rishi Kokil");
            insertStmt.setString(3, "Computer Engineering");

            int rows = insertStmt.executeUpdate();
            System.out.println(rows + " row inserted.");

            // Fetch data
            rs = stmt.executeQuery("SELECT * FROM student");
            System.out.println("\nStudent Records:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getString("department"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	JDBCUtility.close(rs);
        	JDBCUtility.close(insertStmt);
        	JDBCUtility.close(stmt);
        	JDBCUtility.close(conn);
        }
    }
}
