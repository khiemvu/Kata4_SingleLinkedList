package single_linked_list;

/**
 * User: Khiem
 * Date: 7/30/13
 * Time: 1:38 PM
 */
public class SingleLinkedList {
    private Node head;
    private static int index;

    SingleLinkedList(){
        head = new Node(null);
        index = 0;
    }
    public static int size() {
        return index;
    }

    public boolean isEmpty() {
        if(index == 0)
            return true;
        else
            return false;
    }

    public void append(Object test) {
        Node temp = new Node(test);
        Node currentNode = head;
        while(currentNode.getNext()!= null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(temp);
        index++;
    }

    public Object last() {
        Node currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public void insertAfter(int number, Object o) {
        if(number > index)
            throw new RuntimeException("Out of size linked list");
        else{
            Node currentNode = head;
            for(int i = 0; i < number; i++)
                currentNode = currentNode.getNext();
            currentNode.setData(o);
            index++;
        }
    }

    public Object first() {
        return head.getNext().getData();
    }

    private class Node {
        private Node next;
        private Object data;

        private Node(Node next, Object data) {
            this.next = next;
            this.data = data;
        }

        public Node(Object data) {
            this.next = null;
            this.data = data;
        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }

        private Object getData() {
            return data;
        }

        private void setData(Object data) {
            this.data = data;
        }
    }
}
