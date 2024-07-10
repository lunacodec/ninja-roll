import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Counter myCounter;
    /**
     * Constructor for objects of class MyWorld.
     * %
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        
        myCounter = new Counter();
        addObject(myCounter, 100,20);
        prepare();
    }
    int SpawnTimer = 0;
    
    public Counter getCounter()
    {
        return myCounter;
    }
    public void act()
    {
        int number = Greenfoot.getRandomNumber(3);
        SpawnTimer++;
        
      
            
        if(SpawnTimer == 100)
        {
        if (number == 0)
        {
            addObject(new JumpObstacle(),990, Greenfoot.getRandomNumber(300)+50);
            SpawnTimer = 0;
        }
        if (number == 1)
        {
            addObject(new SlideObstacle(),990, Greenfoot.getRandomNumber(300)+50);
            SpawnTimer = 0;
        }
        if (number == 2)
        {
            addObject(new Enemy(),950, Greenfoot.getRandomNumber(300)+50);
            SpawnTimer = 0;
        } 
    }
        
            
        
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()

    {
        Sun sun = new Sun();
        addObject(sun,38,34);
        Ninja ninja = new Ninja();
        addObject(ninja,77,222);
        ninja.setLocation(58,231);
        JumpObstacle jumpobstacle = new JumpObstacle();
        addObject(jumpobstacle,487,261);
        removeObject(jumpobstacle);
        ninja.setLocation(203,244);
        sun.setLocation(20,171);
        sun.setLocation(15,177);
        ninja.setLocation(77,215);
        Moon moon = new Moon();
        addObject(moon,937,199);
        moon.setLocation(985,197);
    }
}
