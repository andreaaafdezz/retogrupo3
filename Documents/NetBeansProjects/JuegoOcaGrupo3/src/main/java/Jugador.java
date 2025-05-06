
import java.util.Scanner;

public class Jugador {

    protected int posicion;
    protected String alias;
    protected Nivel nivel;

    public void avanzar() {
    }

    public void retroceder() {
    }

    public void IngresarAlias() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su alias:");
        alias = teclado.nextLine();
        teclado.nextLine();
    }

    public void ingresarNivel() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese su nivel:");
        System.out.println("1. 1º ESO");
        System.out.println("2. 2º ESO");
        System.out.println("3. 3º ESO");
        System.out.println("4. 4º ESO");

        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1 ->
                nivel = Nivel.Primero;
            case 2 ->
                nivel = Nivel.Segundo;
            case 3 ->
                nivel = Nivel.Tercero;
            case 4 ->
                nivel = Nivel.Cuarto;

            default ->
                throw new AssertionError();
        }
    }
}
