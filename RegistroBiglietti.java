// Registro dei biglietti
import java.util.HashMap;
import java.util.Map;
public class RegistroBiglietti {
    private Map<String, Biglietto> biglietti;
    
    public RegistroBiglietti() {
        biglietti = new HashMap<>();
    }
    
    public void aggiungiBiglietto(Biglietto biglietto) {
        biglietti.put(biglietto.getCodice(), biglietto);
    }
    
    public boolean verificaBiglietto(String codice) {
        Biglietto biglietto = biglietti.get(codice);
        return biglietto != null && biglietto.valido();
    }
}