package libs;

import java.util.Scanner;

public class ClassicMode {

	public Scanner sc;
	
	public ClassicMode(){
		sc = new Scanner(System.in);
	}
	
	public int startClassicGame(){
		System.out.println("¿Cómo empieza la secuencia fibonacci?");
		
		if(!sc.hasNextInt())
			return 0;
	    int insertNumber = sc.nextInt(); // Recogemos el valor dentro de "insertNumber" y se lo asignamos según venga de teclado.
	    
	    if(insertNumber != 1){
	    	System.out.println("No estas preparado para este juego... ¬,¬");
	    	return 0;
	    }
	    boolean isCorrect = true;
	    int actualNumber = insertNumber;
	    int oldNumber = 0;
	    int nextNumber = 0;
	    int count = 0;
	
	    while(isCorrect){
	    		oldNumber = actualNumber;
	        	actualNumber = nextNumber + actualNumber;
	        	System.out.println("¿Siguiente?");
	        	
	        	if(!sc.hasNextInt())
	    			return count;
	        	insertNumber = sc.nextInt();
	        	if(insertNumber != actualNumber){
	        		isCorrect = false;
	        	}
	        	nextNumber = oldNumber;
	        	count++;
	    }
	    return count;
	}
}
