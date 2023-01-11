package canon;

public class CanonBasic extends Printer implements ScanBehaviour {

    @Override
    public void scan() {
        System.out.println("CanonBasic scans");
        
    }

    @Override
    void print() {
        
        System.out.println("CanonBasic prints");

    }
    
    
}
