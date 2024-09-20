import pac1.Bank;
import pac1.Constants;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //test();

        // Структуры данных
        /**
         * Стек
         * Связный список
         * Очередь
          */

        Stack<Integer> stack1 = new Stack<>();

        //stack1.pop();

        CustomStack stack = new CustomStack();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(-1);
        System.out.println(stack.getMin()); // = -1
        stack.pop();
        System.out.println(stack.getMin()); // = 2


        /**
         * [2, 3, 4, 5, -1, -2, 10, -100] - значения
         * [2, -1, -2, -100] - минимальные значения
         */


    }

    public void testInnerClass() {
        // Вложенные классы
        Outer outer = new Outer();

        outer.print();
        outer.print();

        int printCount = outer.getPrintCount();

        //Outer.Counter counter = new Outer.Counter();

        //outer.testClass;

        //Outer.TestClass testClass = new Outer.TestClass();

        System.out.println(printCount);
    }

    public static void test() {
        Bank bank = new Bank();
        //bank.cash
        bank.printCash();

        // Доступ к public
        bank.countUsers = 200;

        //bank.

        System.out.println(bank.getCash());

        String organizationType = Bank.ORGANIZATION_TYPE;

        double pi = Constants.PI;
        int timeout = Constants.TIMEOUT;

        String string = Constants.intToString(5);
    }
}