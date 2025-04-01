import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] Array = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
        boolean continuar = true;
        int metodo;

        while (continuar) {
            System.out.println("Metodos de Ordenamiento");
            System.out.println("1-> Burbuja");
            System.out.println("2-> Selección");
            System.out.println("3-> Inserción");
            System.out.println("4-> Burbuja Mejorado");
            System.out.println("5-> Salir");

            metodo = getPositive(scanner, "Ingrese la opción");

            if (metodo == 5) {
                System.out.println("Adios");
                continuar = false;
                break;
            }

            System.out.println("¿Deseas ver los pasos? (true/false): ");
            boolean conPasos = scanner.nextBoolean();

            String orden = getValidString(scanner, "¿Desea ver el orden Acendentemento o Decensdentemente",
                    new String[] { "A", "D" });

            switch (metodo) {
                case 1:
                    System.out.println("METODO BURBUJA");

                    if (conPasos == false) {
                        MetodoBurbuja mB = new MetodoBurbuja();
                        mB.imprimirArreglo(Array);
                        System.out.println(" ");
                        if (orden.equalsIgnoreCase("a")) {
                            mB.ordenar(Array, true);
                            mB.imprimirArreglo(Array);
                            System.out.println(" \n\n");
                        } else if (orden.equalsIgnoreCase("d")) {
                            mB.ordenar(Array, false);
                            mB.imprimirArreglo(Array);
                            System.out.println(" \n\n");
                        }
                        break;
                    } else if (conPasos == true) {
                        MetodoBurbuja mBP = new MetodoBurbuja();
                        System.out.println("Arreglo Original");
                        mBP.imprimirArreglo(Array);
                        if (orden.equalsIgnoreCase("a")) {
                            mBP.ordenarPasos(Array, true);
                            System.out.println("Arreglo Ordenado");
                            mBP.imprimirArreglo(Array);
                            System.out.println(" \n\n");
                        } else if (orden.equalsIgnoreCase("d")) {
                            mBP.ordenarPasos(Array, false);
                            System.out.println("Arreglo Ordenado");
                            mBP.imprimirArreglo(Array);
                            System.out.println(" \n\n");
                        }
                        break;
                    }

                case 2:
                    System.out.println("METODO SELECCIÓN");

                    if (conPasos == false) {
                        MetodoSeleccion mS = new MetodoSeleccion();
                        mS.printArray(Array);
                        System.out.println(" ");
                        if (orden.equalsIgnoreCase("a")) {
                            mS.ordenar(Array, true);
                            mS.printArray(Array);
                        } else if (orden.equalsIgnoreCase("d")) {
                            mS.ordenar(Array, false);
                            mS.printArray(Array);
                        }
                    } else if (conPasos == true) {
                        MetodoSeleccion mSP = new MetodoSeleccion();
                        System.out.println("Arreglo Original");
                        mSP.printArray(Array);
                        if (orden.equalsIgnoreCase("a")) {
                            mSP.ordenarPasos(Array, true);
                            System.out.println("Arreglo Ordenado ");
                            mSP.printArray(Array);
                        } else if (orden.equalsIgnoreCase("d")) {
                            mSP.ordenarPasos(Array, false);
                            System.out.println("Arreglo Ordenado ");
                            mSP.printArray(Array);
                        }
                        break;
                    }
                case 3:
                    System.out.println("METODO INSERCIÓN");
                    if (conPasos == false) {
                        MetodoInsercion mI = new MetodoInsercion();
                        mI.printArray(Array);
                        if (orden.equalsIgnoreCase("a")) {
                            mI.ordenarAcendente(Array);
                            mI.printArray(Array);
                        } else if (orden.equalsIgnoreCase("b")) {
                            mI.ordenarDecendente(Array);
                            mI.printArray(Array);
                        }
                    } else if (conPasos == true) {
                        MetodoInsercion mIP = new MetodoInsercion();
                        System.out.println("Arreglo Original");
                        mIP.printArray(Array);
                        if (orden.equalsIgnoreCase("a")) {
                            mIP.ordenarAcendentePasos(Array);
                            System.out.println("Arreglo Ordenado ");
                            mIP.printArray(Array);
                        } else if (orden.equalsIgnoreCase("b")) {
                            mIP.ordenarDecendentePasos(Array);
                            System.out.println("Arreglo Ordenado ");
                            mIP.printArray(Array);
                        }
                        break;
                    }

                case 4:
                    int[] resultados;
                    System.out.println("METODO BURBUJA MEJORADO");
                    MetodoBurbujaMejorado mBM = new MetodoBurbujaMejorado();
                    mBM.printArray(Array);
                    resultados = mBM.ordenarAcendente(Array);
                    mBM.printArray(Array);
                    System.out.println(" Comparaciones: -> " + resultados[0]);
                    System.out.println(" Cambios: -> " + resultados[1] + "\n\n");
                    break;
                default:
                    System.out.println("\n\nERROR: OPCIÓN INVALIDA \n\n INTENTELO NUEVAMENTE\n");
                    break;
            }
        }

    }

    public static int getPositive(Scanner scanner, String message) {
        int input;
        do {
            System.out.println(message + " : ");
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("El número debe ser positivo \n Intente nuevamente");
            }
        } while (input <= 0);
        return input;
    }

    public static String getValidString(Scanner scanner, String message, String[] posibles) {
        String input;
        boolean valido;

        do {
            System.out.println(message + " : ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }
        } while (!valido);
        return input;

    }
}
