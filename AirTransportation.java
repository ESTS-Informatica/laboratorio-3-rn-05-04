/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private static final double HONORARY_PERCENTAGE = 4.0;
    
    public AirTransportation(String name, int numberOfContainers)
    {
        super();
        super.setFees(HONORARY_PERCENTAGE);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    } 
    
    public String getName() {return this.name;}
    
    public int getNumberOfContainers() {return this.numberOfContainers;}
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getPriceWithFees() {
        return super.getPrice() * (1.0 + (super.getFees() * 0.01));
    }
    
    public String getTransportType() {return "Air Transportation";}
    
    @Override
    public String toString() {
        return super.toString() + "Transporte: " + this.name + "\nNúmero de Contentores: " + this.numberOfContainers;
    }
    
}
