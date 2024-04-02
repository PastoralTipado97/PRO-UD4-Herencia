package net.salesianos.examenT4.actividad1;

public class Metodos {
  public static int sumarElevadosN(int n) {
    int elevados = 1;
    for (int i = 1; i <= n; i++) {
        elevados = i * i;
    }
    return elevados;
  }

  public static float calcularNotasMedias(int[] notas)  {
    float media = 0;
    for (int i = 0; i <= notas.length; i++) {
        media += i;
    }
    return media / notas.length;
  }
}