package com.shankar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {




	public static void  register(String first, String last, String username, String password){
		
		String url="jdbc:h2:tcp://localhost/~/test";
        String uname="sa";
        String pass="";
        String query="insert into login values(?,?,?,?)";
        System.out.println("Hello");
        try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Connection conn;
		
        PreparedStatement st;
		try {
			conn = DriverManager.getConnection(url,uname,pass);
			st = conn.prepareStatement(query);
			 st.setString(1, first);
		        st.setString(2, last);
		        st.setString(3, username);
		        st.setString(4,password);
		        
		        	int count=st.executeUpdate();
		        	System.out.println(count + "inserted");
		        	st.close();
		        	
		        	
		        	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
      
        	
    

	}
	
	public static String checkPassword(String username){
		String url="jdbc:h2:tcp://localhost/~/test";
        String uname="sa";
        String pass="";
      
        System.out.println("Hello");
   
			try {
				Class.forName("org.h2.Driver");
   Connection conn = DriverManager.getConnection(url,uname,pass);
   String query="select password from login where uname='"+username+"'";
   Statement st=conn.createStatement();
   ResultSet rs=st.executeQuery(query);
   rs.next();
   String a=rs.getString(1);

    st.close();
    conn.close();
    return a;
   
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} 
		
	
		
	}
  
	
}


//
