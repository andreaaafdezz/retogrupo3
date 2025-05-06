
import java.util.Random;

public class CasillaMala extends Casilla{
    
    protected TipoCasillaMala tipoCMala;
    
    public CasillaMala() {
        Random random = new Random();
        tipo = TipoCasilla.Mala;
        TipoCasillaMala[] valores = TipoCasillaMala.values();
        TipoCasillaMala tipoCMala = valores[random.nextInt(valores.length)];
    }
    
    public void otorgarCastigo() {
        if (tipoCMala == TipoCasillaMala.Pozo) {
            
        }else if (tipoCMala == TipoCasillaMala.Carcel) {
            
        }else if (tipoCMala == TipoCasillaMala.Muerte) {
            
        }
        
    }
}
