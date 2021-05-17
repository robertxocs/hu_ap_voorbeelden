package com.xocs.ap.generics;

public class CharacterNode extends Node<Character> {

    public CharacterNode(String name) {
        super(name);
    }

    @Override
    public void connect(Character connection, Node<Character> connectedNode) {

    }

    @Override
    public Node getNextNode(Character connection) {
        return null;
    }


}
