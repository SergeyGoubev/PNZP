package com.LB7;

import com.LB7.Node.AbstractNode;
import com.LB7.Node.SimpleNode;
import com.LB7.Node.Operations.MultNode;
import com.LB7.Node.Operations.AddNode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //выглядит неочень красиво
        AbstractNode firstTestNode = new MultNode(Arrays.asList(
                new AddNode(Arrays.asList(new SimpleNode(5), new SimpleNode(5))),
                new AddNode(Arrays.asList(new SimpleNode(3), new SimpleNode(1))),
                new SimpleNode(2),
                new SimpleNode(3)
        ));

        AbstractNode secondTestNode = new MultNode(Arrays.asList(
                new AddNode(Arrays.asList(new SimpleNode(5), new SimpleNode(3))),
                new AddNode(Arrays.asList(new SimpleNode(3), new SimpleNode(1))),
                new SimpleNode(2),
                new SimpleNode(3)
        ));

        System.out.println("Первое выражение: " + firstTestNode.toString() + "\tРввно: " + firstTestNode.calculate());
        System.out.println("Второе выражение: " + secondTestNode.toString() + "\tРавно: " + secondTestNode.calculate());

    }
}
