
import java.util.ArrayList;
import java.util.List;



public class GeneradorPreguntas {
    Jugador jug = new Jugador();
    public void generarAlgebra(){
        List<Pregunta> preguntas = new ArrayList<>();
        switch (jug.nivel) {
            case Primero -> {
                    preguntas.add(new Pregunta("¿Cuánto es 2x + 3x?", "5x"));
    preguntas.add(new Pregunta("¿Cuál es el valor de x en la ecuación: x + 2 = 5?", "3"));
    preguntas.add(new Pregunta("¿Cuánto es (x)(x)?", "x^2"));
    preguntas.add(new Pregunta("¿Qué representa 'x' en una ecuación algebraica?", "una variable"));
    preguntas.add(new Pregunta("¿Cuánto es 4x - 2x?", "2x"));
    preguntas.add(new Pregunta("¿Qué valor de x satisface: 3x = 12?", "4"));
    preguntas.add(new Pregunta("Simplifica: x + x + x", "3x"));
    preguntas.add(new Pregunta("¿Qué propiedad muestra a + b = b + a?", "conmutativa"));
    preguntas.add(new Pregunta("Resuelve: 2x + 4 = 10", "3"));
    preguntas.add(new Pregunta("Factoriza: x^2 + 2x", "x(x + 2)"));
    preguntas.add(new Pregunta("¿Qué propiedad aplica (a + b) + c = a + (b + c)? /n"
            + "a) conmutativa /n"
            + "b) asociativa /n"
            + "c) distibutiva /n"
            + "d) suma", "b"));
    preguntas.add(new Pregunta("Reduce: 5x - 2x + 3", "3x + 3"));
    preguntas.add(new Pregunta("Multiplica: 3(x + 1)", "3x + 3"));
    preguntas.add(new Pregunta("¿Qué valor de x cumple: x/2 = 4?", "8"));
    preguntas.add(new Pregunta("¿Qué significa resolver una ecuación?", "encontrar el valor de la variable"));
    preguntas.add(new Pregunta("¿Cuál es el opuesto de -5?", "5"));
    preguntas.add(new Pregunta("Simplifica: (2x)(3)", "6x"));
    preguntas.add(new Pregunta("¿Qué propiedad aplica: a(1) = a?", "elemento neutro multiplicativo"));
    preguntas.add(new Pregunta("Resuelve: x - 7 = 1", "8"));
    preguntas.add(new Pregunta("Multiplica: (x + 2)(x)", "x^2 + 2x"));
    preguntas.add(new Pregunta("¿Qué significa 'distribuir' en álgebra?", "multiplicar cada término dentro del paréntesis"));
    preguntas.add(new Pregunta("Simplifica: 6x + 3x - x", "8x"));
    preguntas.add(new Pregunta("Resuelve: 3(x - 1) = 6", "3"));
    preguntas.add(new Pregunta("Factoriza: x^2 - x", "x(x - 1)"));
    preguntas.add(new Pregunta("Reduce: 2x + 5 - 3x + 1", "-x + 6"));
    preguntas.add(new Pregunta("¿Cuál es el coeficiente de 7x?", "7"));
    preguntas.add(new Pregunta("¿Qué valor hace que x + 4 = 9 sea verdadera?", "5"));
    preguntas.add(new Pregunta("Simplifica: x + x + x + x", "4x"));
    preguntas.add(new Pregunta("Multiplica: -2(x - 3)", "-2x + 6"));
    preguntas.add(new Pregunta("¿Qué propiedad aplica: a(b + c) = ab + ac? /n"
            + "a) asociatica /n"
            + "b) conmutativa /n"
            + "c) multiplicación /n"
            + "d) distributiva", "d"));


            }
            case Segundo -> {
                
                preguntas.add(new Pregunta("Factoriza: x^2 + 5x + 6", "(x + 2)(x + 3)"));
                preguntas.add(new Pregunta("Resuelve: 2x - 4 = 10", "x = 7"));
                preguntas.add(new Pregunta("¿Cuál es el valor de x en 3x + 2 = x + 10?", "x = 4"));
                preguntas.add(new Pregunta("¿Qué es una expresión algebraica?", "Una combinación de números, variables y operaciones."));   
            }

            case Tercero -> {
                
            }
            
            case Cuarto -> {
            }
            default -> throw new AssertionError();
        }
    }
    
    public void generarGeometria(){
        switch (jug.nivel) {
            case Primero -> {
            }
            case Segundo -> {
            }

            case Tercero -> {
            }
            
            case Cuarto -> {
            }
            default -> throw new AssertionError();
        }
    }
    
    public void generarFunciones(){
        switch (jug.nivel) {
            case Primero -> {
            }
            case Segundo -> {
            }

            case Tercero -> {
            }
            
            case Cuarto -> {
            }
            default -> throw new AssertionError();
        }
    }
    
    public void generarCalBasico(){
        switch (jug.nivel) {
            case Primero -> {
            }
            case Segundo -> {
            }

            case Tercero -> {
            }
            
            case Cuarto -> {
            }
            default -> throw new AssertionError();
        }
    }
    
    public void generarTrigonometria(){
        switch (jug.nivel) {
            case Primero -> {
            }
            case Segundo -> {
            }

            case Tercero -> {
            }
            
            case Cuarto -> {
            }
            default -> throw new AssertionError();
        }
    }
}
