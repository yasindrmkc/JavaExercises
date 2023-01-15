package final_2022;

public class PhDStudent extends MasterStudent implements ArticleScoreBehavior {
    int numberOfArticles;
    PhDStudent(int id,float mid,float fin,int conf,int numberOfArticles){
        super(id, mid, fin, conf);
        this.numberOfArticles=numberOfArticles;
    }
    @Override
    float computeTotalScore(){
        return computeTotalScore()+articleScore();
    }
    @Override
    public float articleScore(){
        return numberOfArticles*8;
    }
}
