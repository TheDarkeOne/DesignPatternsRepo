import java.sql.*;

public class SQLiteTesting {
    String ClassPath;

    public static void createNewTable(String classpath) {

        String classpath1 = classpath;


        String sql = "CREATE TABLE IF NOT EXISTS tree(\n"
                + " id integer PRIMARY KEY,\n"
                + " parentId integer,\n"
                + " query string real\n"
                + ");";

        try{
            Connection conn = DriverManager.getConnection(classpath1);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connect() {
        // SQLite connection string
        String classpath = ClassPath;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(classpath);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void insert(int parentId, String query) {
        String sql = "INSERT INTO tree (parentId,query) VALUES(?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, parentId);
            pstmt.setString(2, query);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String createNewDatabase(String fileName) {

        String Classpath = "jdbc:sqlite:C:\\Users\\Ammon Zerkle\\IdeaProjects\\" + fileName;

        createNewTable(Classpath);

        try (Connection conn = DriverManager.getConnection(Classpath)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Classpath;
    }
}
