package net.salesianos.examenT4.actividad2.electrodomesticos;

public class Electrodomesticos {
  protected String marca;
  protected String modelo;
  protected double peso;
  protected double potencia;
  protected boolean estaEncendida;
  
  public Electrodomesticos(String marca, String modelo, double peso, double potencia, boolean estaEncendida) {
    this.marca = marca;
    this.modelo = modelo;
    this.peso = peso;
    this.potencia = potencia;
    this.estaEncendida = estaEncendida;
  }
  public String getMarca() {
    return this.marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return this.modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public double getPeso() {
    return this.peso;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }
  public double getPotencia() {
    return this.potencia;
  }
  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }

  public void encender() {
    this.estaEncendida = true;
  }

  public void apagar() {
    this.estaEncendida = false;
  }
}