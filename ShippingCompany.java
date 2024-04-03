import java.util.HashSet;
import java.util.ArrayList;
/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private ArrayList<Transport> inService;

    /**
     * Construtor para objetos da classe ShippingCompany
     */
    public ShippingCompany(String name)
    {
        super();
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public ArrayList<Transport> getInService(){
        return inService;
    }
    
    public void setInService(ArrayList<Transport> inService)
    {
        this.inService = inService;
    }
    
    private Transport getTransportation (String id)
    {
        for (Transport service : this)
        {
             if (service.getId().equals(id))
                 return service;
        } 
        return null;
    }
    
    public void makeTransportation(String id, String origin, String destination, double price){
        Transport transportation = getTransportation(id);
            if (transportation != null && transportation.isAvailable())
            {
                transportation.setOrigin(origin);
                transportation.setDestination(destination);
                transportation.setPrice(price);
                transportation.setAvailable(false);
                inService.add(transportation);
                this.remove(transportation);
                
            }            
    }
    
    public void finalizeTransporation(String id)
    {
        for (Transport transportation : inService)
        {
            if (transportation.getId().equals(id))
            {
                inService.remove(transportation);
                transportation.setOrigin("");
                transportation.setDestination("");
                transportation.setPrice(0.0);
                transportation.setAvailable(true);
                this.add(transportation);
            }
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Nome", this.name));  
        for (Transport service : inService){
            sb.append(service.toString());
        }
        return sb.toString();
    }
}
