package jdbcex.dept;
public class Main5 {
	public static void main(String[] args) {
		DeptDAO deptDao = new DeptDAO(); 
       
        //DeptNo가 51인 레코드 delete
		int deleteCnt =deptDao.deleteDept(51) ;
		System.out.println(deleteCnt+" 건 delete 완료");  
	}
}
