package jdbcex.emp;
public class Main5 {
	public static void main(String[] args) {
        EmpDAO dao = new EmpDAO();
		int deleteCnt = dao.deleteEmp(9001);
		System.out.println(deleteCnt + " °Ç delete ¿Ï·á");
	}
}
