package jdbcex.dept;
public class Main5 {
	public static void main(String[] args) {
		DeptDAO deptDao = new DeptDAO(); 
       
        //DeptNo�� 51�� ���ڵ� delete
		int deleteCnt =deptDao.deleteDept(51) ;
		System.out.println(deleteCnt+" �� delete �Ϸ�");  
	}
}
