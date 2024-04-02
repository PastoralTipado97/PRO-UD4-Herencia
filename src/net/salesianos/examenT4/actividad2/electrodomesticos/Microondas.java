package net.salesianos.examenT4.actividad2.electrodomesticos;

public class Microondas extends Electrodomesticos {
  private boolean estaAbierto;

  public Microondas(String marca, String modelo, double peso, double potencia, boolean estaEncendida,
    boolean estaAbierto) {
    super(marca, modelo, peso, potencia, estaEncendida);
    this.estaAbierto = estaAbierto;
  }

  public boolean isEstaAbierta() {
    return estaAbierto;
  }

  public void setEstaAbierto(boolean estaAbierto) {
    this.estaAbierto = estaAbierto;
  }

  @Override
  public void encender() {
    this.estaEncendida = true;
    System.out.println("Algo huele a quemado...");
  }

  @Override
  public String toString() {
    String abierta = estaAbierto ? "Si" : "No";
    String estaEncendido = estaEncendida ? "Si" : "No";
    return "-------------------------------------------------------------------------------------------------\n" +
        "Tipo de electrodoméstico: Microondas.\n" +
        "* Marca: " + getMarca() + "\n" +
        "* Modelo: " + getModelo() + "\n" +
        "* Peso: " + getPeso() + "\n" +
        "* Potencia: " + getPotencia() + "\n" +
        "* Puerta: " + abierta + "\n" +
        "* Está encendido: " + estaEncendido + "\n" +
        "-------------------------------------------------------------------------------------------------";
  }
}