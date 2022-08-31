/* Clase que se encarga de controlar los atributos y metodos para las cajas */

class Caja {
   private float dimX, dimY, dimZ;

   private float cara1, cara2, cara3;

   public Caja(float x, float y, float z) {
      this.setDimensiones(x,y,z);

      // Obtenemos el area de cada cara 
      this.cara1 = this.dimX * dimY;
      this.cara2 = this.dimX * dimZ;
      this.cara3 = this.dimZ * dimY;

   }

   public void printDimensiones() {
      System.out.println("Ancho: " + this.dimX);
      System.out.println("Largo: " + this.dimY);
      System.out.println("Profundo: " + this.dimZ);
   }

   public boolean esCubica() {
      // Si x es igual a Y y X es igual a Z, quiere decir que todos los lados son iguales
      if (this.dimX == this.dimY && this.dimX == this.dimZ) {
         return true;
      }
      else {
         return false;
      }
   }

   public void setDimensiones(float x, float y, float z) {
      this.dimX = x;
      this.dimY = y;
      this.dimZ = z;
   }

   // Se usa el bolean para indicar si se debe imprimir en consola
   public float superficieAPintar(boolean print) {
      // Superficie de un prisma rectangular = 2( x*y + x*z + y*z)

      float superficieTotal = 2 * (cara1 + cara2 + cara3);

      if (print) {
         System.out.println("Superficie total: " + superficieTotal + "mts cuadrados");
      }

      return superficieTotal;
   }

   public float caraMasPequenia() {

      float[] values = {this.cara1, this.cara2, this.cara3};
      float masPequenio = Integer.MAX_VALUE;
      
      for (float value : values) {
         if (value <= masPequenio) {
            masPequenio = value;
         }
      }
      
      return masPequenio;
   }

   public float calcularPinturaExterna(Color colorExt) {
      float cantidadExt;

      float cantLitros = colorExt.getLitros();
      float cantMetros = colorExt.getMetros();

      float superficie = this.superficieAPintar(false) - this.caraMasPequenia();

      //Usamos regla de 3 para conocer cuantos litros necesitamos 

      // litros  --> metros
      // cantExt --> superficie

      cantidadExt = superficie * cantLitros / cantMetros;

      return cantidadExt;
   }

   public float calcularPinturaInterna(Color colorInt) {
      float cantidadInt;

      float superficie = this.superficieAPintar(false) - this.caraMasPequenia();

      float cantLitros = colorInt.getLitros();
      float cantMetros = colorInt.getMetros();

      //Usamos regla de 3 para conocer cuantos litros necesitamos 

      // litros --> metros
      //   x    --> superficie

      cantidadInt = superficie * cantLitros / cantMetros;
      return cantidadInt;
   }


   public void calcularPintura(Color colorExt, Color colorInt) {

      float cantidadExt = calcularPinturaExterna(colorExt);
      float cantidadInt = calcularPinturaInterna(colorInt);

      System.out.println("Se necesita " + cantidadExt + "lts de " + colorExt.getColor() + " para pintar por fuera");
      System.out.println("Se necesita " + cantidadInt + "lts de " + colorInt.getColor() + " para pintar por dentro");
   }

}

