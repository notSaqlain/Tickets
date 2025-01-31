import java.util.Scanner;

public class BigliettoA {
    private String data;
    private String ora;
    private boolean bigliettoTimbrato;
    @SuppressWarnings("unused")
    private boolean bigliettoRidotto;
    private String dataCorrente;
    private String oraCorrente;

    public BigliettoA(String data, String ora, boolean bigliettoRidotto) {
        this.data = data;
        this.ora = ora;
        this.bigliettoTimbrato = false;
        this.bigliettoRidotto = bigliettoRidotto;
    }

    public void metodoA() {
        setBiglietto("XXX-XXXX-XXX");
    }

    private void setBiglietto(String biglietto) {
        // Implementazione per impostare il biglietto
    }

    public void fornisciDataOraCorrente(Scanner scanner) {
        System.out.println("Guarda la data e l'ora...");

        System.out.println("Dimmi la data [in formato YYYY-MM-DD]: ");
        dataCorrente = scanner.nextLine();

        System.out.println("Dimmi l'ora [in formato HH:MM]: ");
        oraCorrente = scanner.nextLine();
    }

    public boolean isBigliettoValido() {
        if (bigliettoTimbrato || !data.equals(dataCorrente) || !ora.equals(oraCorrente)) {
            return false;
        }
        bigliettoTimbrato = true;
        return true;
    }

    public void setBigliettoRidotto(boolean bigliettoRidotto) {
        this.bigliettoRidotto = bigliettoRidotto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigliettoA biglietto = new BigliettoA("2023-10-01", "10:00", false);
        biglietto.fornisciDataOraCorrente(scanner);
        System.out.println("Il biglietto è valido: " + biglietto.isBigliettoValido());
    }
}