import java.util.Scanner; //import scanner Class

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int number;


    System.out.println("Enter a Number to count down or up from: ");
    number = s.nextInt();
    if (number > 0) {
      while (number > 0) {
      number--;
      System.out.println(number);
    } 

    }  else {
      while (number < 0){
        number++;
        System.out.println(number);
      }
    }
  System.out.println("Blast Off!");
  }

}
