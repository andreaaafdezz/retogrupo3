
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Jugador jug1 = new Jugador();
        Jugador jug2 = new Jugador();
        Jugador jug3 = new Jugador();
        Jugador jug4 = new Jugador();
        Tablero tablero = new Tablero();
        
        System.out.println("Bienvenido a la Ruta Matemática");
        System.out.println("");
        System.out.println("Ingrese el número de jugadores (1-4):");
        int numJug = teclado.nextInt();
        
        switch (numJug) {
            case 1:
                System.out.println("Jugador 1:");
                jug1.IngresarAlias();
                jug1.ingresarNivel();
                jug1.escogerCategoria();
                break;
            case 2:
                System.out.println("Jugador 1:");
                jug1.IngresarAlias();
                jug1.ingresarNivel();
                jug1.escogerCategoria();
                
                System.out.println("Jugador 2:");
                jug2.IngresarAlias();
                jug2.ingresarNivel();
                jug2.escogerCategoria();
                break;
                
            case 3:
                System.out.println("Jugador 1:");
                jug1.IngresarAlias();
                jug1.ingresarNivel();
                jug1.escogerCategoria();
                
                System.out.println("Jugador 2:");
                jug2.IngresarAlias();
                jug2.ingresarNivel();
                jug2.escogerCategoria();
                
                System.out.println("Jugador 3:");
                jug3.IngresarAlias();
                jug3.ingresarNivel();
                jug3.escogerCategoria();
                break;
                
            case 4:
                System.out.println("Jugador 1:");
                jug1.IngresarAlias();
                jug1.ingresarNivel();
                jug1.escogerCategoria();
                
                System.out.println("Jugador 2:");
                jug2.IngresarAlias();
                jug2.ingresarNivel();
                jug2.escogerCategoria();
                
                System.out.println("Jugador 3:");
                jug3.IngresarAlias();
                jug3.ingresarNivel();
                jug3.escogerCategoria();
                
                System.out.println("Jugador 4:");
                jug4.IngresarAlias();
                jug4.ingresarNivel();
                jug4.escogerCategoria();
                break;
                
            default:
                throw new AssertionError();
        }
        
        
        
    }
}
