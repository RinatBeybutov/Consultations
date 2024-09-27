public class PrivateConstructorsMain {
    public static void main(String[] args) {
        /**
         * Для чего используются приватные конструкторы в java
         *      1. В паттерне singleton
         * 2. Ограничние наследования +
         * 3. Ограничения инстанцирования ?
         *      4. Утилитарные классы со статик методами
         *      5. Паттерн builder
         *      6. Информативные имена конструкторов
         */

        Math.min(2,3);

        String s = new String();

        // Информативные имена конструкторов
        GreenCat scientificCat = GreenCat.getScientificCat("Bars", 25, "Max");
    }
}