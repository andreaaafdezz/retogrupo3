
import java.util.Random;

public class CasillaBuena extends Casilla {

    protected TipoCasillaBuena tipoCBuena;

    public CasillaBuena() {
        Random random = new Random();
        tipo = TipoCasilla.Buena;
        TipoCasillaBuena[] valoresB = TipoCasillaBuena.values();
        TipoCasillaBuena tipoCBuena = valoresB[random.nextInt(valoresB.length)];
    }

    public void asignarBonus() {
        if (tipoCBuena == TipoCasillaBuena.Oca) {
            
        } else if (tipoCBuena == TipoCasillaBuena.Dados) {

        } else if (tipoCBuena == TipoCasillaBuena.Puente) {

        }
    }

    public void utilizarBonus() {
    }
}
