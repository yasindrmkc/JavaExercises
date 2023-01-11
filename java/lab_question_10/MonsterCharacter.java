package lab_question_10;

public class MonsterCharacter extends Character implements FireAttackBehaviour,AirAttackBehaviour{
    MonsterCharacter(int id,String name){
        super(id, name);
    }

    @Override
    public void airAttackTo(Character other) {
        System.out.println("MonsterCharacter air attacks");
        other.takeDamage(20);
    }
    
    @Override
    public void fireAttackBehaviour(Character other) {
        System.out.println("MonsterCharacter takes damage");
        other.takeDamage(50);
    }

    @Override
    void defense() {
        System.out.println("MonsterCharacter defenses");
        if(this.barrier<100){
            this.barrier+=10;
        }
        if(this.barrier>100){
            this.barrier=100;
        }
        
    }

    
}
