import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Actor
{
    int timer = 0;
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
    if(Greenfoot.isKeyDown("Up"))
    {
        move(5);
        
        
    }
    if(Greenfoot.isKeyDown("Left"))
    {
        turn(-3);
        
    }
    if(Greenfoot.isKeyDown("Right"))
    {
        turn(3);
        
    }
    if(Greenfoot.isKeyDown("Down"))
    {
        move(-5);
       
    }
     MyWorld world;
        world = (MyWorld) getWorld();
        
        Counter myCounter = world.getCounter();
        myCounter.startTimer();
         
            

        
         if(Greenfoot.isKeyDown("space"))
        {
            timer ++;
            if(timer == 15)
            {
            getWorld().addObject(new ThrowingStar(),getX(),getY());
            timer = 0;
           }
    }
  }

}

