package net.salesianos.examenT4.actividad2;

import net.salesianos.examenT4.actividad2.electrodomesticos.Microondas;
import net.salesianos.examenT4.actividad2.electrodomesticos.Nevera;

public class Actividad2 {
  public static void main(String[] args) {
    Nevera nevera = new Nevera("BARBIE", "LOOSE", 150, 87, true, 5);
    System.out.println(nevera);
    nevera.encender();

    Microondas microondas = new Microondas("OPPENHEIMER", "WINS", 40, 70, true, false);
    System.out.println(microondas);
    microondas.encender();

    nevera.apagar();
    microondas.apagar();
  }
}
