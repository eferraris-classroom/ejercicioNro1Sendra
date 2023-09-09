package ar.edu.undef.fie;

//  Generar un programa que sume los numeros enteros pasados por linea de comando y de el resultado a traves de la consola

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No se proporcionaron números para sumar.");
            return;
        }

        // args.length : devuelve la cantidad de argumentos

        int suma = 0; // inicio una variable en 0 para sumar los argumentos

        for (String argumento : args) { // for-each     for(Tipo Variable : coleccion)
            int numero = Integer.parseInt(argumento); // creo variable numero y convierto la cadena en int
            suma += numero; // sumamos y almacenamos cada argumento
        }

        System.out.println("La suma de los números es: " + suma);
    }
}




