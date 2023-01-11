package space_challenge;

import java.util.Random;

public class U2 extends Rocket{
    boolean b;
    @Override
    public boolean land() {
        int isLand=213254236;
        Random r= new Random();
        int a=r.nextInt();
        if(isLand<a){
            b=false;
        }
        return b;
    }

    @Override
    public boolean launch() {
        int isLaunch=12253245;
        Random r= new Random();
        int a=r.nextInt();
        if(isLaunch<a){
            b=false;
        }
        return b;
    }
    
    
}
