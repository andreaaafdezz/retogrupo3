
import java.util.Scanner;

public class Jugador {

    protected int puntuacion;
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

    public int getPosicion() {
        return posicion;
    }

    public String getAlias() {
        return alias;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    
    
     public void escogerCategoria(){
        Scanner teclado = new Scanner(System.in);
        GeneradorPreguntas genPreg = new GeneradorPreguntas();
        int opcion;
        System.out.println("Categorías: ");
        System.out.println("    1- Álgebra");
        System.out.println("    2- Geometría");
        System.out.println("    3- Funciones");
        System.out.println("    4- Calculo Básico");
        System.out.println("    5- Trigonometría");
        System.out.println("");
        System.out.println("Selecione una categoría (1-5): ");
        opcion = teclado.nextInt();
        
        switch (opcion) {
            case 1 -> {
                System.out.println("Has escogido Álgebra.");
                genPreg.generarAlgebra();
            }
                
            case 2 -> {
                System.out.println("Has escogido Geometría.");
                genPreg.generarGeometria();
            }
                
            case 3 -> {
                System.out.println("Has escogido Funciones.");
                genPreg.generarFunciones();
            }
                
            case 4 -> {
                System.out.println("Has escogido Calculo Básico.");
                genPreg.generarCalBasico();
            }
            
            case 5 -> {
                System.out.println("Has escogido Trigonometría.");
                genPreg.generarTrigonometria();
            }
            default -> throw new AssertionError();
        }
    }
    
    

}
