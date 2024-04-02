package net.salesianos.examenT4.actividad1;

public class Actividad1 {
  public static void main(String[] args) {
    int n = 6;
    int[] notas = new int[5];
    notas[0] = 10;
    notas[1] = 4;
    notas[2] = 6;
    notas[3] = 1;
    notas[4] = 7;

    System.out.println("La suma de todos los números comprendidos entre 1 y " + n + " es igual a: " + Metodos.sumarElevadosN(n));
    System.out.println("La media de las notas de esta evaluación es de: " + Metodos.calcularNotasMedias(notas));
  }
}