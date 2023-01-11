package canon;

public class CanonOffice extends Printer implements ScanBehaviour,FaxBehaviour{

    @Override
    public void fax() {
        
        System.out.println("CanonOffice faxes");
    }

    @Override
    public void scan() {
        
        System.out.println("CanonOffice scans");

    }

    @Override
    void print() {
        
        System.out.println("CanonOffice prints");

    }
    
}
