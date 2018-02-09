package com.sd.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import com.sd.fw.dao.AbDao;
import com.sd.shop.vo.ProductVO;

public class ProductDAO extends AbDao {
	private static ProductDAO dao = new ProductDAO();
	public static ProductDAO getInstance(){
		return dao;
	}
	
	public ProductVO getGoods(String goodsCode){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = connect();
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT prd_no, prd_nm, category_no, prd_des, sell_prc_unit, sell_start_dt, sell_end_dt, ");
			query.append("       dlv_constraint, as_flg, return_flg, img_org_file_nm, img_gen_file_nm, reg_id, reg_dtm ");
			query.append("FROM tb_product ");
			query.append("WHERE prd_no = ? "); 		
			ps = conn.prepareStatement( query.toString() ); 
			ps.setString(1, goodsCode);
			rs = ps.executeQuery();
			if(rs.next()){
				ProductVO gvo = new ProductVO();
			    gvo.setPrdNo(rs.getString(1));
			    gvo.setPrdNm(rs.getString(2));
			    gvo.setCategoryNo(rs.getString(3));
			    gvo.setPrdDes(rs.getString(4));
			    gvo.setSellPrcUnit(rs.getInt(5));
			    gvo.setSellStartDt(rs.getString(6));
			    gvo.setSellEndDt(rs.getString(7));
			    gvo.setDlvConstraint(rs.getString(8));
			    gvo.setAsFlg(rs.getString(9));
			    gvo.setReturnFlg(rs.getString(10));
			    gvo.setImgOrgFileNm(rs.getString(11));
			    gvo.setImgGenFileNm(rs.getString(12));
			    gvo.setRegId(rs.getString(13));
			    gvo.setRegDtm(rs.getString(14));
				return gvo;
			}
		}catch(Exception ex){
			System.out.println("getGoods exception : " + ex);
			close(conn, ps, rs);
		}
		
		return null;			
	}
	
//	public ArrayList getGoodsList(String categoryCode, String goodsName, int startPirce, int endPirce){
//		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		try{
//			conn = connect();
//			if(categoryCode == null){
//				ps = conn.prepareStatement("select GOODSCODE, GOODSNAME, PRODUCTNO, PRICE, COUNT, COMPANY, COUNTRY, RESERVE, SMALLIMAGE, LARGEIMAGE, MIDDLEIMAGE, DESCRIBE, APPLYDATE, CATEGORYCODE from GOODS where GOODSNAME like ? and price >= ? and price <= ? order by APPLYDATE desc");
//				ps.setString(1, "%" + goodsName + "%");
//				ps.setInt(2, startPirce);
//				ps.setInt(3, endPirce);
//			}else{
//				ps = conn.prepareStatement("select GOODSCODE, GOODSNAME, PRODUCTNO, PRICE, COUNT, COMPANY, COUNTRY, RESERVE, SMALLIMAGE, LARGEIMAGE, MIDDLEIMAGE, DESCRIBE, APPLYDATE, CATEGORYCODE from GOODS where CATEGORYCODE = ? and GOODSNAME like ? and price >= ? and price <= ? order by APPLYDATE desc");
//				ps.setString(1, categoryCode);
//				ps.setString(2, "%" + goodsName + "%");
//				ps.setInt(3, startPirce);
//				ps.setInt(4, endPirce);
//			}
//
//			rs = ps.executeQuery();
//			while(rs.next()){
//				ProductVO gvo = new ProductVO();
//				gvo.setGoodsCode(rs.getString(1));
//				gvo.setGoodsName(rs.getString(2));
//				gvo.setProductNo(rs.getString(3));
//				gvo.setPrice(rs.getInt(4));
//				gvo.setCount(rs.getInt(5));
//				gvo.setCompany(rs.getString(6));
//				gvo.setConuntry(rs.getString(7));
//				gvo.setReserve(rs.getInt(8));
//				gvo.setSmallImage(rs.getString(9));
//				gvo.setLargeImage(rs.getString(10));
//				gvo.setMiddleImage(rs.getString(11));
//				gvo.setDescribe(rs.getString(12));
//				gvo.setApplyDate(rs.getString(13));
//				gvo.setCategoryCode(rs.getString(14));
//				list.add(gvo);
//			}
//		}catch(Exception ex){
//			System.out.println("getGoodsList exception : " + ex);
//			close(conn, ps, rs);
//		}
//		
//		return list;		
//	}
	
	public ArrayList<ProductVO> getGoodsList(String categoryCode){
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = connect();
			
			StringBuffer query = new StringBuffer();
			query.append("SELECT prd_no, prd_nm, category_no, prd_des, sell_prc_unit, sell_start_dt, sell_end_dt, ");
			query.append("       dlv_constraint, as_flg, return_flg, img_org_file_nm, img_gen_file_nm, reg_id, reg_dtm ");
			query.append("FROM tb_product ");
						
			if( "ALL".equals( categoryCode ) || categoryCode == null || categoryCode.equals("")){ 
				query.append("ORDER BY reg_dtm DESC "); 
				ps = conn.prepareStatement( query.toString() );				
			} else {
				query.append("WHERE category_no = ? "); 
				query.append("ORDER BY reg_dtm DESC "); 
				ps = conn.prepareStatement( query.toString() );
				ps.setString(1, categoryCode);				 
			}

			rs = ps.executeQuery();
			while(rs.next()){
				ProductVO gvo = new ProductVO();
			    gvo.setPrdNo(rs.getString(1));
			    gvo.setPrdNm(rs.getString(2));
			    gvo.setCategoryNo(rs.getString(3));
			    gvo.setPrdDes(rs.getString(4));
			    gvo.setSellPrcUnit(rs.getInt(5));
			    gvo.setSellStartDt(rs.getString(6));
			    gvo.setSellEndDt(rs.getString(7));
			    gvo.setDlvConstraint(rs.getString(8));
			    gvo.setAsFlg(rs.getString(9));
			    gvo.setReturnFlg(rs.getString(10));
			    gvo.setImgOrgFileNm(rs.getString(11));
			    gvo.setImgGenFileNm(rs.getString(12));
			    gvo.setRegId(rs.getString(13));
			    gvo.setRegDtm(rs.getString(14));
				list.add(gvo);
			}
		}catch(Exception ex){
			System.out.println("getGoodsList exception : " + ex);
			close(conn, ps, rs);
		} 
		
		return list;
	} // getGoodsList
	
	public int setGoods(String goodsCode, String goodsName){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = connect();
			
			StringBuffer query = new StringBuffer();
			query.append("insert into tb_product (prd_no, prd_nm, CATEGORY_NO, REG_DTM ) " + 
					"values (?,?, 'CAT000000001', to_char(sysdate,'YYYYMMDDHH24MISS'))"); 		
			ps = conn.prepareStatement( query.toString() ); 
			ps.setString(1, goodsCode);
			ps.setString(2, goodsName);
			rs = ps.executeQuery();
			close(conn, ps, rs);
			return 0;	
			
		}catch(Exception ex){
			System.out.println("setGoods exception : " + ex);
			close(conn, ps, rs);
			return 1;	
		}
				
	}
	
	
	public static void main(String args[]){
		ProductDAO dao = ProductDAO.getInstance();
		/*ArrayList<ProductVO> list = dao.getGoodsList("CAT000000003");
		Iterator<ProductVO> iter = list.iterator();
		while (iter.hasNext()) {
			Object tmp = (Object) iter.next();
			System.out.println(tmp);
		}*/
		System.out.println(dao.setGoods("2qe", "qwe"));
	}
}
