import datastructures.lists.LinkedList;

class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.append(1);
        list.append(2);

        list.printList();

        list.removeLast();

        list.printList();
    }
}
