package space_challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Simulation {
    
    ArrayList<String> list=new ArrayList<>();
    Rocket U1;
    public  Collection<String> loadItems() throws IOException{
        
        BufferedReader read= new BufferedReader(new FileReader("phase1.txt"));
        while(true){
            String reader=read.readLine();
            if(reader==null){
                break;
            }
            list.add(reader);
        }
        read.close();
        return list;
    }
    public Collection<String> loadU1(){
        ArrayList<String> list2=new ArrayList<>(); 
        Collections.copy(list2, list);
        return list2;
    }  

    public Collection<String> loadU2(){
        ArrayList<String> list3=new ArrayList<>();
        Collections.copy(list3,list);
        return list3; 
    }

}
