import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vrajitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vrajitor extends magie
{
    /**
     * Act - do whatever the vrajitor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImagine = new GifImage("vrajitor.gif");
    private int nr=0;
    public void deplasare(){
    setLocation(getX()-2,getY());
    }
    public void atac(){
        getWorld().addObject(new bila(),getX(),getY());
        nr=0;
    }
    public void stergere(){
       if(getX()<=0)getWorld().removeObject(this);
    }
    public void act() 
    {
        deplasare();
        nr++;
        if(nr==85)atac();
        setImage(gifImagine.getCurrentImage());
        stergere();
    }    
}
