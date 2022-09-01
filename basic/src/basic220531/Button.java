package basic220531;

public interface Button {
public void startButton();
public void stopButton();
public void pauseButton();
public void changeButton(int speed);
default void dry() { }
default void clean() { }
}
