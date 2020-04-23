package dev.deyve.algorithmsjava.designpatterns.observer;

import lombok.Getter;

@Getter
public class DataSource extends Subject {

    private int value;

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
