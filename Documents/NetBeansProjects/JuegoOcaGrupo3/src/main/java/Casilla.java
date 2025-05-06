
public abstract class Casilla {
    
    protected TipoCasilla tipo;
    protected int bonus;
    protected int posicion;
    
    public Casilla() {
        
    }

    public Casilla(TipoCasilla tipo, int bonus, int posicion) {
        this.tipo = tipo;
        this.bonus = bonus;
        this.posicion = posicion;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }

    public int getBonus() {
        return bonus;
    }

    public int getPosicion() {
        return posicion;
    }
    
    
    
}
