package romannumberconverter;

public class RomanNumberConverter {
  int convert(String romanNumber){
    int res= 0;

      switch(romanNumber) {
        case "I":
          res+=1;
          break;
        case "V":
          res+=5;
          break;
        case "X":
          res+=10;
          break;
        case "L":
          res+=50;
          break;
        case "C":
          res+=100;
          break;
        case "D":
          res+=500;
          break;
        case "M":
          res+=1000;
          break;
        case "":
          throw new IllegalArgumentException("romanNumber cannot be null");
          

        default:

      }
      return res;


  }

}
