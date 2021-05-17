package com.xocs.ap.generics;

public abstract class Node<T> {

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void connect(T connection, Node<T> connectedNode);

    public abstract Node getNextNode(T connection);
}
