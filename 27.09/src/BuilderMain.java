public class BuilderMain {
    public static void main(String[] args) {

        // Ошибка! Конструктор приватный!
        // GreenCat cat = new GreenCat();

        GreenCat.Builder builder = new GreenCat.Builder();

        // Инициализация с переменным количество переменных
        GreenCat cat = builder
                .setName("Barsik")
                //.setOwner("Tom")
                .build();

        cat.setOwner("Tom");

        // Использование StringBuilder

        // Вариант 1
        String s1 = "s1";
        String s2 = "s2";

        String sum = s1 + s2;

        //Вариант 2
        StringBuilder sb = new StringBuilder();
        String sum1 = sb
                .append("s1")
                .append("s2")
                .toString();

        // Почему строки Immutable в java ???
    }
}
