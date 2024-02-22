/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sphere;

import java.util.Scanner;

public class Sphere
{
   // obtain radius from user and display volume of sphere
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter radius of sphere: " );
      double radius = input.nextDouble();
      double MyVolume = SphereVolume.sphereVolume1( radius );//needs to hold the value
      System.out.printf( "Volume is %.2f\n", MyVolume );//allows user to multiple inputs for volume
   } // end method determineSphereVolume
}
   // calculate and return sphere volume
  /* public static double sphereVolume( double radius )
   {
      double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
      return volume;
   } // end method sphereVolume
} // end class Sphere*/