public class CustomQueue {

    private int [] array;

    // Индекс хвоста
    private int indexTail;

    public CustomQueue() {
        array = new int[5];
        indexTail = 0;
    }

    // Метод позволяет вставлять элемент в конец
    public void push(int value) {
        if(indexTail == array.length) {
            System.out.println("Не могу вставить! Очередь переполнена!");
        } else {
            array[indexTail++] = value;
        }
    }

    // Метод позволяет извлекать первый элемент из очереди
    public int pop() {
        int result = array[0];
        for (int i = 0; i <array.length -1 ; i++) {
            array[i] = array[i+1];
        }
        indexTail--;
        return result;
    }

    // Является ли очередь пустой
    public boolean isEmpty() {
        return indexTail == 0;
    }
}
