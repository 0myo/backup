package com.jsp.calculator;

public class Test {
	public static void main(String[] args) {
		ParamMap param = ParamMap.init();
		param.put("test","value");
		String data = param.getString("test");
		
		param.put("key", 10);
		int data2 = param.getInt("key1");
		
		StringBuffer sb = new StringBuffer();
		sb.append("test'test");
		param.put("key2", sb);
		StringBuffer sb2 = param.get("key2", StringBuffer.class);
	}
}
