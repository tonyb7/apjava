import java.util.Scanner;
class Jaron {
  public static int Jaron(int num) {
    int pow2 = 1;
    while(!(pow2>=num)){
      pow2*=2;
    }
    return pow2;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = reader.nextInt();
    System.out.println(Jaron(num));
  }
}