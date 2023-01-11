package space_challenge;

import java.util.List;

public class Rocket implements SpaceShip{
    Rocket U1= new Rocket();
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {  
        return true;
    }

    @Override
    public boolean isCarry() {
        
        return false;
    }

    @Override
    public List<Item> carry() {
        
        return null;
    }
    
}
