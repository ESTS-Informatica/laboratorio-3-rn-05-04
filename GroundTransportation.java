
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

}
