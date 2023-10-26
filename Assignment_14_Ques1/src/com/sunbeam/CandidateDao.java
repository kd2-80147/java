package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao implements AutoCloseable {
	private Connection con;

	public CandidateDao() {
		try {
		con = UtilityDao.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//Increment Vote
	public int incrementByVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes = votes + 1 WHERE id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	//Delete By Id
	public int deleteById(int id) throws SQLException{
		String sql = "DELETE FROM candidates WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//Find All
	public List<Candidate> findAll() throws SQLException{
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) { 
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int vote = rs.getInt("votes");
					Candidate c = new Candidate(id,name,party,vote);
					list.add(c);
				}
			}
		}
		return list;
	}
	//Find By a Given Party
	public List<Candidate> findByGivenParty(String givenByParty) throws SQLException{
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, givenByParty);
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int vote = rs.getInt("votes");
					Candidate c = new Candidate(id,name,party,vote);
					list.add(c);
				}
			}
		}
		return list;
	}
	
	//Save a given candidate
	public int saveGivenCandidate(Candidate c) throws SQLException{
		String sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			String name = c.getName();
			stmt.setString(1, name);
			String party = c.getParty();
			stmt.setString(2, party);
			int vote = c.getVotes();
			stmt.setInt(3, vote);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int update(Candidate c) throws SQLException{
		String sql = "UPDATE candidates SET name = ?, party = ?, votes = ? WHERE id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	public List<PartyWiseVotes> partyWiseVotes() throws SQLException{
		List<PartyWiseVotes> list = new ArrayList<>();
		String sql = "SELECT party,SUM(votes)\"votes\" FROM candidates GROUP BY party ORDER BY party;";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
				String party = rs.getString("party");
				int vote = rs.getInt("votes");
				PartyWiseVotes p = new PartyWiseVotes(party,vote);
				list.add(p);
				}
			}
		}
		return list;
	}
	
	@Override
	public void close() {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
