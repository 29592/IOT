package com.sd.fw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sd.fw.util.DBUtil;

public abstract class AbDao {
	public Connection connect(){
		Connection conn = null;
		try{
			conn = DBUtil.getConnection();
		}catch(RuntimeException ex){
			throw ex;
		}
		return conn;
	}

	public void close(Connection conn, PreparedStatement ps, ResultSet rs){
		if(rs != null){
			try{ rs.close(); } catch(Exception ex){}
		}		
		close(conn, ps);
	} // close
	
	public void close(Connection conn, PreparedStatement ps){
		if(ps != null){
			try{ ps.close(); } catch(Exception ex){}
		}
		
		if(conn != null){
			try{ conn.close(); } catch(Exception ex){}
		}
	} // close
}
