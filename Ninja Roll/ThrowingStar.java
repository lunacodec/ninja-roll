import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThrowingStar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThrowingStar extends Actor
{
    /**
     * Act - do whatever the ThrowingStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(getX()+5, getY());
        if(getX() <=0)
        {
            getWorld().removeObject(this);
            return;
            
        }
        destroy();
    }  
    public void destroy()
    {
        Actor Enemy;
        
        Enemy = getOneObjectAtOffset(0,0,Enemy.class);
        
        
        if(Enemy != null)
        {
            MyWorld world;
            world = (MyWorld) getWorld();
            
            
            world.removeObject(Enemy);
            world.removeObject(this);
            
            
        }
        
    }
}
