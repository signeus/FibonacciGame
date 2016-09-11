import java.util.Scanner;

import libs.ClassicMode;
import libs.InverseMode;
import libs.UtilityFind;

public class GameApp {

	public static void main(String[] args) {
		System.out.println("¿Quieres jugar al Fibonacci Game?, y/n");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if(!response.toUpperCase().equals("Y")){
        	System.out.println("Supongo que no quieres jugar en este momento... T.T");
            sc.close();
        	return;
        }

		System.out.println("Selecciona el modo de juego:");
		System.out.println("1. Classic");
		System.out.println("2. Inverse");
		System.out.println("3. Utility - Buscar número fibonacci por posición");
		int puntuacion = 0;
		if(!sc.hasNextInt()){
	        sc.close();
			return;
		}
		int option = sc.nextInt();
        switch (option){
        case 1 :
        	ClassicMode cm = new ClassicMode();
        	puntuacion = cm.startClassicGame();
        	System.out.println("Su puntuación es de: " + puntuacion);
        	System.out.println("-----FIN-----");
        	break;
        case 2:
        	InverseMode im = new InverseMode();
        	puntuacion = im.startInverseGame();
        	System.out.println("Su puntuación es de: " + puntuacion);
        	System.out.println("-----FIN-----");
        	break;
        case 3:
        	UtilityFind uf = new UtilityFind();
        	System.out.println("¿Qué posición buscas?");
    		int position = sc.nextInt();
        	int number = uf.getPositionFibonacci(position);
        	System.out.println("El número que buscas es: " + number);
        	System.out.println("Espero que haya sido de ayuda ^-^");
        	System.out.println("-----FIN-----");
        	break;
        default:
        	System.out.println("Supongo que no quieres jugar en este momento... T.T");
        	break;
        }
        sc.close();
	}

}
