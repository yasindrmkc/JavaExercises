package space_challenge;
import java.util.*;
public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean isCarry();
    List<Item> carry();
}
