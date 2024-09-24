public class LinkedListCustom {

    private Node firstNode;

    public LinkedListCustom(int startValue) {
        firstNode = new Node();
        firstNode.value = startValue;
        firstNode.nextNode = null;
    }

    public int getFirstValue() {
        return firstNode.value;
    }

    public int getLastValue() {
        Node currentNode = firstNode;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        return currentNode.value;
    }

    public void addLast(int value) {
        Node currentNode = firstNode;
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        Node newLast = new Node();
        newLast.value = value;
        currentNode.nextNode = newLast;
    }

    public void addFirst(int value) {
        Node newFirst = new Node();
        newFirst.value = value;
        newFirst.nextNode = firstNode;
        firstNode = newFirst;
    }

    private class Node {
        private int value;
        private Node nextNode;
    }
}
