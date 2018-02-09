package jdbcex.emp;
public class Main4 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
       
		EmpVO vo4 = new EmpVO();
		vo4.setEmpNo(9001);
		vo4.setEname("lee");
		vo4.setJob("MM");
		int updateCnt = dao.updateEmp(vo4);
		System.out.println(updateCnt + " °Ç update ¿Ï·á");  
	}
}
