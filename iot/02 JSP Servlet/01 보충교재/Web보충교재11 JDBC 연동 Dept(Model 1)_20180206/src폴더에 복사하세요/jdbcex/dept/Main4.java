package jdbcex.dept;
public class Main4 {
	public static void main(String[] args) {
		DeptDAO deptDao = new DeptDAO(); 
       
		//DeptNo: 51 , dname: test2, loc : Seoul 로 update 
		DeptVO vo4 = new DeptVO();
		vo4.setDeptNo(51);  vo4.setDname("test2"); vo4.setLoc("Seoul"); 
		int updateCnt =deptDao.updateDept(vo4); 
		System.out.println(updateCnt+" 건 update 완료");  
	}
}
