public abstract class Biglietto {
    protected String codice;
    protected boolean ridotto;
    
    public Biglietto(String codice, boolean ridotto) {
        this.codice = codice;
        this.ridotto = ridotto;
    }
    
    public String getCodice() {
        return codice;
    }
    
    public abstract boolean valido();
}