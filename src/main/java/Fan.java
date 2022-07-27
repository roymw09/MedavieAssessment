package main.java;

public class Fan {

    private int speed = 0;
    private boolean reversed = false;

    public void increaseSpeed() {
        if (reversed) {
            if (speed == 0) {
                speed = 3;
                return;
            }
            speed--;
        } else {
            if (speed == 3) {
                speed = 0;
                return;
            }
            speed++;
        }
    }

    public void reverseSpeedDirection() {
        reversed = !reversed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getReversed() {
        return reversed;
    }
}
