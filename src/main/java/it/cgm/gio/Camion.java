package it.cgm.gio;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Camion extends Veicolo {
    private double capCaricoTonnellate, capCaricoRimorchio;
    private Motore motore;
}
