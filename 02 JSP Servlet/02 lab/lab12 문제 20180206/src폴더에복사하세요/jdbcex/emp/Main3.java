package jdbcex.emp;

public class Main3 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();

		EmpVO vo3 = new EmpVO();
		// insert �Ҷ����� ��� ��ȣ�� �ٲ㼭 �־�� �մϴ� ( Primary Key )
		vo3.setEmpNo(9001);
		vo3.setEname("kim");
		vo3.setJob("SALESMAN");
		int insertCnt = dao.insertEmp(vo3);
		System.out.println(insertCnt + " �� insert �Ϸ�");
	}
}
