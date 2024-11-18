package jdbcconnection;

import java.sql.*;

public class JdbcDemo {
    
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:mysql://localhost:3306/quizdatabase";
        String username = "root";
        String password = "";
        String query = "select question_Title from Question where id=3";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        rs.next();
        String name = rs.getString("question_Title");
        
        System.out.println(name);
        st.close();
        con.close();
    }
}
