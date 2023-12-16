
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Para Probar
        System.out.println();
    }


    //Devolver el cuadrado de cada cifra de la variable de entrada en forma de un entero
    static int squareDigits(int n) {
        // TODO Implement me

        Integer auxInt = n;

        ArrayList<Integer> valores = new ArrayList<Integer>();

        String aux = auxInt.toString();

        for (int i = 0; i < aux.length(); i++)
            valores.add( (int) Math.pow(Character.getNumericValue(aux.charAt(i)),2) );

        aux = "";

        for(int i = 0; i < valores.size(); i++) {
            aux += valores.get(i).toString();
        }

        auxInt = Integer.parseInt(aux);

        return auxInt;
    }

    //Sumar numeros primos... Piramide de numeros Primos 1->1, 2->8, 3->27
    public static int rowSumOddNumbers(int n) {

        int suma = 0;

        int numPrimActual = 1;

        for(int i = 0; i < n; i++){
            numPrimActual += 2*i;
        }

        for(int i = 0; i < n; i++) {
            suma += numPrimActual;
            numPrimActual += 2;
        }

        return suma;
    }


    //Buscar un numero impar en un arreglo
    public static int findIt(int[] a) {

        int cantRep = 0;
        int aux = 0;

        for(int i = 0; i < a.length; i++){
            aux = a[i];
            cantRep = 0;

            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j])
                    cantRep++;
            }

            if(cantRep % 2 == 1)
                return aux;
        }
        return aux;
    }



    //Fibonacci Recursivo
    public static int fibonacci(int n){
        if(n == 2 || n == 1)
            return 1;
        if(n == 3)
            return 2;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    //Algoritmo para saber si un triangulo se puede formar con 3 lados
    public static boolean isTriangle(int a, int b, int c){

        int mayor = 0;
        int suma2Lados = 0;
        int posMayor = 0;
        int[] arreglo = {a,b,c};

        for(int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
                posMayor = i;
            }
        }
        for(int i = 0; i < arreglo.length; i++) {
            if(i!=posMayor)
                suma2Lados += arreglo[i];
        }

        return suma2Lados > mayor? true: false;

        //Algoritmo Optimo
        //return a + b > c && a + c > b && c + b > a;
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int value = 0;
        int binaryDecremento = binary.size()-1;

        for(int i = 0; i < binary.size(); i++){

            if(binary.get(i) != 0)
                value += Math.pow(2, (binaryDecremento*binary.get(i)));

            binaryDecremento--;
        }

        return value;

        //Declarar una lista en Java
        //List<Integer> a = List.of(1, 1, 1, 1);

        //Algoritmo Optimo
        //return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }

    public static String boolToWord(boolean b){
        return b? "Yes": "No";
    }

    

}






