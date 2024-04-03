
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String licensePlate;
    // variável fixa de percentagem de taxa.
    private static final float HONORARY_PERCENTAGE = 3f;

    /**
     * Construtor para objetos da classe GroundTransportation
     */
    public GroundTransportation()
    {
        super();
        super.setFees(HONORARY_PERCENTAGE);
        this.licensePlate = "";
    }
    
    public GroundTransportation(String licensePlate)
    {
        super();
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    @Override
    public double getPriceWithFees(){
        return super.getPrice() * (1.0 + (super.getFees() * 0.01));
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
   public String toString() {
        return super.toString() + "Transporte: " + this.licensePlate;
    }

}
