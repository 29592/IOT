package jdbcex.emp;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpVO> empList = dao.getEmpList(10);
		System.out.println("--10�� �μ� ��� ����---");
		for (EmpVO vo2 : empList) {
			System.out.println(vo2.getEmpNo() + ":" + vo2.getEname() + ":" + vo2.getJob());
		}
	}
}
