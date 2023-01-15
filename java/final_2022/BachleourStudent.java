package final_2022;

public class BachleourStudent extends Student implements ProjectScoreBehavior {

    BachleourStudent(int id,float mid,float fin){
        super(id, mid, fin);
    }
    @Override
    float computeTotalScore(){
        return computeBaseScore()+projectScore();
    }
    @Override
    public float projectScore(){
        return 20;
    }
}
