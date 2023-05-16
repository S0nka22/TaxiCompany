package LinkedList;

public class ClientList {
    ClientList next;
    Object data;

    public ClientList(Object data) {
        next = null;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object dataValue) {
        data = dataValue;
    }

    public ClientList getNext() {
        return next;
    }

    public void setNext(ClientList nextValue) {
        next = nextValue;
    }
}


class LinkedList {

    private ClientList head;
    private int size;

    public LinkedList() {
        head = new ClientList(null);
        size = 0;
    }

    public void add(Object data) {
        ClientList node = new ClientList(data);
        ClientList current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        size++;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        ClientList current = head.getNext();
        String elements = "";
        while (current != null) {
            elements += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return elements;
    }
}