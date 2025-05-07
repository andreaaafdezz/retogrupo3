
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
    
    
    
       
}
