package ReadFlow;

import java.sql.*;  
import java.util.ArrayList;

public class  DB {
    
    public Connection conn;
    
    //SEMUA FORM YANG INSTANTIATE CLASS INI (DB) BISA MENGAKSES 2 VARIABLE DIBAWAH INI.
    public static String loggedInUser = ""; //HARUS STATIC KARENA DIPAKAI DI BANYAK CLASS LAIN.
    public static String loggedInNamaUser = ""; //HARUS STATIC KARENA DIPAKAI DI BANYAK CLASS LAIN.
    public static String role = ""; //HARUS STATIC KARENA DIPAKAI DI BANYAK CLASS LAIN.
    
    
    public void DB()
    {
        connectDB();
    }
    
    public boolean connectDB()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/readflow", "root", "");
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }
    
    public ResultSet getRS(String sql)
    {
        try {
            if (conn == null)
                connectDB();
            
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } 
        catch (SQLException err) 
        {
            err.printStackTrace();
            return null;
        }
    }
    
      public boolean Execute(String sql)
    {
        try {
            if (conn == null)
                connectDB();
            
            Statement st = this.conn.createStatement();
            int numberOfAffectedRecord = st.executeUpdate(sql);
            return numberOfAffectedRecord == 1;
        } 
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
            return false;
        }
    }
    
      public String getSettingValue(String namaParam)
      {
          String hasil = "";
          try 
          {
                String sql = "SELECT nilai_param FROM setting WHERE nama_param = '" + namaParam + "'";
                ResultSet rs = (ResultSet) this.getRS(sql);
                rs.next();
                hasil = rs.getString("nilai_param");
          } catch (Exception e) {
          }
          return hasil;
      }
      
}
