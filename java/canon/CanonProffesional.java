package canon;

public class CanonProffesional extends Printer  implements ColorPrintBehaviour,ScanBehaviour,FaxBehaviour{

    @Override
    void print() {
        System.out.println("CanonProffesional prints");
    }

    @Override
    public void fax() {
        System.out.println("CanonProffesional faxes");

        
    }

    @Override
    public void scan() {
        System.out.println("CanonProffesional scans");

        
    }

    @Override
    public void colorPrint() {
        System.out.println("CanonProffesional color prints");

        
    }
    
}
