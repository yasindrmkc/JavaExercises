package canon;
public class canonmain{
    public static void main(String[] args) {
        CanonProffesional canonProffesional = new CanonProffesional();
        CanonBasic canonBasic = new CanonBasic();
        CanonOffice canonOffice = new CanonOffice();
        Printer[] printers = {canonBasic,canonOffice,canonProffesional};
        for (Printer printer : printers) {
            if( printer instanceof ColorPrintBehaviour){
                ((ColorPrintBehaviour)printer).colorPrint();
            }
        }
    }
}