package ec.edu.epn.tdd.calculator;

public class Principal {
     public static void main(String[] args) {

         Calculator objCalculadora = new Calculator();
         System.out.println("Suma:");
         System.out.println(objCalculadora.addition(3,6));
         System.out.println("Resta:");
         System.out.println(objCalculadora.subtraction(3,6));
    }
}
