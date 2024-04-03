
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    private int numberOfPackages;

    /**
     * Constructor for objects of class Van
     */
    public Van(int numberOfPackages, String licensePlate)
    {
        super();
        this.numberOfPackages = numberOfPackages;
        super.setLicensePlate(licensePlate);
    }
    
    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }
    
    public int getNumberOfPackages() {return numberOfPackages;}
    
    @Override
    public String toString() {
        return super.toString() + "Número de Pacotes: " + this.numberOfPackages;
    }
}
