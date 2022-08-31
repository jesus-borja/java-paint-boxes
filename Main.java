/* Archivo: Main.java
 * Aplicación principal que se encarga de crear las cajas de distintas medidas, mostrar la pintura
 * necesaria, los tipos de colores de pintura y su rendimiento, además de calcular el total de 
 * pintura que se necesita de cada color 
 *
 * Alumno: Jesús Borja Hernández
 * Docente: Roberto Hernández Perez
 *
 * Materia: Estructura de Datos
 * Fecha de Entrega: 31 de agosto, 2022
 */

import java.util.Scanner;

public class Main {
   public static void main(String...s) {

      Scanner in = new Scanner(System.in);

      float sumaVerde = 0;
      float sumaRojo = 0;

      Color verde = new Color("Verde");

      verde.setRendimiento(1, 2.5f);
      verde.getRendimiento();

      Color roja = new Color("Rojo");

      roja.setRendimiento(1, 2);
      roja.getRendimiento();

      System.out.println("\n******** CAJA 1 ********\n");

      Caja box1 = new Caja(2.5f, 2.5f, 2.5f);

      box1.caraMasPequenia();
      box1.calcularPintura(roja, verde);

      System.out.println(box1.esCubica() ? "La caja es cubica" : "La caja NO es cubica");

      sumaVerde += box1.calcularPinturaExterna(verde);
      sumaRojo += box1.calcularPinturaInterna(roja);

      System.out.println("\n******** CAJA 2 ********\n");

      Caja box2 = new Caja(2.5f, 2.5f, 2.5f);

      box2.caraMasPequenia();
      box2.calcularPintura(roja, verde);

      System.out.println(box2.esCubica() ? "La caja es cubica" : "La caja NO es cubica");

      sumaVerde += box2.calcularPinturaExterna(verde);
      sumaRojo += box2.calcularPinturaInterna(roja);

      System.out.println("\n******** CAJA 3 ********\n");

      Caja box3 = new Caja(2f, 4f, 3f);

      box3.caraMasPequenia();
      box3.calcularPintura(roja, verde);

      System.out.println(box3.esCubica() ? "La caja es cubica" : "La caja NO es cubica");

      sumaVerde += box3.calcularPinturaExterna(verde);
      sumaRojo += box3.calcularPinturaInterna(roja);

      // Se multiplica * 2 ya que se usarán dos manos de pintura
      System.out.println("******************************");
      System.out.println("Total de pintura verde: " + (sumaVerde)*2);
      System.out.println("Total de pintura roja: " + (sumaRojo)*2);
      System.out.println("******************************");

      float  verdeAUsar = 0, rojoAUsar = 0;
      char valCaja1, valCaja2, valCaja3, continuar;

      do {
         System.out.print("Desea pintar la caja 1? (S/n) ");
         valCaja1 = in.next().charAt(0);

         if (valCaja1 == 's' || valCaja1 == 'S') {
            verdeAUsar += box1.calcularPinturaExterna(verde);
            rojoAUsar += box1.calcularPinturaInterna(roja);
         }

         System.out.print("Desea pintar la caja 2? (S/n) ");
         valCaja2 = in.next().charAt(0);

         if (valCaja2 == 's' || valCaja2 == 'S') {
            verdeAUsar += box2.calcularPinturaExterna(verde);
            rojoAUsar += box2.calcularPinturaInterna(roja);
         }

         System.out.print("Desea pintar la caja 3? (S/n) ");
         valCaja3 = in.next().charAt(0);

         if (valCaja3 == 's' || valCaja3 == 'S') {
            verdeAUsar += box3.calcularPinturaExterna(verde);
            rojoAUsar += box3.calcularPinturaInterna(roja);
         }

         // Se multiplica * 2 ya que se usarán dos manos de pintura
         System.out.println("Se utilizará " + (verdeAUsar)*2 + "lts de pintura verde");
         System.out.println("Se utilizará " + (rojoAUsar )*2 + "lts de pintura roja");

         System.out.print("Desea seleccionar otra vez? (S/n) ");
         continuar = in.next().charAt(0);
      } while (continuar == 's' || continuar == 'S');

      System.out.println("Bye...");
   }
}
