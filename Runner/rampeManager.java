import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rampeManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rampeManager extends rampe
{
    /**
     * Act - do whatever the rampeManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int z,nr=65,y_ant;
    int yAnt,yPrezent,z_ant;
    boolean ok=true;
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
       //credits:Greenfoot Forum
    }
    public void act()
    {
       if(ok){
           yAnt=((podea) getWorld().getObjects(podea.class).get(0)).getY();
           ok=false;
           z=getRandomNumber(1,6);
        }
       int semn=getRandomNumber(1,2);
       if(semn==1)yPrezent=yAnt+getRandomNumber(-185,-110);
       else yPrezent=yAnt+getRandomNumber(100,200);
       if(yPrezent<=100)yPrezent=yAnt+getRandomNumber(150,200);
       if(yPrezent>=600)yPrezent=yAnt-getRandomNumber(150,200);
      
      if(z==1 && nr==120){
          getWorld().addObject(new rampa10(),1300,yPrezent);
          yAnt=yPrezent;
          z=getRandomNumber(2,6);
          nr=0;
        }
       else if(z==2 && nr==135){
          getWorld().addObject(new rampa15(),1300,yPrezent);
          yAnt=yPrezent;
          int interval=getRandomNumber(1,2);
          if(interval==1)
            z=1;
          else z=getRandomNumber(3,6);
          nr=0;
        }
       else if(z==3 && nr==175){
          getWorld().addObject(new rampa17(),1300,yPrezent);
          yAnt=yPrezent;
          int interval=getRandomNumber(1,2);
          if(interval==1)
            z=getRandomNumber(1,2);
          else z=getRandomNumber(4,6);
          nr=0;
        }
       else if(z==4 && nr==175){
          getWorld().addObject(new rampa20(),1300,yPrezent);
          yAnt=yPrezent;
          int interval=getRandomNumber(1,2);
          if(interval==1)
            z=getRandomNumber(1,3);
          else z=getRandomNumber(5,6);
          nr=0;
        }
      else if(z==5 && nr==120 ){
          getWorld().addObject(new rampaLenta(),1300,yPrezent);
          yAnt=yPrezent;
          z=getRandomNumber(1,6);
          nr=0;
        }
       else if(z==6 && nr==138){
          getWorld().addObject(new rampaRapida(),1300,yPrezent);
          yAnt=yPrezent;
          z=getRandomNumber(1,5);
          nr=0;
        }
      nr++;
    }
}
