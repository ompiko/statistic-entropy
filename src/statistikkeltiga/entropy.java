/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistikkeltiga;

/**
 *
 * @author vicko
 */
public class entropy {

  String outlook[] = {"Rainy", "Rainy", "Overcast", "Sunny", "Sunny", "Sunny", "Overcast", "Rainy", "Rainy", "Sunny", "Rainy", "Overcast", "Overcast", "Sunny"};
  String temperature[] = {"Hot", "Hot", "Hot", "Mild", "Cool", "Cool", "Cool", "Mild", "Cool", "Mild", "Mild", "Mild", "Hot", "Mild"};
  String humidity[] = {"High", "High", "High", "High", "Normal", "Normal", "Normal", "Normal", "High", "Normal", "Normal", "Normal", "High", "Normal", "High"};
  String wind[] = {"False", "True", "False", "False", "False", "True", "True", "False", "False", "False", "True", "True", "False", "True"};
  String play[] = {"No", "No", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No"};

  void display() {
    for (int i = 0; i < outlook.length; i++) {
      System.out.print("|| ");
      System.out.print((i + 1));
      if (i < 9) {
        System.out.print(".");
      }
      System.out.print(" ");
      //print outlook
      System.out.print(outlook[i] + " ");
      if (outlook[i].length() < 10) {
        for (int j = 0; j < (10 - outlook[i].length()); j++) {
          System.out.print(" ");
        }
      }
      //print temperature
      System.out.print(temperature[i] + " ");
      if (temperature[i].length() < 6) {
        for (int j = 0; j < (6 - temperature[i].length()); j++) {
          System.out.print(" ");
        }
      }
      //print humidity
      System.out.print(humidity[i] + " ");
      if (humidity[i].length() < 8) {
        for (int j = 0; j < (8 - humidity[i].length()); j++) {
          System.out.print(" ");
        }
      }
      //print wind
      System.out.print(wind[i] + " ");
      if (wind[i].length() < 6) {
        for (int j = 0; j < (6 - wind[i].length()); j++) {
          System.out.print(" ");
        }
      }
      //print play
      System.out.print(play[i]);
      if (play[i].length() < 3) {
        for (int j = 0; j < (3 - play[i].length()); j++) {
          System.out.print(" ");
        }
      }
      System.out.println("||");
    }
    System.out.println("=============================================");
  }

  String entropyOutlook(String x) {
    float b = 0;
    float c = 0;
    float d = 0;
    for (int j = 0; j < 14; j++) {
      if (x.toLowerCase().compareTo(outlook[j].toLowerCase()) == 0) {

        if ("yes".equals(play[j].toLowerCase())) {
          b = b + 1;
        } else {
          c = c + 1;
        }
        d = d + 1;
      }
    }
    //System.out.println(b);
    //System.out.println(c);
    float entropy = (float) ((-(b / d) * Math.log(b / d) / Math.log(2)) + (-(c / d) * Math.log(c / d) / Math.log(2)));
    if (entropy > 0) {
      System.out.printf("Entropy value: %.2f", entropy);
    } else {
      System.out.println("Entropy value is not found");
    }
    return x;
  }

  String entropyTemperature(String x) {
    float b = 0;
    float c = 0;
    float d = 0;
    for (int j = 0; j < 14; j++) {
      if (x.toLowerCase().compareTo(temperature[j].toLowerCase()) == 0) {

        if ("yes".equals(play[j].toLowerCase())) {
          b = b + 1;
        } else {
          c = c + 1;
        }
        d = d + 1;
      }
    }
    //System.out.println(b);
    //System.out.println(c);
    float entropy = (float) ((-(b / d) * Math.log(b / d) / Math.log(2)) + (-(c / d) * Math.log(c / d) / Math.log(2)));
    if (entropy > 0) {
      System.out.printf("Entropy value: %.2f", entropy);
    } else {
      System.out.println("Entropy value is not found");
    }
    return x;
  }

  String entropyHumidity(String x) {
    float b = 0;
    float c = 0;
    float d = 0;
    for (int j = 0; j < 14; j++) {
      if (x.toLowerCase().compareTo(humidity[j].toLowerCase()) == 0) {

        if ("yes".equals(play[j].toLowerCase())) {
          b = b + 1;
        } else {
          c = c + 1;
        }
        d = d + 1;
      }
    }
    //System.out.println(b);
    //System.out.println(c);
    float entropy = (float) ((-(b / d) * Math.log(b / d) / Math.log(2)) + (-(c / d) * Math.log(c / d) / Math.log(2)));
    if (entropy > 0) {
      System.out.printf("Entropy value: %.2f", entropy);
    } else {
      System.out.println("Entropy value is not found");
    }
    return x;
  }
}
