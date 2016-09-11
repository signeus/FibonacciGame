package libs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InverseMode {

	private Random rd;
	private Scanner sc;
	private ArrayList<Integer> fibonacciList;
	
	public InverseMode(){
		rd = new Random();
		sc = new Scanner(System.in);
		fibonacciList = new ArrayList<Integer>();
	}
	
	public int startInverseGame(){
		int numBucle = rd.nextInt(30);
		while(numBucle < 10){
			numBucle = rd.nextInt(30);
		}

		int actualNumber = 1;
        int oldNumber = 0;
        int nextNumber = 0;
        //int count = 0;
        
        for(int i = 1; i<=numBucle; i++){
        		oldNumber = actualNumber;
	        	actualNumber = nextNumber + actualNumber;
	        	nextNumber = oldNumber;
	        	fibonacciList.add(oldNumber);
	        	//count++;
	        	//System.out.println(count + " numero = " + oldNumber);
	        	//Pequeña trampa para saber que números hay en la secuencia fibonacci.
        }
        
		//System.out.println("Hay un total de... " + fibonacciList.size() + " del numBucle: " + numBucle);
        //Determina cuantos registros hay.
		
		int max = fibonacciList.size()-1;
		int inverseCount = max;
		int numberCorrect = 0;
		boolean isCorrect = true;
		int countScore = 0;
		
		System.out.println("¿Cual es el número anterior a "+ fibonacciList.get(max) + ", en la secuencia de fibonacci?");

		if(!sc.hasNextInt())
			return 0;
		int insertNumber = sc.nextInt();
		while(isCorrect){
			if(insertNumber == 0)
				return countScore;
			inverseCount--;
			numberCorrect = fibonacciList.get(inverseCount);
			if(insertNumber != numberCorrect){
				isCorrect = false;
				continue;
			}
			
			System.out.println("¡Correcto!, continua...");
			countScore++;

			if(!sc.hasNextInt())
				return countScore;
			insertNumber = sc.nextInt();
		}
        
        
        return countScore;
	}
	
}
