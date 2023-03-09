package com.example.myapplication;

import android.widget.Button;  public class Item {
    Button button;
    String text;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Item(String text) {
        this.text = text;
    }
}
