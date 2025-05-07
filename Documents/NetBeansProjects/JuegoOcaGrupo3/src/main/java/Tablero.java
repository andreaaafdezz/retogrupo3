
import java.util.ArrayList;
import java.util.List;

public class Tablero {

    protected List<Casilla> arrayTablero;

    public Tablero() { /*Creamos el tablero de 45 casillas, lo recorre y establece que la ultima sea la casilla final, todos los divisores
        todos los divisores de 5 sera una casilla buena y los divisores de 6 casilla mala y el resto normal*/
        arrayTablero = new ArrayList<>();
        for (int i = 0; i < 44; i++){
            if (i == 45) arrayTablero.add(new CasillaFinal());
            else if (i % 5 == 0) arrayTablero.add(new CasillaBuena());
            else if (i % 6 == 0) arrayTablero.add(new CasillaMala());
            else arrayTablero.add(new CasillaNormal());
            
        }
    }
  
 
    
          
         
    }

    
    
