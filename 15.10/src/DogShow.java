public class DogShow {
    public static void main(String[] args) {
        new DogShow()
                .go();
    }

    private void go() {
        new Hound().bark();  		//howl
        ((Dog) new Hound()).bark();  //howl
        //((Dog) new Hound())..sniff();  //sniff
        new Dog().bark(); ///

    }
}

class Dog{
    public void bark() {
        System.out.println("woof");
    }
}

class Hound extends Dog {

    public void sniff() {
        System.out.println("sniff");
    }

    public void bark() {
        System.out.println("howl");
    }
}