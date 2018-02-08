
class Test {
	public static void main(String[] args) {
		int i0 = 10;

		Integer obj1 = new Integer(i0); // Boxing
		obj1 = 10; // AutoBoxing

		int i1 = obj1.intValue(); // UnBoxing
		i1 = obj1; // Auto UnBoxing

		Object value = 10; // AutoBoxing
		
		int i2 = (Integer) value;  //UnBoxing
		//Object형==> Integer형 ==> int형으로 형변환
		int i3 = (int) value;   //UnBoxing
		//Object형==> Integer형 ==> int형으로 형변환 
		
		String str="123";
		int num =Integer.parseInt(str) ;
		//문자열을 숫자로 형변환 할 때 
	} 
}
