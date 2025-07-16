import java.util.Scanner;

public class ConversorMoneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDolar = 1000.0;
        double tasaEuro = 1100.0;
        double tasaReal = 200.0;

        System.out.println("=== Conversor de Monedas ===");
        System.out.println("Convertir desde Pesos Argentinos a:");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Real Brasileño");

        System.out.print("Elegí una opción (1-3): ");
        int opcion = scanner.nextInt();

        System.out.print("Ingresá el monto en ARS: ");
        double montoARS = scanner.nextDouble();

        double resultado = 0.0;
        String monedaDestino = "";

        switch (opcion) {
            case 1:
                resultado = montoARS / tasaDolar;
                monedaDestino = "USD";
                break;
            case 2:
                resultado = montoARS / tasaEuro;
                monedaDestino = "EUR";
                break;
            case 3:
                resultado = montoARS / tasaReal;
                monedaDestino = "BRL";
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.printf("Resultado: %.2f ARS = %.2f %s%n", montoARS, resultado, monedaDestino);
    }
}
