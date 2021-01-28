package com.jdbctest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import com.jdbc.util.ConnectionUtility;

public class Client {
public void  getClientValues() {
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	 con=ConnectionUtility.getObj();
	try {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the operations any one of these select,insert,selectall,delete,update");
		String operator=sc.next();
	    switch(operator) {
	    case"insert":
	    {
            System.out.println("enter clientid");
            int client_id=sc.nextInt();
            System.out.println("enter clientname");
            String client_name=sc.next();
            System.out.println("enter clientemail");
            String client_email=sc.next();
            System.out.println("enter clientadd");
            String client_address=sc.next();
            System.out.println("enter clientno");
            String client_cno=sc.next();
			pst=con.prepareStatement("insert into client_details values(?,?,?,?,?)");
			pst.setInt(1,client_id);
			pst.setString(2, client_name);
			pst.setString(3, client_email);
			pst.setString(4, client_address);
			pst.setString(5,client_cno);
		
			int i=pst.executeUpdate();
	        if(i>0) {
				System.out.println("insertd successfully");
			}else {
				System.out.println("not inserted");
			}
	    }
	    case"update":    
	    {
	    	 System.out.println("enter clientid");
	            int client_id=sc.nextInt();
	            System.out.println("enter clientname");
	            String client_name=sc.next();
	            System.out.println("enter clientemail");
	            String client_email=sc.next();
	            System.out.println("enter clientadd");
	            String client_address=sc.next();
	            System.out.println("enter clientno");
	            String client_cno=sc.next();
				pst=con.prepareStatement("update client_details set client_name=?,client_email=?,client_address=?,client_cno=? where client_id=?");
				pst.setInt(5,client_id);
				pst.setString(1, client_name);
				pst.setString(2, client_email);
				pst.setString(3, client_address);
				pst.setString(4,client_cno);
			
				int i=pst.executeUpdate();
		        if(i>0) {
					System.out.println("updated successfully");
				}else {
					System.out.println("not updated");
				}
		    
	    }
	    case"selectall":
	    {
	
		pst=con.prepareStatement("select * from client_details");
		 rs=pst.executeQuery();
       while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "  +rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		} 
	    }
	    case"select":
	    {
	    	
	    	System.out.println("enter clientid");
            int client_id=sc.nextInt();
	  
		pst=con.prepareStatement("select * from client_details where client_id=?");
	       pst.setInt(1,client_id);
		 rs=pst.executeQuery();
		  while(rs.next()) {
				System.out.println(rs.getString("client_name")+"   "+rs.getString("client_email")+"   "  +rs.getString("client_address")+" "+rs.getString("client_cno"));
			} 
	    } 
	    
	    case"delete":
	    {
	     	System.out.println("enter clientid");
            int client_id=sc.nextInt();
	  
		pst=con.prepareStatement("delete from client_details where client_id=?");
		pst.setInt(1,client_id);
	    
		int i=pst.executeUpdate();
        if(i>0) {
			System.out.println("deleted successfully");
		}else {
			System.out.println("not deleted");
		}
	    }
	    
	    }
		
	}catch(Exception e) {
		try {
		rs.close();
		pst.close();
		con.close();
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	Client c= new Client();
	c.getClientValues();
}
}
