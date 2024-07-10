import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public StartButton() 
    {
        setImage(new GreenfootImage("Click here to begin", 50, Color.BLACK, new Color(0,0,0,0)));
    } 
    public void act()
    {
        setImage(new GreenfootImage("Click here to begin", 50, Color.BLACK, new Color(0,0,0,0)));
        
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        
        }
    }
}
