package com.sd.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sd.fw.dao.AbDao;
import com.sd.shop.vo.MemVO;

public class MemDAO extends AbDao {
	private static MemDAO dao = new MemDAO();
	public static MemDAO getInstance(){
		return dao;
	}
	
	public MemVO getCustomer(String customerId){
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = connect();
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT mem_id, mem_nm, mem_cd, pwd, pwd_hint, pwd_hint_ans, ssn, birth_dt, ");
			query.append("        male_flg, tel_no, cell_no, addr, email, email_rcv_flg, mem_reg_dtm ");
			query.append("FROM tb_mem ");
			query.append("WHERE mem_id = ? ");
						
			ps = conn.prepareStatement( query.toString() );
			ps.setString(1, customerId);
			rs = ps.executeQuery();
			while(rs.next()){
				MemVO vo = new MemVO();
				
			    vo.setMemId(rs.getString(1));
			    vo.setMemNm(rs.getString(2));
			    vo.setMemCd(rs.getString(3));
			    vo.setPwd(rs.getString(4));
			    vo.setPwdHint(rs.getString(5));
			    vo.setPwdHintAns(rs.getString(6));
			    vo.setSsn(rs.getString(7));
			    vo.setBirthDt(rs.getString(8));
			    vo.setMaleFlg(rs.getString(9));
			    vo.setTelNo(rs.getString(10));
			    vo.setCellNo(rs.getString(11));
			    vo.setAddr(rs.getString(12));
			    vo.setEmail(rs.getString(13));
			    vo.setEmailRcvFlg(rs.getString(14));
			    vo.setMemRegDtm(rs.getString(15));
			    
				return vo;
			}
		}catch(Exception ex){
			System.out.println("getCustomer exception : " + ex);
			close(conn, ps, rs);
		}
		
		return null;
	} // getCustomer
	
	public MemVO getCustomer(String memId, String pwd){
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = connect();
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT mem_id, mem_nm, mem_cd, pwd, pwd_hint, pwd_hint_ans, ssn, birth_dt, ");
			query.append("        male_flg, tel_no, cell_no, addr, email, email_rcv_flg, mem_reg_dtm ");
			query.append("FROM tb_mem ");
			query.append("WHERE mem_id = ? ");
			query.append("AND   pwd = ? ");
						
			ps = conn.prepareStatement( query.toString() );
			ps.setString(1, memId);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			while(rs.next()){
				MemVO vo = new MemVO();
				
			    vo.setMemId(rs.getString(1));
			    vo.setMemNm(rs.getString(2));
			    vo.setMemCd(rs.getString(3));
			    vo.setPwd(rs.getString(4));
			    vo.setPwdHint(rs.getString(5));
			    vo.setPwdHintAns(rs.getString(6));
			    vo.setSsn(rs.getString(7));
			    vo.setBirthDt(rs.getString(8));
			    vo.setMaleFlg(rs.getString(9));
			    vo.setTelNo(rs.getString(10));
			    vo.setCellNo(rs.getString(11));
			    vo.setAddr(rs.getString(12));
			    vo.setEmail(rs.getString(13));
			    vo.setEmailRcvFlg(rs.getString(14));
			    vo.setMemRegDtm(rs.getString(15));
			    
				return vo;
			}
		}catch(Exception ex){
			System.out.println("getCustomer exception : " + ex);
			close(conn, ps, rs);
		}
		
		return null;
	} // getCustomer

}

