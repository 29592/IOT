package jdbcex.dept;
public class Main3 {
	public static void main(String[] args) {
		DeptDAO deptDao = new DeptDAO(); 
		 
       //DeptNo: 51 , dname: test , loc : Incheon ���ڵ带 insert 
		DeptVO vo3 = new DeptVO();
		vo3.setDeptNo(51);  vo3.setDname("test"); vo3.setLoc("Incheon"); 
		int insertCnt = deptDao.insertDept(vo3) ;   
		System.out.println(insertCnt+" �� insert �Ϸ�"); 
	}
}
