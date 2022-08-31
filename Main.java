
public class Main {
   public static void main(String...s) {

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

      System.out.println("******************************");
      System.out.println("Total de pintura verde: " + (sumaVerde)*2);
      System.out.println("Total de pintura roja: " + (sumaRojo)*2);
      System.out.println("******************************");
   }
}
