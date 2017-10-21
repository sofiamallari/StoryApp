package com.example.sofia.storyapp.model;

public class choice {
    private int textId;
    private int next;

    public choice(int textId, int next) {

        this.textId = textId;
        this.next = next;
    }

    public int getTextId() {

        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
