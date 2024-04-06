package com.example.custom_linkedlist.service;

public class LinkNode {
    private int value;
    private LinkNode next;

    public LinkNode(int value) {
        this.value = value;
    }

    public LinkNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

}
