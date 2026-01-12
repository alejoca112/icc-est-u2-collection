package models;

public class Node<T> {
    private T value;

    public Node(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }
}
