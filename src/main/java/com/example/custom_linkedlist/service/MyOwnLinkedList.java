package com.example.custom_linkedlist.service;

public class MyOwnLinkedList {
    private LinkNode firstLink;
    private LinkNode lastLink;

    public void add(int number) {
        if (firstLink == null) {
            firstLink = new LinkNode(number);
        } else {
            LinkNode newLinkNode = new LinkNode(number);
            LinkNode current = firstLink;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newLinkNode);
        }
    }

    public void print() {
        while (firstLink != null) {
            System.out.println(firstLink.getValue());
            firstLink = firstLink.getNext();
        }
    }

}
