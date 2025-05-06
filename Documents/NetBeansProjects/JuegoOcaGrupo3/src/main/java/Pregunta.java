
import java.util.Scanner;

public class Pregunta implements IPreguntas {

    protected String enunciado;
    protected String respuestaCorrecta;
    protected String respuestaJugador;
    protected Categoria cat;

    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean Verificar(String respuestaJugador) {
        return respuestaJugador.trim().equalsIgnoreCase(respuestaCorrecta);
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
