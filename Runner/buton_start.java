import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buton_start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buton_start extends Actor
{
    private int worldWidth;
    private int worldHeight;
    private int nr=0;
    protected void addedToWorld(World world)
    {
    worldHeight= world.getHeight();
    worldWidth = world.getWidth();
    setLocation(worldWidth/2,worldHeight-50);
    }
    /**
     * Act - do whatever the buton_start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void start(){ 
     if (Greenfoot.mouseClicked(this)){
         nr++;
        if(nr==1)       setLocation(worldWidth-220,worldHeight-200); 
        else if(nr==2)  setLocation(worldWidth-970,worldHeight-375);
       else 
        Greenfoot.setWorld(new MyWorld());
       }
    }
    public void act() 
    {  
       start();
    }    
}
