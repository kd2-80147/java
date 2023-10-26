package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersDao implements AutoCloseable {
	private Connection con;

	public UsersDao() {
		try {
			con = UtilityDao.getConnetion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public java.util.Date parse(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = new Date();
		try {
		date = sdf.parse(str);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	//Display all elements
	public List<Users> findAll() throws SQLException{
		List<Users> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					Users user = new Users();
					user.setId(rs.getInt("id"));
					user.setFname(rs.getString("first_name"));
					user.setLname(rs.getString("last_name"));
					user.setEmail(rs.getString("email"));
					user.setPass(rs.getString("password"));
					user.setStatus(rs.getBoolean("status"));
					user.setRole(rs.getString("role"));
					java.util.Date jDate =  rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String bdate = sdf.format(jDate);
					user.setDate(bdate);
					list.add(user);
				}
			} 
		}
		return list;
	}
	
	//Delete by Id
	public int deleteById(int id) throws SQLException{
		String sql = "DELETE FROM users WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//Add a user
	public int addUser(Users user) throws SQLException{
		String sql = "INSERT INTO users VALUES(default, ?, ?, ? , ? , ?, ?, ?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPass());
			java.util.Date date = parse(user.getDate());
			java.sql.Date sDate = new java.sql.Date( date.getTime() );
			stmt.setDate(5, sDate);
			stmt.setBoolean(6, user.isStatus());
			stmt.setString(7, user.getRole());
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
	}
	
	//Change User Status by Id
	public int changeStatusById(int id) throws SQLException{
		String sql = "UPDATE users SET status = true WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateUser(Users user) throws SQLException{
		String sql = "UPDATE users SET first_name = ?, last_name = ?, email = ?, password = ?, dob = ?, status = ?, role = ? WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPass());
			java.util.Date date = parse(user.getDate());
			java.sql.Date sDate = new java.sql.Date( date.getTime() );
			stmt.setDate(5, sDate);
			stmt.setBoolean(6, user.isStatus());
			stmt.setString(7, user.getRole());
			stmt.setInt(8, user.getId());
			int cnt = stmt.executeUpdate();
			
			return cnt;
		}
	}
	
	@Override
	public void close() {
		try {
			if(con != null) {
				con.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
