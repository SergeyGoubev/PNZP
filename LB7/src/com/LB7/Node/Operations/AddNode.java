package com.LB7.Node.Operations;

import com.LB7.Node.AbstractNode;

import java.util.Collection;

public class AddNode implements AbstractNode {
    private final Collection<AbstractNode> nodeList;

    public AddNode(Collection<AbstractNode> nodeList) {
        this.nodeList = nodeList;
    }

    public int calculate() {
        int result = 0;
        boolean first = true;
        for (AbstractNode node : nodeList) {
            if (first) {
                result = node.calculate();
                first = false;
            } else {
                result -= node.calculate();
            }
        }
        return result;
    }

    public String toString() {
        String result = "";
        boolean first = true;
        for (AbstractNode node : nodeList) {
            if (!first) result += "-";
            first = false;

            result += "(" + node + ")";
        }
        return result;
    }
}