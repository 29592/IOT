package jdbcex.emp;

public class Main3 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();

		EmpVO vo3 = new EmpVO();
		// insert 할때마다 사원 번호를 바꿔서 넣어야 합니다 ( Primary Key )
		vo3.setEmpNo(9001);
		vo3.setEname("kim");
		vo3.setJob("SALESMAN");
		int insertCnt = dao.insertEmp(vo3);
		System.out.println(insertCnt + " 건 insert 완료");
	}
}
