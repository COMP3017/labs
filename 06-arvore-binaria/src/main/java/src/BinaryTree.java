package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private Node root;
    private int height;

    public void insert(int _value) { 
        if (this.root == null) {
            this.root = new Node(_value);
            this.height++;
        }else{
            Node currNode = this.root;
            while(true){
                if(_value < currNode.getValue()){
                    if(currNode.getLeft() == null){
                        currNode.setLeft(new Node(_value));
                        break;
                    }else{
                        currNode = currNode.getLeft();
                    }
                }else{
                    if(currNode.getRight() == null){
                        currNode.setRight(new Node(_value));
                        break;
                    }else{ 
                        currNode = currNode.getRight();
                    }
                }
            }
        }
    }


    public Node getRoot(){
        return this.root;
    }

    public int getHeight() {
        return height;
    }


    /**
     *              9
     *            /   \
     *           5    15
     *         /  |  /  \
     *        3   7 11  21
     */


    @Override
    public String toString() {
        return "";
        // return printTree(this.root);
    }

    public String posOrder(Node node){
        String arvore = "";
        if (node == null) {
            return arvore;
        } else {
            arvore += posOrder(node.getLeft()) + " ";
            arvore += posOrder(node.getRight()) + " ";
            arvore += node.getValue() + " ";
        }
        return arvore;
    }
    public String inOrder(Node node){
        String arvore = "";
        if (node == null) {
            return arvore;
        } else {
            arvore += inOrder(node.getLeft()) + " ";
            arvore += node.getValue() + " ";
            arvore += inOrder(node.getRight()) + " ";
        }
        return arvore;
    }
    public String preOrder(Node node){
        String arvore = "";
        if (node == null) {
            return arvore;
        } else {
            arvore += " " + node.getValue() + " ";
            arvore += preOrder(node.getLeft());
            arvore += preOrder(node.getRight());
        }
        return arvore;
    }

    public String bfs(){

        if(this.root == null){
            return "";
        }
        Queue<Node> fila = new LinkedList<>();
        fila.add(this.root);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while(!fila.isEmpty()){
            Node aux = fila.remove();

            stringBuilder.append(" " + aux + " ");

            if (aux.getLeft() != null){
                fila.add(aux.getLeft());
            }

            if (aux.getRight() != null){
                fila.add(aux.getRight());
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();

    }


    public String print(){

        if(this.root == null){
            return "";
        }
        Stack<Node> pilha = new Stack();
        pilha.add(this.root);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while(!pilha.isEmpty()){
            Node aux = pilha.pop();

            stringBuilder.append(" " + aux + " ");

            if (aux.getLeft() != null){
                pilha.push(aux.getLeft());
            }

            if (aux.getRight() != null){
                pilha.push(aux.getRight());
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();

    }


}

/**
 * 
 *          root -> []
 * 
 * 
 * 
 * 
 */