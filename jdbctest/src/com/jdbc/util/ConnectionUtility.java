package com.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {
	private static Connection con;

	private ConnectionUtility() {
	}

	public static Connection getObj() {
		
Connection con=null;
		try {
			FileInputStream fis=new FileInputStream("database.properties");
			Properties prop =new Properties();
			prop.load(fis);
			
			String dclass=prop.getProperty("driverclass");
			String url=prop.getProperty("durl");
			String user=prop.getProperty("duser");
			String pwd=prop.getProperty("dpwd");
			Class.forName(dclass);
			if(con==null) {
		 con = DriverManager.getConnection(url,user,pwd);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		return con;

	}

}
