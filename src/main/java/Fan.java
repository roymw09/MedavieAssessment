package main.java;

public class Fan {

    private int speed = 0;
    private boolean reversed = false;

    public void increaseSpeed() {
        // if the direction is reversed
        // decrement the speed on each method call while the fan is not at 0
        // if the increaseSpeed method is called while the fan direction
        // is reversed and the speed is at 0 then return to speed 3
        if (reversed) {
            if (speed == 0) {
                speed = 3;
                return;
            }
            speed--;
        } else {
            // if the direction is not reversed we increment the fan speed
            // on each method call until the fan reaches three
            // then the fan is set to speed 0
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
