package jdbcex.emp;

public class Main1 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		EmpVO vo1 = dao.getEmp(7900);
		System.out.println(vo1.getEmpNo() + ":" + vo1.getEname() + ":" + vo1.getJob());
	}
}
