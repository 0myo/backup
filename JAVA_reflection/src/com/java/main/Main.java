package com.java.main;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
//		TargetClass instance = new TargetClass();		
//		instance.a();
		
		try {
			Class<?> classType =  Class.forName(args[0]);
			
			Method[] methods = classType.getMethods();
			if(methods!=null) for(Method method : methods){
				if(method.getName().equals("b")) {
					Object instance = classType.newInstance();
					method.invoke(instance, null);
				}
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
