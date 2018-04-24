package com.thoughtworks.tw101.exercises.exercise9;

import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node nodeLeft;
    private Node nodeRight;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if(name.compareTo(nameOfNewNode) <= 0)
        {
            if(nodeRight == null)
                nodeRight = new Node(nameOfNewNode);
            else
                nodeRight.add(nameOfNewNode);
        }
        else if (name.compareTo(nameOfNewNode) > 0)
        {
            if(nodeLeft == null)
                nodeLeft = new Node(nameOfNewNode);
            else
                nodeLeft.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        populateNames(names);
        return names;
    }

    private void populateNames(List<String> names) {
        if(nodeLeft != null)
            nodeLeft.populateNames(names);

        names.add(name);

        if(nodeRight != null)
            nodeRight.populateNames(names);
     }
}
