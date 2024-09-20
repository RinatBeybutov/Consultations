public class Outer {

    private Counter counter = new Counter();

    public TestClass testClass;

    private String name = "Name";

    public void print() {
        System.out.println("print");
        counter.incrementCount();
    }

    public int getPrintCount() {
        return counter.getCount();
    }

    public class TestClass {

    }

    private class Counter {

        private int count;

        public Counter() {
            count = 0;
            System.out.println(name);
        }

        public void incrementCount() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }


}
