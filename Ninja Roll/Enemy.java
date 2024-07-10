import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-3);
          Actor Ninja;
        Ninja = getOneObjectAtOffset(0,0,Ninja.class);
        
        if (Ninja != null)
        {
            MyWorld world;
            world = (MyWorld) getWorld();
            
            world.removeObject(Ninja);
    }
  }
  
}
