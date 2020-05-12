import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test extends Actor
{
    int nr=0,ok=1;
    public void act() 
    {
       if(nr==0){setImage("animatieEnding/mda.PNG");
           setLocation(getX(),getY()-20);
        }
       if(nr<50){
           setLocation(getX(),getY()-1);
           
        }
        else if(nr>=50 && nr<100){
            setLocation(getX(),getY()+1);
        }
       if( nr>=150 && getX()<=934){
           if(nr==150)setLocation(getX(),getY()+20);
           setImage("86 transparent.png");
           setLocation(getX()+2,getY());
           
        }
       if(((dialog) getWorld().getObjects(dialog.class).get(0)).numarReplici==6 && ok==1){
           setLocation(getX(),getY()-20);
           setImage("animatieEnding/coroana.PNG");
           ok=0;
    }
       nr++;
    }    
}
