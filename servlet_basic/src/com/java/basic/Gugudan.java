package com.java.basic;

public class Gugudan {

	private Service service;
	
	{
		service = new GugudanService();
		
		Input input = new GugudanInput();
		Output output = new GugudanBufferOutput();
		
		GugudanBufferOutput bufferOutput = (GugudanBufferOutput)output;
		
		
		GugudanService gugudanService = (GugudanService)service;
		gugudanService.setInput(input);
		gugudanService.setOutput(output);
	}
	public static void main(String[] args) {

		Gugudan main = new Gugudan();
		main.service.process();

	}

	

	


}
