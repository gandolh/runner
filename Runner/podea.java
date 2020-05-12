import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class podea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class podea extends Actor
{
    /**int x=Greenfoot.getRandomNumber(3);
     * Act - do whatever the podea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int worldWidth;
    
    protected void addedToWorld(World world){
    worldWidth=world.getWidth();
    }  
    int x,y;
    public void act()  {  
       
        coordonate();
        if(x>-worldWidth)retragere ();
       
      
    }  
    public void coordonate(){
         x=getX();
         y=getY();
         
    }
    public void retragere(){
         x-=2;
        setLocation(x,y);
         //genereaza alta platforma;
    }
}