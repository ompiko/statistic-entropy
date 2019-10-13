/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistikkeltiga;

import java.util.Scanner;

/**
 *
 * @author vicko
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    entropy en = new entropy();
    Scanner in = new Scanner(System.in);
    en.display();
    //System.out.println("\n1. Show entropy");
    //System.out.println("2. Show gain");
    System.out.print("\nInput option outlook want to search: ");
    String outlook = in.nextLine();
    en.entropyOutlook(outlook);
    System.out.print("\nInput option temperature want to search: ");
    String temp = in.nextLine();
    en.entropyTemperature(temp);
    System.out.print("\nInput option humidity want to search: ");
    String hum = in.nextLine();
    en.entropyHumidity(hum);
  } 
}
