public class CustomStack {

    private int [] array;

    private int pointer;

    private int [] minArray;

    private int minPointer;

    public CustomStack() {
        pointer = 0;
        minPointer = 0;
        array = new int[10];
        minArray = new int[10];
    }

    public void push(int num) {
        array[pointer++] = num;
        if(minPointer == 0) {
            minArray[minPointer++] = num;
        } else if (minArray[minPointer - 1] > num) {
            minArray[minPointer++] = num;
        }
    }

    public int pop() {
        if(array[pointer - 1] == minArray[minPointer - 1]) {
            minPointer--;
        }
        pointer--;
        return array[pointer];
    }

    public int getMin() {
        return minArray[minPointer-1];
    }


    /**
     * [] -> [2] -> [2,3] -> [2] -> []
     *
     */
}
