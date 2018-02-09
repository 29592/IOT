package jdbcex.dept;
import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		DeptDAO deptDao = new DeptDAO(); 
 		//모든 부서 정보 select 
		ArrayList<DeptVO> list = deptDao.getDeptList(); 
		for(DeptVO vo2 : list){
		 System.out.println(vo2.getDeptNo()+":"+vo2.getDname()+":"+vo2.getLoc()); 
		}
	}
}
