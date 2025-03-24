package RetosProgramacion;

public class reto02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * DIFICULTAD EXTRA (opcional):
		 * Crea un programa que imprima por consola todos los números comprendidos
		 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
		 *
		 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
		 */
		
		int c=10;
		
		
		do {
			
			if((c%2==0) && (c!=16) &&(c%3==0))
					
				System.out.println(c);	
				
			 c++;	
				
		}		
		while (c<=55);
		 
		
		
		
		
		

	}

}
