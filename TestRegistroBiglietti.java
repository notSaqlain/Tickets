public class TestRegistroBiglietti {
    public static void main(String[] args) {
        RegistroBiglietti registro = new RegistroBiglietti();
        
        Biglietto b1 = new BigliettoSenzaData("123", false);
        Biglietto b2 = new BigliettoAnnuale("456", true);
        Biglietto b3 = new BigliettoMultiIngresso("789", false, 3);
        
        registro.aggiungiBiglietto(b1);
        registro.aggiungiBiglietto(b2);
        registro.aggiungiBiglietto(b3);
        
        System.out.println("Verifica 123: " + registro.verificaBiglietto("123")); // true
        System.out.println("Verifica 123 di nuovo: " + registro.verificaBiglietto("123")); // false
        System.out.println("Verifica 456: " + registro.verificaBiglietto("456")); // true
        System.out.println("Verifica 789: " + registro.verificaBiglietto("789")); // true
        System.out.println("Verifica 789 seconda volta: " + registro.verificaBiglietto("789")); // true
        System.out.println("Verifica 789 terza volta: " + registro.verificaBiglietto("789")); // true
        System.out.println("Verifica 789 quarta volta: " + registro.verificaBiglietto("789")); // false
    }
}