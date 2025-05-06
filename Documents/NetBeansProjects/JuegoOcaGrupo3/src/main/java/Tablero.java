
import java.util.ArrayList;
import java.util.List;

public class Tablero {

    protected List<Casilla> arrayTablero;

    public Tablero() {
        arrayTablero = new ArrayList<>();
        for (int i = 0; i < 44; i++){
            if (i == 45) arrayTablero.add(new CasillaFinal());
            else if (i % 5 == 0) arrayTablero.add(new CasillaBuena());
            else if (i % 6 == 0) arrayTablero.add(new CasillaMala());
            else arrayTablero.add(new CasillaNormal());
            
        }
    }
  
 
    
          
         
    }

    
    
