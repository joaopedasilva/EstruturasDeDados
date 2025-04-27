import java.util.NoSuchElementException;

public class UnaList<T> {
    // Hold the reference to the first node of this List.
    private Node<T> firstNode;
    private int totalElements;

    public void insertAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(firstNode);
        firstNode = newNode;
        totalElements++;
    }

    public Node<T> removeAtBeginning() {
        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();
        totalElements--;
        return aux;
    }

    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");

            currentNode = currentNode.getNext();

        }

        builder.append("]");

        return  builder.toString();
    }

    // Design the other list methods.
    // Insert at the end, in order, remove at the end,
    // remove elements by value, search an element.
    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> currentNode = firstNode;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        totalElements++;
    }

    public void removeAtEnd() {
        Node<T> currentNode = firstNode;
        Node<T> previousNode = null;
        while (currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (previousNode != null) {
            previousNode.setNext(null);
        } else {
            firstNode = null;
        }
        totalElements--;
    }

    public int searchItem(T value) {
        Node<T> node = firstNode;
        int nodeIndex = 0;
        while (node != null) {
            if (node.getValue() == value) {
                return nodeIndex;
            }
            node = node.getNext();
            ++nodeIndex;
        }
        throw new NoSuchElementException();
    }

    public void removeItemByValue(T value) {
        Node<T> previousNode = null;
        Node<T> currentNode = firstNode;
        while (currentNode != null) {
            if (currentNode.getValue() == value) {
                if (previousNode == null) {
                    currentNode = null;
                    --totalElements;
                    return;
                } else {
                    previousNode.setNext(currentNode.getNext());
                    currentNode = null;
                    --totalElements;
                    return;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        throw new NoSuchElementException();
    }

    public boolean isListEmpty() {
        if (firstNode == null || totalElements <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void insertValueAfterIndex(T value, int index) {
        Node<T> node = firstNode;
        for (int i = 0; i < totalElements; i++) {
            if (i == index) {
                Node<T> newNode = new Node<>(value);
                newNode.setNext(node.getNext());
                node.setNext(newNode);
                ++totalElements;
                return;
            }
            node = node.getNext();
        }
        throw new NoSuchElementException();
    }

    public void removeItemFromIndex(int index) {
        if (index < 0) {
            throw new NoSuchElementException();
        } else if (index == 0) {
            firstNode = firstNode.getNext();
            --totalElements;
        } else {
            Node<T> previousNode = null;
            Node<T> currentNode = firstNode;
            for (int i = 1; i <= index; i++) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                if (currentNode == null) {
                    throw new NoSuchElementException();
                }
            }
            previousNode.setNext(currentNode.getNext());
            --totalElements;
        }
    }

    public int listSize() {
        return totalElements;
    }

    public void changeElementValue(int index, T value) {
        Node<T> node = firstNode;
        int currentIndex = 0;
        while (currentIndex != index) {
            node = node.getNext();
            if (node == null) {
                throw new NoSuchElementException();
            }
            ++currentIndex;
        }
        node.setValue(value);
    }
}