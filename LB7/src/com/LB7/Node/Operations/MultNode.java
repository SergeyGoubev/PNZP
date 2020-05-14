package com.LB7.Node.Operations;

import com.LB7.Node.AbstractNode;

import java.util.Collection;

public class MultNode implements AbstractNode {
    private final Collection<AbstractNode> nodeList;

    public MultNode(Collection<AbstractNode> nodeList) {
        this.nodeList = nodeList;
    }

    public int calculate() {
        int result = 1;
        for(AbstractNode node : nodeList)
        {
            result *= node.calculate();
            if(result == 0) break;
        }
        return result;
    }

    public String toString() {
        String result = "";
        boolean first = true;

        for(AbstractNode node : nodeList)
        {
            if(!first) result += "*";
            first = false;

            result += "(" + node + ")";
        }

        return result;
    }
}
