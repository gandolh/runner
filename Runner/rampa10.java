import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rampa10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rampa10 extends rampe
{
    int contorGenerareTepi;
    public rampa10(){
        contorGenerareTepi=getRandomNumber(1,6);
        }
    public int getRandomNumber(int start,int end){
        int normal=Greenfoot.getRandomNumber(end-start+1);
        return start+normal;
    }
     public void deplasare(){
        setLocation(getX()-ms,getY());        
        }
    public void eliminare(){
    if(getX()<0)getWorld().removeObject(this);
    } 
    public void act() 
    {
        deplasare();
        eliminare();
        
        if(contorGenerareTepi==1 && getWorld().getObjects(tepi.class).size() == 0)
        {
            getWorld().addObject(new tepi(),getX(),getY()-11);
            contorGenerareTepi=0;
        }
    }    
}