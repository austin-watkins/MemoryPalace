import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter number of loci: ");
    int numberOfLoci = input.nextInt();
    System.out.print("Enter name of palace (camelCase): ");
    String MemoryPalaceName = input.next();
    MemoryPalace myMemoryPalace = new MemoryPalace(MemoryPalaceName);

    for (int i = 0; i < numberOfLoci; i++) {
      System.out.print("Enter a place: ");
      String lociName = input.next();
      System.out.print("Enter an image: ");
      String lociImage = input.nextLine();
      myMemoryPalace.addLoci(lociName, lociImage);
    }





  }

}
