package pl.javastart.task;

public class Televisor {
    public boolean isTurnOn = false;

    public void turnOn() {
        isTurnOn = true;
    }

    public void turnOff() {
        isTurnOn = false;
    }

    public void showStatus() {
        System.out.println("Czy telewizor jest włączony: " + isTurnOn);
    }
}
