package desktopreader;


import java.sql.Connection;
import java.util.Date;
import java.sql.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class baglanti {
    private static final String username="root";
    private static final String password="demetkizilbuga";
private static final String conn_string="jdbc:mysql://localhost:3306/deneme";
    //private int id;
    Connection conn=null;
    Statement myStat = null;
    ResultSet myRs = null;
    
   /* public int getUSerInfo() throws SQLException{
        conn=DriverManager.getConnection(conn_string,username,password);
            myStat = (Statement) conn.createStatement();
            
            myRs = myStat.executeQuery("SELECT * FROM user ")
    } */
    
    public baglanti() throws SQLException{
        try {
            conn=DriverManager.getConnection(conn_string,username,password);
            myStat = (Statement) conn.createStatement();
           
  Statement stmt=(Statement) conn.createStatement();
            /* int res=stmt.executeUpdate(insert);
             System.out.println(res); */
             
           baglanti a =new baglanti();
        ArrayList<Integer> user= new ArrayList<Integer>();
        
        a.myRs=a.myStat.executeQuery("select id from user ");
           int i=0;
         while(a.myRs.next()){
              user.add(a.myRs.getInt("id"));
                // System.out.println(user.get(i));
                  i++;
            }
           baglanti b =new baglanti();
           ArrayList<Integer> kullanici= new ArrayList<Integer>();
        
       // b.myRs=b.myStat.executeQuery("select id from kullanici ");
        i=0;
        /* while(b.myRs.next()){
              
                kullanici.add(b.myRs.getInt("id"));
                 System.out.println(kullanici.get(i));
                  i++;
            }*/
        //b.myStat.executeUpdate(insert);
         i=1;
           while(i<user.get(user.size())){
               if(user.get(i)==i){
                   String insert ="INSERT INTO kullanici(username,password) VALUES ('user"+i+"','user"+i+"')";
                   
               }
               i++;
           }
           
        } catch (SQLException e) {
           System.err.println(e);
        }
    }}
    

