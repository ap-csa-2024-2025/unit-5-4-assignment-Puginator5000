public class Main
{
  public static void main(String[] args)
  {
    distance(0, 5, 0, 0);

    quadratic(1, 5, 6);
  }

  public static void distance(double x1, double y1, double x2, double y2) {
     double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

     System.out.println(distance);
  }

  public static void quadratic(double a, double b, double c) {
    double sol1 = ((-1 * b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

    double sol2 = ((-1 * b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a));

    System.out.println(sol1 + ", " + sol2);
  }
  // Implement distance formula method here

  // implement one of your quadratic formula methods here

  // implement the other quadratic formula here
}
