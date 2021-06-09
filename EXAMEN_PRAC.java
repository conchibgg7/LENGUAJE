
package examen_prac;

import java.util.Arrays;


public class EXAMEN_PRAC {

   
    public static void main(String[] args) {
        int[] numeros = new int[6]; //crearlos con un numeros determinado de elementos
     
        for (int x=0;x<numeros.length;x++){
            for (int j=0;j<numeros.length;j++){
                if(x!=j){
                    if(numeros[x]==numeros[j]){ //para que no me lo repita 
                        numeros[x] = (int) (Math.random()*49); //de 0 a 49
                        x= 0;
                        j=0;
                    }
                  
                }
            }
        }
        
        System.out.println("COMBINACIÓN GANADORA DESORDENADA: ");  
        System.out.println("--------------------");
        
        for (int x=0;x<numeros.length;x++){ //para imprimirlo
            
            System.out.print(numeros[x]+" -");
            
        }
        
        System.out.println("\n");
        System.out.println("COMPLEMENTARIO");
        System.out.println("--------------------");
        
        int numeroAleatorio2 = (int) (Math.random()*49);
        System.out.println(numeroAleatorio2);
        
        //Ordena el array
        Arrays.sort(numeros);

        //Mostramos el array ya ordenado
        System.out.println("\nCOMBINACIÓN GANADORA ORDENADA: ");
        System.out.println("--------------------");
        for (int i : numeros) {
            System.out.print(i + "- ");
        }
        
        //PARES E IMPARES 
        System.out.println("\n\nPARES E IMPARES");
        System.out.println("--------------------");
        
        for (int x = 0; x < numeros.length; x++) {
            if (numeros[x] % 2 == 0)
                System.out.println("PAR: "+numeros[x]);
                
            else
                System.out.println("IMPAR: "+numeros[x]);
        }
        
        //PASARLO A CÓDGIO NUMÉRICO
        
        System.out.println("\nREPRESENTACIÓN CÓDIGO NÚMERICO");
        
        /*char characterValue = 'B';
        int asciiValue = (int) characterValue;
        System.out.println(asciiValue);*/
        
        char[] numero = new char[7];
        for (int x=0;x<numero.length;x++){
            for (int j=0;j<numero.length;j++){
                if(x!=j){
                    if(numero[x]==numero[j]){ //para que no me lo repita 
                        numero[x] = (char) (Math.random()*49+'A'); //de 0 a 49
                        x= 0;
                        j=0;
                    }
                  
                }
            }
        }
        
        System.out.println("COMBINACIÓN GANADORA DESORDENADA: ");  
        System.out.println("--------------------");
        
        for (int x=0;x<numero.length;x++){ //para imprimirlo
            
            System.out.print(numero[x]+" ");
            
        }
        
        System.out.println("\n");
        System.out.println("COMPLEMENTARIO");
        System.out.println("--------------------");
        
        char numeroAleatorio3 = (char) (Math.random()*49+'A');
        System.out.println(numeroAleatorio3);
        
        
        
    }
    
    
}
