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
        head = null;
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

    private class Node {
        private Node next;
        private Object data;

        private Node(Node next, Object data) {
            this.next = next;
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
