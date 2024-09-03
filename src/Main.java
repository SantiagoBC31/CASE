import java.util.Scanner;
// Santiago Bustos Coca
// CASE
// 03/09/2024
public class Main {
    public static void main(String[] args) {
        double resultado;
        double primerNumero;
        double segundoNumero;
        int operacion;
        int seguirOperando;
        int opciones;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("¿Qué quieres hacer? Calcular porcentajes o ver estado de estudiante");
            System.out.println("1. Calcular nota de estudiante");
            System.out.println("2. Calcular ley de Ohm");
            opciones = teclado.nextInt();
            switch (opciones) {
                case 1:
                    System.out.print("Ingrese la nota de tareas del Corte 1: ");
                    double tareasCorte1 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de quiz del Corte 1: ");
                    double quizCorte1 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de parcial del Corte 1: ");
                    double parcialCorte1 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de tareas del Corte 2: ");
                    double tareasCorte2 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de quiz del Corte 2: ");
                    double quizCorte2 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de parcial del Corte 2: ");
                    double parcialCorte2 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de tareas del Corte 3: ");
                    double tareasCorte3 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de quiz del Corte 3: ");
                    double quizCorte3 = teclado.nextDouble();
                    System.out.print("Ingrese la nota de parcial del Corte 3: ");
                    double parcialCorte3 = teclado.nextDouble();
                    double promedioCorte1 = (tareasCorte1 + quizCorte1 + parcialCorte1) / 3;
                    double promedioCorte2 = (tareasCorte2 + quizCorte2 + parcialCorte2) / 3;
                    double promedioCorte3 = (tareasCorte3 + quizCorte3 + parcialCorte3) / 3;
                    double notaDefinitiva = (promedioCorte1 * 0.35) + (promedioCorte2 * 0.35) + (promedioCorte3 * 0.30);
                    System.out.printf("Nota definitiva: %.2f\n", notaDefinitiva);
                    if (notaDefinitiva >= 3 && notaDefinitiva <= 5) {
                        System.out.println("Aprobado");
                    } else if (notaDefinitiva >= 1.9 && notaDefinitiva < 3) {
                        System.out.println("Habilita");
                    } else if (notaDefinitiva >= 0 && notaDefinitiva <= 1.9) {
                        System.out.println("Reprueba");
                    } else {
                        System.out.println("Error en las notas ingresadas");
                    }
                    break;
                case 2:
                    System.out.println("¿Qué quieres encontrar?");
                    System.out.println("1. Voltaje");
                    System.out.println("2. Resistencia");
                    System.out.println("3. Intensidad");
                    operacion = teclado.nextInt();
                    if (operacion == 1) {
                        System.out.println("Elegiste hallar voltaje.");
                        System.out.print("Ingresa intensidad: ");
                        primerNumero = teclado.nextDouble();
                        System.out.print("Ingresa resistencia: ");
                        segundoNumero = teclado.nextDouble();
                        resultado = primerNumero * segundoNumero;
                        System.out.println("El voltaje es: " + resultado);
                    } else if (operacion == 2) {
                        System.out.println("Elegiste hallar resistencia.");
                        System.out.print("Ingresa voltaje: ");
                        primerNumero = teclado.nextDouble();
                        System.out.print("Ingresa intensidad: ");
                        segundoNumero = teclado.nextDouble();
                        resultado = primerNumero / segundoNumero;
                        System.out.println("La resistencia es: " + resultado);
                    } else if (operacion == 3) {
                        System.out.println("Elegiste hallar intensidad.");
                        System.out.print("Ingresa voltaje: ");
                        primerNumero = teclado.nextDouble();
                        System.out.print("Ingresa resistencia: ");
                        segundoNumero = teclado.nextDouble();
                        resultado = primerNumero / segundoNumero;
                        System.out.println("La intensidad es: " + resultado);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println("¿Quieres seguir operando?");
            System.out.println("Sí = 1");
            System.out.println("No = 2");
            seguirOperando = teclado.nextInt();
        } while (seguirOperando == 1);
    }
}

