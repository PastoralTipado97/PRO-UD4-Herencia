package net.salesianos.examenT4.actividad2.electrodomesticos;

public class Nevera extends Electrodomesticos {
  private float temperatura;

  public Nevera(String marca, String modelo, double peso, double potencia, boolean estaEncendida, float temperatura) {
    super(marca, modelo, peso, potencia, estaEncendida);
    this.temperatura = temperatura;
  }

  public float getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(float temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public void encender() {
    this.estaEncendida = true;
    System.out.println("¡Ños, fuerte pelete!");
  }

  @Override
  public String toString() {
    String estaEncendido = estaEncendida ? "Si" : "No";
    return "-------------------------------------------------------------------------------------------------\n" +
        "Tipo de electrodoméstico: Nevera.\n" +
        "* Marca: " + getMarca() + "\n" +
        "* Modelo: " + getModelo() + "\n" +
        "* Peso: " + getPeso() + "\n" +
        "* Potencia: " + getPotencia() + "\n" +
        "* Temperatura: " + getTemperatura() + "\n" +
        "* Está encendido: " + estaEncendido + "\n" +
        "-------------------------------------------------------------------------------------------------";
  }
}