// Biglietto con data e ora specifica
import java.util.Date;
public class BigliettoDataOra extends Biglietto {
    private Date dataOra;
    private boolean usato;
    
    public BigliettoDataOra(String codice, boolean ridotto, Date dataOra) {
        super(codice, ridotto);
        this.dataOra = dataOra;
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