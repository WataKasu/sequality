/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate calc = new Calculate();
    int a = 2;
    int b = 3;
    int c = 1;
    int d = 10;
    double ab = calc.sum(a, b);
    double cd = calc.sum2(c, d);
    int cd2 = calc.sumodd(c, d);
    int cd3 = calc.sumeven(c, d);
    System.out.println(new App().getGreeting());
    System.out.println("Sum of 2 and 3 is" + ab + ".Average is " + ab / 2 + ".\n");
    System.out.println("Sum of 1 to 10 is" + cd + ".Average is " + cd / 10 + ".\n");
    System.out.println("Sum of odd of 1 to 10 is" + cd2 + ".Average is " + cd3 + ".\n");
  }
}
