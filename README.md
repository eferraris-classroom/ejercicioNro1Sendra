# EjercicioNro1
Ejercicio nro 1 clase 8/9

# Enunciado
Ingresar valores por argumento y mostrar la suma de dichos valores

# Codigo

        if (args.length == 0) 
        {
                    System.out.println("No se proporcionaron números para sumar.");
                    return;
        }

        
        int suma = 0; 

        for (String argumento : args) 
        {
            int numero = Integer.parseInt(argumento); 
            suma += numero; 
        }

        System.out.println("La suma de los números es: " + suma);

# Terminal (args : 1 2 3)
La suma de los números es: 6

# Teoria

          if (args.length == 0) {

Este bloque if verifica si no se proporcionaron argumentos en la línea de comandos.
args es un arreglo de cadenas que contiene los argumentos pasados al programa cuando se ejecuta desde la línea de comandos.
args.length devuelve la cantidad de argumentos.
Si no se proporcionan argumentos (la longitud del arreglo es igual a 0), se ejecuta el bloque de código dentro de este if.

        for (String arg : args) {
        
Aquí comienza un bucle for-each que recorre todos los argumentos pasados por línea de comandos. 
La variable arg tomará el valor de cada argumento en cada iteración.

    for (Tipo elemento : colección) {
        // Cuerpo del bucle
    }

    Tipo: El tipo de datos de los elementos en la colección.
    elemento: Una variable que representa el elemento actual en cada iteración del bucle.
    colección: La colección o arreglo a través de la cual se desea iterar.

Otro ejemplo

    int[] numeros = {1, 2, 3, 4, 5};
    
    for (int numero : numeros) {
        System.out.println(numero);
    }

            int numero = Integer.parseInt(arg);

Dentro del bucle, se convierte cada argumento (que es una cadena) en un número entero utilizando Integer.parseInt(arg) y se almacena en la variable numero.
