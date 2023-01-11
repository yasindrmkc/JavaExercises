package lab_question_10;

public class Main {
    public static void main(String[] args) {
        
        Character heroCharacter= new HeroCharacter(1,"Hero");
        Character enemy;
        GollumCharacter gollumCharacter= new GollumCharacter(2, "Gollum");
        MonsterCharacter monsterCharacter1= new MonsterCharacter(3, "monster");
        MonsterCharacter monsterCharacter2= new MonsterCharacter(3, "monster");

        Character[] enemies={gollumCharacter,monsterCharacter1,monsterCharacter2};
        int index=0;
        enemy=enemies[0];
        while(heroCharacter.isAlive && enemy.isAlive){
            if(heroCharacter instanceof AttackBehaviour){
                ((AttackBehaviour) heroCharacter).attackTo(enemy);
            }
            if(enemy instanceof AirAttackBehaviour){
                ((AirAttackBehaviour)enemy).airAttackTo(heroCharacter);
                heroCharacter.defense();
            }
            if(!enemy.isAlive && index<enemies.length){
                enemy=enemies[index++];
            }
        }
    }
}
