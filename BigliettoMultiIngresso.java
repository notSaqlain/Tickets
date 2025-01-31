// Biglietto con numero di utilizzi limitato
public class BigliettoMultiIngresso extends Biglietto {
    private int utilizziRimanenti;
    
    public BigliettoMultiIngresso(String codice, boolean ridotto, int utilizzi) {
        super(codice, ridotto);
        this.utilizziRimanenti = utilizzi;
    }
    
    @Override
    public boolean valido() {
        if (utilizziRimanenti > 0) {
            utilizziRimanenti--;
            return true;
        }
        return false;
    }
}