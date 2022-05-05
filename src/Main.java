import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        Collection cola = new Collection();

        while (salir == false) {
            System.out.print("Introduce un número: ");
            float numero = sc.nextInt();
            sc.nextLine();

            cola.enqueue(numero);

            System.out.println("Se ha añadido el numero " + numero);

            System.out.print("Pulsa Enter para continuar o Q para salir: ");
            String valor = sc.nextLine();
            System.out.println("");

            if (valor.equals("Q")) {
                float suma = 0;
                for (int i = 0; i < cola.getNumObjects(); i++) {
                    suma += cola.dequeue();
                }
                suma += cola.getElement(0);
                System.out.println("");
                System.out.println("La suma de los números introducidos es: " + suma);
                salir = true;
            }
        }
    }
}
