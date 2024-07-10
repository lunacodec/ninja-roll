import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpObstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpObstacle extends Actor
{
    /**
     * Act - do whatever the JumpObstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-3);
         Actor Ninja;
         Actor LightWall;
        Ninja = getOneObjectAtOffset(0,0,Ninja.class);
        LightWall = getOneObjectAtOffset(0,0,Ninja.class);
        
        if (Ninja != null || LightWall != null)
        {
            MyWorld world;
            world = (MyWorld) getWorld();
            
            world.removeObject(Ninja);
            world.removeObject(this);
   }
   
  }
}
