/**
 * PlayerMovement: The class controls the player's movement, giving them directionality.
 *                 Additionally, the user's speed is also controlled with this class, 
 *                 making them slow them down after surviving for a certain time to increase difficulty.
 * 
 * @Harry Zhou
 * @11/18/2025
 * 
**/
import greenfoot.*;

public class PlayerMovement extends Actor {
    private int distance = 10;
    private long start = System.currentTimeMillis();

    public void act() {
        checkMovement();
    }

   

    private void checkMovement() {
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - distance);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + distance);
        }
    }
}
