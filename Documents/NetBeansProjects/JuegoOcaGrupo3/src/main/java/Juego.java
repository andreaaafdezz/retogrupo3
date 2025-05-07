

public class Juego {

   
    

    public void iniciar() {
        
        
    }

    public void finalizar(Jugador jugador) {
        System.out.println("\n ¡Felicidades, " + jugador.getAlias() + "! Has llegado al final del tablero.");
        System.out.println("Puntuación final: " + jugador.getPuntuacion());
        System.out.println("Gracias por jugar a la Oca matemática. ¡Hasta la próxima!");
        System.exit(0);

    }
}