/* Archivo: Color.java
 *
 * Clase que indica los atributos y metodos para los tipos de pintura 
 *
 * Alumno: Jesús Borja Hernández
 * Docente: Roberto Hernández Perez
 *
 * Materia: Estructura de Datos
 * Fecha de Entrega: 31 de agosto, 2022
 *
 *
 *
 *
 * */


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
         this.litros = litros;
   }

   public float getLitros() {
      return this.litros;
   }

   public void setMetros(float metros) {
         this.metros = metros;
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
