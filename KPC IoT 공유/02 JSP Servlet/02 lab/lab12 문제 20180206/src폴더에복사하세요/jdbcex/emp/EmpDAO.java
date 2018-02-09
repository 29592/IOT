package jdbcex.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbcex.DBManager;

public class EmpDAO {
 public EmpVO getEmp(int EmpNo) {
		Connection conn = DBManager.getConnection();
		EmpVO vo = null;
		try {
			PreparedStatement stmt = null;
			ResultSet rs = null;
			stmt = conn
					.prepareStatement("SELECT empno, ename, job FROM emp WHERE empno = ?");
			stmt.setInt(1, EmpNo);
			rs = stmt.executeQuery();
			while (rs.next()) {
				vo = new EmpVO();
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				vo.setEmpNo(empno);
				vo.setEname(ename);
				vo.setJob(job);
			}
		} catch (SQLException e) {
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

 
	public ArrayList<EmpVO> getEmpList(int deptno) {
		Connection conn = DBManager.getConnection();
		ArrayList<EmpVO> arrayList = new ArrayList<EmpVO>();
		EmpVO vo = null;
		try {
			PreparedStatement stmt = null;
			ResultSet rs = null;
			stmt = conn.prepareStatement("SELECT * FROM emp where deptno = ?");
			stmt.setInt(1, deptno);
			rs = stmt.executeQuery();
			while (rs.next()) {
				vo = new EmpVO();
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				vo.setEmpNo(empno);
				vo.setEname(ename);
				vo.setJob(job);
				arrayList.add(vo);
			}
		} catch (SQLException e) {
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

	public int insertEmp(EmpVO vo) {
		Connection conn = DBManager.getConnection();
		int resultCnt = 0;
		try {
			PreparedStatement stmt = null;
			stmt = conn
					.prepareStatement("Insert into emp (empno, ename, job) values(?, ?, ?)");
			stmt.setInt(1, vo.getEmpNo());
			stmt.setString(2, vo.getEname());
			stmt.setString(3, vo.getJob());
			resultCnt = stmt.executeUpdate();
		} catch (SQLException e) {
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

	public int deleteEmp(int empNo) {
		Connection conn = DBManager.getConnection();
		int resultCnt = 0;
		try {
			PreparedStatement stmt = null;
			stmt = conn.prepareStatement("DELETE FROM emp WHERE empno = ?");
			stmt.setInt(1, empNo);
			resultCnt = stmt.executeUpdate();
		} catch (SQLException e) {
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
	
	public int updateEmp(EmpVO vo) {
		Connection conn = DBManager.getConnection();
		int resultCnt = 0;
		try {
			PreparedStatement stmt = null;
			stmt = conn
					.prepareStatement("UPDATE emp SET ename = ?, job = ? where empno = ?");
			stmt.setString(1, vo.getEname());
			stmt.setString(2, vo.getJob());
			stmt.setInt(3, vo.getEmpNo());
			resultCnt = stmt.executeUpdate();
		} catch (SQLException e) {
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
