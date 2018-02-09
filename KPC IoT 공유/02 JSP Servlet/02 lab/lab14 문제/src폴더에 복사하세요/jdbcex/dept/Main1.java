package jdbcex.dept;
public class Main1 {
	public static void main(String[] args) {
		DeptDAO deptDao = new DeptDAO(); 
        //10번 부서 정보 select 
		DeptVO vo1 = deptDao.getDept(10); 
		System.out.println(vo1.getDeptNo()+":"+vo1.getDname()+":"+ vo1.getLoc()); 
	}
}
