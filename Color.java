/* Clase que indica los atributos y metodos para los tipos de pintura */

class Color {
   private String color;
   private float litros, metros;

   public Color(String color) {
      this.color = color;
   }

   public String getColor() {
      return this.color;
   }

   public void setLitros(float litros) {
      if (litros > 0f) {
         this.litros = litros;
      }
      else {
         System.out.println("Debe introducirse un valor positivo.");
         System.out.println("Se considerará el valor 1 en su lugar.");
         this.litros = 1;
      }
   }

   public float getLitros() {
      return this.litros;
   }

   public void setMetros(float metros) {
      if (litros > 0f) {
         this.metros = metros;
      }
      else {
         System.out.println("Debe introducirse un valor positivo.");
         System.out.println("Se considerará el valor 1 en su lugar.");
         this.metros = 1;
      }
   }

   public float getMetros() {
      return this.metros;
   }

   public void setRendimiento(float litros, float metros) {
      setMetros(metros);
      setLitros(litros);
   }

   public void getRendimiento() {
      System.out.println("El rendimiento de la pintura " + this.color + " es: "
            + getLitros() + "lts x " + getMetros() + "mts cuadrados");
   }
}
