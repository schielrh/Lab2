class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int mmTotal;
    double blueTotal;
    double brownTotal;
    double greenTotal;
    double orangeTotal;
    double redTotal;
    double yellowTotal;

    mmTotal = 55 * 11;
    blueTotal = mmTotal * .24;
    brownTotal = mmTotal * .13;
    greenTotal = mmTotal * .16;
    orangeTotal = mmTotal * .20;
    redTotal = mmTotal * .13;
    yellowTotal = mmTotal * .14;

    System.out.println("blue: " + blueTotal); 
    System.out.println("brown: " + brownTotal); 
    System.out.println("green: " + greenTotal); 
    System.out.println("orange: " + orangeTotal); 
    System.out.println("red: " + redTotal); 
    System.out.println("yellow: " + yellowTotal);

    double colorSum = (blueTotal + brownTotal + greenTotal + orangeTotal + redTotal + yellowTotal);

    System.out.println("Sum: " + colorSum);

    if (blueTotal < brownTotal && redTotal > orangeTotal)
     System.out.println("Blue under Brown and Red over Orange");
    
    if (brownTotal >= greenTotal)
     System.out.println("Brown is greater than or equal to Green");

    if (colorSum == mmTotal)
     System.out.println("Numbers match");

  }
}