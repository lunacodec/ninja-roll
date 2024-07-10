import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun extends Actor
{
    /**
     * Act - do whatever the Sun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor Enemy;
        Actor JumpObstacle;
        Actor SlideObstacle;
        
        JumpObstacle = getOneObjectAtOffset(0,0,JumpObstacle.class);
        SlideObstacle = getOneObjectAtOffset(0,0,SlideObstacle.class);
        Enemy = getOneObjectAtOffset(0,0,Enemy.class);
        
        if(Enemy != null || JumpObstacle != null || SlideObstacle != null)
        {
            MyWorld world;
            world = (MyWorld) getWorld();
            
            
            world.removeObject(Enemy);
            world.removeObject(JumpObstacle);
            world.removeObject(SlideObstacle);
            
            
            
        }
    }    
}
