package awtproject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import awtproject.bean.User;

public class UserDao {

public static Connection getConnection() throws ClassNotFoundException, SQLException {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tri@28");
			}
		
			public boolean fetchUserByUsernameAndPassword(String username, String pass) {
				Connection con = null;
				PreparedStatement ps = null;
				String sql = "select * from emp where username=? and password=?";
				try {
					con = getConnection();
					ps = con.prepareStatement(sql);
					ps.setString(1, username);
					ps.setString(2, pass);
					ResultSet rs = ps.executeQuery();
					if(rs.next()) {
						return true;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				return false;
			}
			/**
			 * return user by username
			 * @param username
			 * @return user object if matches else null;
			 */
			public static User getUserByUsername(String username) {
				Connection con = null;
				PreparedStatement ps = null;
				String sql = "select * from emp where username=?";
				try {
					con = getConnection();
					ps = con.prepareStatement(sql);
					ps.setString(1, username);
					ResultSet rs = ps.executeQuery();
					User user= new User();
					if(rs.next()) {
					 user.setUsername(username);
						user.setUsername(rs.getString("username"));
						user.setAge(rs.getInt("age"));
						user.setId(rs.getInt("id"));
						user.setDepartment(rs.getString("department"));
					}
					return user;
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return null;}
			public boolean updateUser(User user) {
				Connection con = null;
				PreparedStatement ps = null;
				String sql = "update emp set username=?, password=?,age=?,id=?,department=? where username=?";
				try {
					con = getConnection();
					ps = con.prepareStatement(sql);
					ps.setString(1, user.getUsername());
					ps.setString(2, user.getPassword());
					ps.setInt(3, user.getAge());
					ps.setInt(4, user.getId());
					ps.setString(5, user.getDepartment());
					ps.executeUpdate();
					return true;
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						ps.close();
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				return false;
			}
}
		
