// Biglietto annuale
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
public class BigliettoAnnuale extends Biglietto {
    private Set<Integer> mesiUsati;
    
    public BigliettoAnnuale(String codice, boolean ridotto) {
        super(codice, ridotto);
        this.mesiUsati = new HashSet<>();
    }
    
    @Override
    public boolean valido() {
        Calendar cal = Calendar.getInstance();
        int meseAttuale = cal.get(Calendar.MONTH);
        if (!mesiUsati.contains(meseAttuale)) {
            mesiUsati.add(meseAttuale);
            return true;
        }
        return false;
    }
}
