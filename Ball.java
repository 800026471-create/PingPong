import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    Ball actor = new Ball();
    GreenfootImage ballImage = getImage();

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
         ballImage.scale(100,100);
         
    }
    public void move(Actor a){
        if(a.getX() >= actor.getX()-2&&a.getX() <= actor.getX()+2){
            if(a.getY() >= actor.getY()-2&&a.getY() <= actor.getY()+2){
                actor.setLocation(actor.getX()+)
            }
        }
    }
    public void rC(Actor PlayerMovement){
        int randoms = Greenfoot.getRandomNumber(91)+45;
        setRotation(randoms);
    }

}
