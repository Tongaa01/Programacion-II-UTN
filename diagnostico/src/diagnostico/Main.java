package diagnostico;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int selec;
        Scanner selector = new Scanner(System.in);
        System.out.println("Elija entre los ejercicios:");
        System.out.println("1- Calculadora simple.");
        System.out.println("2- Conversos grados °F y °C.");
        System.out.println("3- Números aleatorios.");
        System.out.println("4- Primo o no.");
        selec = selector.nextInt();
        switch (selec){
            case 1:
                ejercicio1();
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
            case 4:
                ejercicio4();
        }
    }

// EJERCICIOS

    public static void ejercicio1(){
        int num1, num2;
        String operation;
        Scanner reader = new Scanner(System.in);
        System.out.println("___  _  ___");
        System.out.println("Ingrese un número:");
        num1 = reader.nextInt();
        System.out.println(num1+"  _  ___");
        System.out.println("Ingrese otro número:");
        num2 = reader.nextInt();
        System.out.println(num1+"  _  "+num2);
        System.out.println("Ingrese la operación a realizar (solo son válidos '+', '-', '*' y '/'");
        operation = reader.next();
        switch(operation) {
            case "+":
                numSum(num1, num2);
                break;
            case "-":
                numRest(num1, num2);
                break;
            case "*":
                numMult(num1, num2);
                break;
            case "/":
                numDiv(num1, num2);
                break;
            default:
                System.out.println("Ha ingresado una operación inválida.");
        }
    }

    public static void ejercicio2(){
        double temp, cTemp;
        String deg;
        Scanner reader = new Scanner(System.in);
        System.out.println("Elija a qué temperatura quiere convertir, (F)ahrenheit o (C)elsius:");
        deg = reader.next().toUpperCase();
        if (deg.equals("F")){
            System.out.println("Escriba la temperatura en Celsius:");
            temp = reader.nextDouble();
            cTemp = (temp * 1.8) + 32;
            System.out.println(temp+"°C equivalen a "+cTemp+"°F");
        } else if (deg.equals("C")) {
            System.out.println("Escriba la temperatura en Fahrenheit:");
            temp = reader.nextDouble();
            cTemp = (temp - 32) / 1.8;
            System.out.println(temp+"°F equivalen a "+cTemp+"°C");
        } else {
            System.out.println("Opción incorrecta.");
        }
    }

    public static void ejercicio3(){
        int num1, num2, temp, range, random;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num1 = reader.nextInt();
        System.out.println("Ingrese otro número:");
        num2 = reader.nextInt();
        if (num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        range = (num2 - num1) + 1;
        System.out.println("10 números aleatorios entre "+num1+" y "+num2+" son:");
        for (int i=0; i<10; i++){
            random = (int)(Math.random() * range) + num1;
            System.out.print(random+", ");
        }
    }

    public static void ejercicio4(){
        int prime;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un número para ver si es primo");
        prime = reader.nextInt();
        if (primeNumber(prime)){
            System.out.println("El número "+prime+" es primo.");
        } else {
            System.out.println("El número "+prime+" no es primo.");
        }
    }

    // Subprogramas

    public static void numSum (int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    public static void numRest (int num1, int num2) {
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
    }
    public static void numMult (int num1, int num2) {
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
    }
    public static void numDiv (int num1, int num2) {
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
    }
    public static boolean primeNumber(int prime){
        boolean checker;
        checker = true;
        for (int i=2; i<prime; i++){
            if (prime%i == 0) {
                checker=false;
                break;
            }
        }
        return checker;
    }
}
