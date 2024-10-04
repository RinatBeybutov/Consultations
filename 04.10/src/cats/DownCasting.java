package cats;

public class DownCasting {
    public static void main(String[] args) {

        int a = 5;

        long b = (long) a;

        Object catObj = new Cat("");

        Cat cat = (Cat) catObj;

        // Ошибка!
        //Cat cat2 = (Cat) new Dog();

        // Такое нисходящее преобразование невозможно!
        //GreenCat greenCat = (GreenCat) cat;

        GreenCat greenCat = new GreenCat("");

        Cat greenCatSupper = (Cat) greenCat;

        System.out.println("asd");

    }
}
