package client.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import client.model.vo.Client;
import common.JDBCTemplate;

public class ClientDao {

	public Client selectOneClient(Connection conn, String cliId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Client client = null;
		String query = "select * from client_db where cli_id=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cliId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				client = new Client();
				client.setCliId(rset.getString("cli_id"));
				client.setCliPw(rset.getString("cli_pw"));
				client.setCliName(rset.getString("cli_name"));
				client.setCliNickname(rset.getString("cli_nickname"));
				client.setCliTel(rset.getString("cli_tel"));
				client.setCliEmail(rset.getString("cli_email"));
				client.setCliAddr(rset.getString("cli_addr"));
				client.setCliGender(rset.getString("cli_gender"));
				client.setCliBirth(rset.getString("cli_birth"));
				client.setCliEnrollDate(rset.getString("cli_enroll_date"));
				client.setCliAddrDet(rset.getString("cli_addr_det"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return client;
	}

	public int insertClient(Connection conn, Client client) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into client_db values(?,?,?,?,?,?,?,?,?,to_char(sysdate,'yyyy-mm-dd'),?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, client.getCliId());
			pstmt.setString(2, client.getCliPw());
			pstmt.setString(3, client.getCliName());
			pstmt.setString(4, client.getCliNickname());
			pstmt.setString(5, client.getCliTel());
			pstmt.setString(6, client.getCliEmail());
			pstmt.setString(7, client.getCliAddr());
			pstmt.setString(8, client.getCliGender());
			pstmt.setString(9, client.getCliBirth());
			pstmt.setString(10, client.getCliAddrDet());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public Client selectOneClient(Connection conn, Client client) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Client loginClient = null;
		String query = "select * from client_db where cli_id=? and cli_pw=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, client.getCliId());
			pstmt.setString(2, client.getCliPw());
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				loginClient = new Client();
				loginClient.setCliId(rset.getString("cli_id"));
				loginClient.setCliPw(rset.getString("cli_pw"));
				loginClient.setCliName(rset.getString("cli_name"));
				loginClient.setCliNickname(rset.getString("cli_nickname"));
				loginClient.setCliTel(rset.getString("cli_tel"));
				loginClient.setCliEmail(rset.getString("cli_email"));
				loginClient.setCliAddr(rset.getString("cli_addr"));
				loginClient.setCliGender(rset.getString("cli_gender"));
				loginClient.setCliBirth(rset.getString("cli_birth"));
				loginClient.setCliEnrollDate(rset.getString("cli_enroll_date"));
				loginClient.setCliAddrDet(rset.getString("cli_addr_det"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return loginClient;
	}

	public ArrayList<Client> searchId(Connection conn, String cliName, String cliTel) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Client> list = new ArrayList<Client>();
		String query = "select * from client_db where cli_name=? and cli_tel=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cliName);
			pstmt.setString(2, cliTel);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Client client = new Client();
				client.setCliId(rset.getString("cli_id"));
				client.setCliPw(rset.getString("cli_pw"));
				client.setCliName(rset.getString("cli_name"));
				client.setCliNickname(rset.getString("cli_nickname"));
				client.setCliTel(rset.getString("cli_tel"));
				client.setCliEmail(rset.getString("cli_email"));
				client.setCliAddr(rset.getString("cli_addr"));
				client.setCliGender(rset.getString("cli_gender"));
				client.setCliBirth(rset.getString("cli_birth"));
				client.setCliEnrollDate(rset.getString("cli_enroll_date"));
				client.setCliAddrDet(rset.getString("cli_addr_det"));
				list.add(client);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}

	public Client searchPw(Connection conn, String cliId, String cliTel) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Client client = null;
		String query = "select * from client_db where cli_id=? and cli_tel=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cliId);
			pstmt.setString(2, cliTel);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				client = new Client();
				client.setCliId(rset.getString("cli_id"));
				client.setCliPw(rset.getString("cli_pw"));
				client.setCliName(rset.getString("cli_name"));
				client.setCliNickname(rset.getString("cli_nickname"));
				client.setCliTel(rset.getString("cli_tel"));
				client.setCliEmail(rset.getString("cli_email"));
				client.setCliAddr(rset.getString("cli_addr"));
				client.setCliGender(rset.getString("cli_gender"));
				client.setCliBirth(rset.getString("cli_birth"));
				client.setCliEnrollDate(rset.getString("cli_enroll_date"));
				client.setCliAddrDet(rset.getString("cli_addr_det"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return client;
	}

	public int updatePw(Connection conn, String cliId, String cliPw) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "update client_db set cli_pw=? where cli_id=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cliPw);
			pstmt.setString(2, cliId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public int updateClient(Connection conn, Client client) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "update client_db set cli_pw=?, cli_nickname=?, cli_tel=?, cli_addr=?, cli_addr_det=? where cli_id=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, client.getCliPw());
			pstmt.setString(2, client.getCliNickname());
			pstmt.setString(3, client.getCliTel());
			pstmt.setString(4, client.getCliAddr());
			pstmt.setString(5, client.getCliAddrDet());
			pstmt.setString(6, client.getCliId());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

}
