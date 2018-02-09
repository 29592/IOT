package com.sd.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sd.fw.dao.AbDao;
import com.sd.shop.vo.CategoryVO;

public class CategoryDAO extends AbDao {
	private static CategoryDAO dao = new CategoryDAO();
	public static CategoryDAO getInstance(){
		return dao;
	}
	

	public ArrayList<CategoryVO> getCategoryList(){
		ArrayList<CategoryVO> list = new ArrayList<CategoryVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = connect();
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT category_no, category_nm, category_desc, reg_id, reg_dtm FROM tb_category ");
			
			ps = conn.prepareStatement( query.toString() );

			rs = ps.executeQuery();
			while(rs.next()){
				CategoryVO cvo = new CategoryVO();
			    cvo.setCategoryNo(rs.getString(1));
			    cvo.setCategoryNm(rs.getString(2));
			    cvo.setCategoryDesc(rs.getString(3));
			    cvo.setRegId(rs.getString(4));
			    cvo.setRegDtm(rs.getString(5));
				list.add(cvo);
			}
		}catch(Exception ex){
			System.out.println("getCategoryList exception : " + ex);
			close(conn, ps, rs);
		}
		
		return list;
	} // getGoodsList
	
	
}
