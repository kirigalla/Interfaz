import javax.swing.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends JFrame
{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion, otra_opcion, otra_opcion2;
        char letra;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Elija la opcion deseada");
            System.out.println("1.-Descuento");
            System.out.println("2.-Convertir un numero decial en binario");
            System.out.println("3.-Conversion de grados");
            System.out.println("4.-¿Cuales son positivos y cuales negativos?");
            System.out.println("5.-Factura");
            System.out.println("6.-Area y perimetro");
            System.out.println("7.-Tabla de valores");
            System.out.println("8.-Factorial de un numero natural");
            System.out.println("9.-Calculadora basica");
            System.out.println("Programa realizado por 3IV8 Rivas Gutierrez Leonardo");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    boolean pregunta;
                    int edad, descuento, costo, precio;
                    System.out.println("Ingresa el precio:");
                    precio = entrada.nextInt();

                    System.out.println("Introduzca su edad");
                    edad = entrada.nextInt();
                    if (edad >= 65) {
                        costo = (precio*60)/100;
                    }
                    else
                    {
                        if (edad <= 21)
                            System.out.println("Escriba true o false para indicar si tus padres son socios");
                        pregunta = entrada.nextBoolean();
                        if (pregunta == true ) {
                            costo = (precio*55)/100;
                        }
                        else
                        {
                            costo = (precio*75)/100;
                        }
                        System.out.println("Pague "+ costo);
                    }
                    break;

                case 2:
                    int numero, exp, digito;
                    double binario;

                    do{
                        System.out.print("Introduce un numero entero >= 0: ");
                        numero = sc.nextInt();
                    }while(numero < 0);

                    exp=0;
                    binario=0;
                    while(numero!=0){
                        digito = numero % 2;
                        binario = binario + digito * Math.pow(10, exp);
                        exp++;
                        numero = numero/2;
                    }
                    System.out.printf("Binario: %.0f %n", binario);
                    break;

                case 3:{
                    double F, C, K, R;

                    System.out.println("1.-Convertir de Fahrenheit en Celcius");
                    System.out.println("2.-Convertir de Fahrenheit en Kelvine");
                    System.out.println("3.-Convertir de Fahrenheit en Rankine");

                    otra_opcion2 = entrada.nextInt();
                    switch (otra_opcion2) {
                        case 1:
                            System.out.println("Ingresa los grados Fahrenheit");
                            F = entrada.nextDouble();
                            C = F - 36;
                            System.out.println(C + " grados Celcius");
                            break;

                        case 2:
                            System.out.println("Ingresa los grados Fahrenheit");
                            F = entrada.nextDouble();
                            K = (F-32)*(5/9)+273.15;
                            System.out.println(K + " grados Kelvin");
                            break;

                        case 3:
                            System.out.println("Ingresa los grados Fahrenheit");
                            F = entrada.nextDouble();
                            R = F+459.67;
                            System.out.println(R + " grados Rankine");
                            break;

                    }
                    }
                    break;

                case 4:
                    System.out.println("Profe no pude hacerlo :b");
                    break;

                case 5:
                    System.out.println("Profe no pude hacerlo :b");
                    break;


                case 6:
                    int lado, altura, lado2, lado3, resultado, resultado2;

                        System.out.println("1.-Area y Perimetro de un Cuadrado");
                        System.out.println("2.-El perimetro de un triangulos");
                        System.out.println("3.-El volumen de una esfera y un cilindro");

                        otra_opcion = entrada.nextInt();
                        switch (otra_opcion){
                            case 1:
                                System.out.println("Ingresa el valor del lado del cuadrado");
                                lado = entrada.nextInt();
                                resultado = 4*lado;
                                resultado2 = lado*lado;
                                System.out.println("El perimetro del rectangulo " +resultado);
                                System.out.println("El area del rectangulo " +resultado2);
                                break;

                            case 2:
                                System.out.println("Ingresa el valor del lado 1 del triangulo");
                                lado = entrada.nextInt();

                                System.out.println("Ingresa el valor del lado 2 del triangulo");
                                lado2 = entrada.nextInt();

                                System.out.println("Ingresa el valor del lado 3 del triangulo");
                                lado3 = entrada.nextInt();

                                System.out.println("Ingresa el valor de la altura del triangulo");
                                altura = entrada.nextInt();

                                resultado = lado+lado2+lado3;
                                resultado2 = (altura*lado)/2;

                                System.out.println("El perimetro del triangulo es " +resultado);
                                System.out.println("El area del triangulo es " +resultado2);
                                break;

                            case 3:
                                System.out.println("Introduce el valor del radio de la esfera");
                                lado = entrada.nextInt();
                                System.out.println("Introduce el valor de la altura del cilindro");
                                altura = entrada.nextInt();
                                System.out.println("Introduce el valor del radio del cilindro");
                                lado2 = entrada.nextInt();

                                System.out.println("El volumen de una esfera");
                                resultado = (4/3)*(lado*lado*lado)*(3);
                                System.out.println("El volumen de un cilindro");
                                resultado2 = (lado2*lado2)*(3)*(altura);
                                break;
                        }

                    break;

                case 7:

                    String[][] tabla = new String[11][11];
                    tabla[0][0] = "N";
                    tabla[1][0] = "1";
                    tabla[2][0] = "2";
                    tabla[3][0] = "3";
                    tabla[4][0] = "4";
                    tabla[5][0] = "5";
                    tabla[6][0] = "6";
                    tabla[7][0] = "7";
                    tabla[8][0] = "8";
                    tabla[9][0] = "9";
                    tabla[10][0] = "10";
                    tabla[1][1] = "10";
                    tabla[1][2] = "100";
                    tabla[1][3] = "1000";
                    tabla[2][1] = "20";
                    tabla[2][2] = "200";
                    tabla[2][3] = "2000";
                    tabla[3][1] = "30";
                    tabla[3][2] = "300";
                    tabla[3][3] = "3000";
                    tabla[4][1] = "40";
                    tabla[4][2] = "400";
                    tabla[4][3] = "4000";
                    tabla[5][1] = "50";
                    tabla[5][2] = "500";
                    tabla[5][3] = "5000";
                    tabla[6][1] = "60";
                    tabla[6][2] = "600";
                    tabla[6][3] = "6000";
                    tabla[7][1] = "70";
                    tabla[7][2] = "700";
                    tabla[7][3] = "7000";
                    tabla[8][1] = "80";
                    tabla[8][2] = "800";
                    tabla[8][3] = "8000";
                    tabla[9][1] = "90";
                    tabla[9][2] = "900";
                    tabla[9][3] = "9000";
                    tabla[10][1] = "100";
                    tabla[10][2] = "1000";
                    tabla[10][3] = "10000";

                    DefaultTableModel modelo = new DefaultTableModel();
                    modelo.addColumn("N");
                    modelo.addColumn("1");
                    modelo.addColumn("2");
                    modelo.addColumn("3");
                    modelo.addColumn("4");
                    modelo.addColumn("5");
                    modelo.addColumn("6");
                    modelo.addColumn("7");
                    modelo.addColumn("8");
                    modelo.addColumn("9");
                    modelo.addColumn("10");

                    String[]p1={"10","100","1000"};
                    String[]p2={"20","200","2000"};
                    String[]p3={"30","300","3000"};
                    String[]p4={"40","400","4000"};
                    String[]p5={"50","500","5000"};
                    String[]p6={"60","600","6000"};
                    String[]p7={"70","700","7000"};
                    String[]p8={"80","800","8000"};
                    String[]p9={"90","900","9000"};
                    String[]p10={"100","1000","10000"};

                    modelo.addRow(p1);
                    modelo.addRow(p2);
                    modelo.addRow(p3);
                    modelo.addRow(p4);
                    modelo.addRow(p5);
                    modelo.addRow(p6);
                    modelo.addRow(p7);
                    modelo.addRow(p8);
                    modelo.addRow(p9);
                    modelo.addRow(p10);

                    JTable table = new JTable(modelo);
                    //table.setBounds();

                    for(int i = 0; i < 10; i++){
                        for(int j = 0; j < 11; j++){
                            System.out.print(tabla[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 8:
                    System.out.println("Profe no pude hacerlo :b");
                    break;

                case 9:
                    Scanner scanner = new Scanner(System.in);
                    double res = 0;
                    String operacion;
                    boolean comprobar = false;

                    do{

                        String numero1;
                        do {
                            System.out.println("\n Por favor, dame el primer número de la operación. ");
                            numero1 = sc.nextLine();
                        } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        double nume1 = Double.parseDouble(numero1);
                        double n1 = new Double(numero1);

                        do {
                            System.out.println("\n ¿Que operación desea hacer? (Solo coloque un signo)");
                            System.out.println("Teniendo en cuenta que: \n + = sumar \n - = restar \n"
                                    + " x = multiplicar \n / = dividir \n * = elevar primer número al segundo numero."
                                    + "\n % = residuo");
                            operacion = sc.nextLine();
                            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") ||
                                    operacion.equals("X") || operacion.equals("/") || operacion.equals("%") ||
                                    operacion.equals("*")) {
                                comprobar = true;
                            }else { comprobar = false; }
                        } while (comprobar != true);

                        String numero2;
                        do {
                            System.out.println("\n Por favor, dame el segundo número.");
                            numero2 = sc.nextLine();
                        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        double nume2 = Double.parseDouble(numero2);
                        double n2 = new Double(numero2);

                        do{
                            comprobar = true;
                            switch(operacion){
                                case "+":
                                    res = n1 + n2;
                                    break;
                                case "-":
                                    res = n1 - n2;
                                    break;
                                case "x":
                                case "X":
                                    res = n1 * n2;
                                    break;
                                case "/":
                                    while(n2 == 0){
                                        do {
                                            System.err.println(" En el denominador se encuentra \n"
                                                    + "un cero, para evitar errores coloca otro número.");
                                            numero2 = sc.nextLine();
                                        }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                        nume2 = Double.parseDouble(numero2);
                                        n2 = new Double(numero2);
                                    }
                                    res = n1 / n2;
                                    break;
                                case "*":
                                    res = Math.pow(n1, n2);
                                    break;
                                case "%":
                                    while(n2 == 0){
                                        do {
                                            System.err.println(" En el denominador se encuentra \n"
                                                    + "un cero, para evitar errores coloca otro número.");
                                            numero2 = sc.nextLine();
                                        }while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                                        nume2 = Double.parseDouble(numero2);
                                        n2 = new Double(numero2);
                                    }
                                    res = n1 % n2;
                                    break;
                            }
                        }while(comprobar != true);

                        System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
                        System.out.println("\n ¿Desea hacer alguna otra operación? \n");
                        System.out.println(" [s/n]");
                        do{
                            comprobar = true;
                            operacion = sc.nextLine();

                            switch (operacion) {
                                case "s":
                                case "S":
                                case "n":
                                case "N":
                                    break;
                                default:
                                    System.err.println("\n Error, ponga un literal valido. \n");
                                    comprobar = false;
                            }
                        }while(comprobar != true);
                    }while(operacion.equals("s") || operacion.equals("S"));
                    break;
            }
            System.out.println("Programa realizado por 3IV8 Rivas Gutierrez Leonardo");
            System.out.println("¿Deseas volver al menu?, si lo deseas escribe s");
            letra = entrada.next().charAt(0);
        }while(letra == 's');
    }
}
