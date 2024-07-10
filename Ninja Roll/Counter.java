import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    
      int ScoreTimer = 0;
      int value = 0;
      
      
      
    public Counter()
    {
        setImage(new GreenfootImage("Score:"+ ScoreTimer, 24,Color.BLACK,new Color(0,0,0,0)));
       
    }
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
     {
        
        setImage(new GreenfootImage("Score:"+ ScoreTimer, 24,Color.BLACK,new Color(0,0,0,0)));


    } 
    public void startTimer()
    {
        ScoreTimer = ScoreTimer + 1;
        
    
}
    public void endTimer()
    {
        value = 0;
        ScoreTimer = ScoreTimer + value;
        
    }

  }    

