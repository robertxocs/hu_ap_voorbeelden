package com.xocs.ap.generics;

public class DoubleNode extends Node<Double> {

    public DoubleNode(String name) {
        super(name);
    }

    @Override
    public void connect(Double connection, Node<Double> connectedNode) {

    }

    @Override
    public Node getNextNode(Double connection) {
        return null;
    }


}
