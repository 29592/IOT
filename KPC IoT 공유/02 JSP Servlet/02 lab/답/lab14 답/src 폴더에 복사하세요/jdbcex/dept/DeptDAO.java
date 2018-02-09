package jdbcex.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbcex.DBManager;

public class DeptDAO {
	/**
	 * �Ű����ڷ� ���� deptNo(�μ���ȣ)�� ��ȸ �������� �Ͽ� Dept ���̺��� �� ���� �����͸� select�� ��, �� �����
	 * DeptVO ��ü�� ��� ��ȯ
	 */
	public DeptVO getDept(int deptNo) {
		Connection conn = null;
		DeptVO vo = null;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			// TODO �̰��� ���α׷��� �ϼ��ϰ� Main1 Ŭ������ �����ϼ���
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
	 * Dept ���̺��� ��� ���ڵ带 select�Ͽ� �� �Ǿ� DeptVO ��ü�� ���, ArrayList�� �� DeptVO ��ü��
	 * �����Ͽ� ArrayList�� ��ȯ
	 */
	public ArrayList<DeptVO> getDeptList() {
		Connection conn = null;
		ArrayList<DeptVO> arrayList = new ArrayList<DeptVO>();
		DeptVO vo = null;
		try {
			conn = DBManager.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			// TODO �̰��� ���α׷��� �ϼ��ϰ� Main2 Ŭ������ �����ϼ���
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

	/* �Ű����ڷ� ���� DeptVO ��ü�� ������ Dept���̺� ���� */
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
	 * �Ű����ڷ� ���� DeptVO ��ü���� deptno ���� ���� ���ڵ��� ������ �Ű����ڷ� ���� DeptVO ��ü�� dname�� loc
	 * ������ ����
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

	/* �Ű� ���ڷ� ���� deptNo ���� ���� ���ڵ带 Dept���̺��� ���� */
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
