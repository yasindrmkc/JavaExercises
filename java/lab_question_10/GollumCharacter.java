package lab_question_10;

public class GollumCharacter extends Character implements FireAttackBehaviour{
    
    GollumCharacter(int id,String name){
        super(id, name);
    }

    @Override
    public void fireAttackBehaviour(Character other) {
        other.takeDamage(30);
    }
    @Override
    void defense() {
        if(this.health<100){
            this.health+=5;
        }
        if(this.health>100){
            this.health=100;
        }
    }
    
}
