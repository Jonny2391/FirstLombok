package it.cgm.gio;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Valeria","De Luca", "Roma");
        Motore motore = new Motore(4,400);
        Camion camion = new Camion(200,200,motore);
        Veicolo veicolo = new Veicolo("Ferrari",persona);

        persona.setCittaResidenza("Torino");
        System.out.println(persona.getNome() + " " + persona.getCognome() + " ha spostato la residenza a Torino");

        motore.setCavalli(15);
        System.out.println("I cavalli del motore sono diminuiti e ora sono " + motore.getCavalli());

        camion.setCapCaricoRimorchio(2000.0);
        System.out.println("La capacità del rimorchio è stata ampliata a " + camion.getCapCaricoRimorchio());

        veicolo.setProprietario(new Persona());
        Persona newP = veicolo.getProprietario();
        newP.setNome("Giovanni");
        newP.setCognome("Addone");
        newP.setCittaResidenza("Grottole");
        System.out.println("E' cambiato il proprietario del veicolo");
        System.out.println("Il nuovo proprietario è " + newP.getNome() + " " +
                newP.getCognome() + " residente a " + newP.getCittaResidenza());
    }
}