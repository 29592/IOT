package jdbcex.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbcex.DBManager;

public class DeptDAO {
	/**
	 * 매개인자로 받은 deptNo(부서번호)를 조회 조건으로 하여 Dept 테이블에서 한 건의 데이터를 select한 후, 그 결과를
	 * DeptVO 객체에 담아 반환
	 */
	public DeptVO getDept(int deptNo) {
		Connection conn = null;
		DeptVO vo = null;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			// TODO 이곳에 프로그램을 완성하고 Main1 클래스를 실행하세요
			stmt = conn.prepareStatement(" SELECT dname, loc FROM dept " + " WHERE deptno = ?  ");
			stmt.setInt(1, deptNo);
			rs = stmt.executeQuery();
			while (rs.next()) {
				vo = new DeptVO();
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo.setDeptNo(deptNo);
				vo.setDname(dname);
				vo.setLoc(loc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}

	/*
	 * Dept 테이블의 모든 레코드를 select하여 한 건씩 DeptVO 객체에 담고, ArrayList에 각 DeptVO 객체를
	 * 저장하여 ArrayList를 반환
	 */
	public ArrayList<DeptVO> getDeptList() {
		Connection conn = null;
		ArrayList<DeptVO> arrayList = new ArrayList<DeptVO>();
		DeptVO vo = null;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			// TODO 이곳에 프로그램을 완성하고 Main2 클래스를 실행하세요
			stmt = conn.prepareStatement("SELECT deptNo, dname, loc From dept");
			rs = stmt.executeQuery();
			while (rs.next()) {
				vo = new DeptVO();
				int deptNo = rs.getInt("deptNo");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo.setDeptNo(deptNo);
				vo.setDname(dname);
				vo.setLoc(loc);
				arrayList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arrayList;
	}

	/* 매개인자로 받은 DeptVO 객체의 내용을 Dept테이블에 저장 */
	public int insertDept(DeptVO vo) {
		Connection conn = null;
		int resultCnt = 0;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			stmt = conn.prepareStatement("insert into dept ( deptNo, dname, loc ) values (?,?,?) ");
			stmt.setInt(1, vo.getDeptNo());
			stmt.setString(2, vo.getDname());
			stmt.setString(3, vo.getLoc());
			resultCnt = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCnt;
	}

	/*
	 * 매개인자로 받은 DeptVO 객체에서 deptno 값을 갖는 레코드의 내용을 매개인자로 받은 DeptVO 객체의 dname과 loc
	 * 값으로 갱신
	 */
	public int updateDept(DeptVO vo) {
		Connection conn = null;
		int resultCnt = 0;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			stmt = conn.prepareStatement("update dept set dname=? , loc=? where deptNo = ? ");
			stmt.setString(1, vo.getDname());
			stmt.setString(2, vo.getLoc());
			stmt.setInt(3, vo.getDeptNo());
			resultCnt = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCnt;
	}

	/* 매개 인자로 받은 deptNo 값을 갖는 레코드를 Dept테이블에서 삭제 */
	public int deleteDept(int deptNo) {
		Connection conn = null;
		int resultCnt = 0;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			stmt = conn.prepareStatement("delete from dept where deptNo =?"); 
			stmt.setInt(1,deptNo);
			resultCnt = stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCnt;
	}
}
