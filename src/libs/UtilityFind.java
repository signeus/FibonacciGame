package libs;

import java.util.ArrayList;

public class UtilityFind {

	private ArrayList<Integer> fibonacciList;
	
	public UtilityFind(){
		fibonacciList = new ArrayList<Integer>();
	}
	
	public int getPositionFibonacci(int position){

		int actualNumber = 1;
        int oldNumber = 0;
        int nextNumber = 0;
        //int count = 0;
        
		for(int i = 1; i<=position; i++){
    		oldNumber = actualNumber;
        	actualNumber = nextNumber + actualNumber;
        	nextNumber = oldNumber;
        	fibonacciList.add(oldNumber);
        	//count++;
        	//System.out.println(count + " numero = " + oldNumber);
        	//Pequeña trampa para saber que números hay en la secuencia fibonacci.
    }
		return fibonacciList.get(fibonacciList.size()-1);
	}
}
