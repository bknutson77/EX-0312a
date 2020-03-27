package q2.form_template_method1.refactored;

public class A {
   public static void main(String[] args) {
      System.out.println("After");
      System.out.println("m1:" + (new A().m1(0, 3)));
      System.out.println("m2:" + (new A().m2(0, 3)));
   }

   int m1(int min, int max) {
      return common(min, max, 0);
   }

   int m2(int min, int max) {
      return common(min, max, 1);
   }
   
   int common(int min, int max, int power) {
      int sum = 0;
      for (int i = min; i <= max; i++) {
    	  sum += i * Math.pow(i, power);
      }
      return sum;
   }
}