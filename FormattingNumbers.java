public class FormattingNumbers {
  public static void main(String[] args) {
    /** DECLARATION **/
    int a, b, f;
    double c, d, e;
    
    /** INITIALIZATION **/
    a = 4500;
    b = 8000;
    c = 4845.54;
    d = 98.56;
    e = -6863.83;
    f = 685;
    
    /** Calculations (if needed) **/
    
    /** System Outprints **/
    System.out.printf("%-20s%-20s%-20s%n", "Problem", "G Specifier", "E Specifier");
    System.out.printf("%-20s%-20g%-20e%n", (a + " x " + b));
    System.out.printf("%-20s%-20g%-20e%n", (b + " / " + c));
    System.out.printf("%-20s%-20g%-20e%n", (e + " / " + f));
    System.out.printf("%-20s%-20g%-20e%n", (e + " x " + c));
  }
}
