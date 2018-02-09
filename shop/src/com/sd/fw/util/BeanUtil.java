package com.sd.fw.util;

import java.lang.reflect.Method;

public class BeanUtil {
	public static void print(Object obj){
		try{
			if(obj == null)
				return;
			
			Class c = obj.getClass();
			System.out.println("============" + c.getName() + " �� ��  ���� ======================");
			Method[] ms = c.getDeclaredMethods();
			for(int i = 0; i < ms.length; i++){
				if(ms[i].getName().indexOf("get") == 0){ // get���� �����Ѵٸ�.
					System.out.print(ms[i].getName().substring(3) + " : ");
					Object value = ms[i].invoke(obj, null);
					System.out.println(value);
				}
			}
			System.out.println("============" + c.getName() + " �� ��  ���� ======================");
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public static String getString(Object obj){
		StringBuffer sb = new StringBuffer();
		try{
			if(obj == null)
				return null;
			
			Class c = obj.getClass();
			
			sb.append("============" + c.getName() + " �� ��  ���� ======================\n");
			Method[] ms = c.getDeclaredMethods();
			for(int i = 0; i < ms.length; i++){
				if(ms[i].getName().indexOf("get") == 0){ // get���� �����Ѵٸ�.
					sb.append(ms[i].getName().substring(3) + " : ");
					Object value = ms[i].invoke(obj, null);
					sb.append(value + "\n");
				}
			}
			sb.append("============" + c.getName() + " �� ��  ���� ======================\n");
		}catch(Exception ex){
			System.out.println(ex);
		}
		return sb.toString();
	}
}
