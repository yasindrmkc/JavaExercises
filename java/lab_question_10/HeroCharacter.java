package lab_question_10;

public class HeroCharacter extends Character implements AttackBehaviour {
 
    HeroCharacter(int id, String name){
        super(id, name);
    }

    @Override
    public void attackTo(Character other) {
        other.takeDamage(5);
        System.out.println("Hero character attacks."+other.barrier);
        
    }

    @Override
    void defense() {
        if(this.barrier<100){
            this.barrier+=5;
        }
        if(this.barrier>100){
            this.barrier=100;
        }
    }


}
