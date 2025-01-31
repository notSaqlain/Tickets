// Biglietto senza data
public class BigliettoSenzaData extends Biglietto {
    private boolean usato;
    
    public BigliettoSenzaData(String codice, boolean ridotto) {
        super(codice, ridotto);
        this.usato = false;
    }
    
    @Override
    public boolean valido() {
        if (!usato) {
            usato = true;
            return true;
        }
        return false;
    }
}