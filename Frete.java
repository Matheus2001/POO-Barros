import java.util.ArrayList;
import java.util.List;

abstract class Frete {
    private double distanciaKm, valorPorKm;
 public Frete(double distanciaKm, double valorPorKm){
     this.distanciaKm = distanciaKm;
     this.valorPorKm = valorPorKm;
     }
     
     public String toString(){
      return (" Distancia em Km: ") + distanciaKm + (" Valor Por Km: ") + valorPorKm;
  }
     public double getDistanciaKm(){
         return distanciaKm;
         
     } public double getValorPorKm(){
         return valorPorKm;
         
     }
 public abstract double calcularFrete();
   
}
class fretePadrao extends Frete {
 public fretePadrao(double distanciaKm,double valorPorKm){
     super(distanciaKm, valorPorKm);
     
 }
 public String toString(){
      return super.toString();
 }
 
 public double calcularFrete(){
     return (getDistanciaKm() * getValorPorKm());
     
 }
}
class FreteExpresso extends Frete {
    private int nivelUrgencia;
 public FreteExpresso(double distanciaKm, double valorPorKm, int nivelUrgencia){
     super(distanciaKm, valorPorKm);
     this.nivelUrgencia = nivelUrgencia;
     
 }
  public String toString(){
      return super.toString() + "Nivel de Urgencia" + nivelUrgencia;
 }
 
 public int getNivelUrgencia(){
     return nivelUrgencia;
     
 } public double calcularFrete(){
     return (getDistanciaKm() * getValorPorKm()) + (getNivelUrgencia() * 100);
     
 }
   
}
class FreteSuperExpresso extends FreteExpresso{
    private double valorDoSeguro;
 public FreteSuperExpresso(double distanciaKm, double valorPorKm, int nivelUrgencia, double valorDoSeguro){
     super(distanciaKm, valorPorKm, nivelUrgencia);
     this.valorDoSeguro = valorDoSeguro;
     }
     public String toString(){
      return super.toString() + " Valor do Seguro: " + valorDoSeguro;
 }
     
     public double getValorDoSeguro(){
         return valorDoSeguro;
         
     }
     public double calcularFrete() {
         return (getDistanciaKm() * getValorPorKm()) + (getNivelUrgencia() * 100) + getValorDoSeguro();
        }
   
}
class CadastroFrete {
    private int qtd;
    private List<Frete> frete;
   
    public CadastroFrete(int qtd){
        this.qtd = 0;
        this.frete = new ArrayList<Frete>();
    }
    public boolean addFrete( Frete f){
        this.frete.add(f);
        return true;
    }
    public double calcularFrete(){
        double total = 0;
        for (int i = 0; i < frete.size(); ++i){
            total = total + frete.get(i).calcularFrete(); //polimofismo } }
           
        }
          return total;  
        }
       
    }

public class Main{
    public static void main(String []args){
        CadastroFrete c = new CadastroFrete(10);
        fretePadrao f = new fretePadrao(50.0 , 10.0);
        FreteExpresso E = new FreteExpresso(50.0 , 10.0, 2);
        FreteSuperExpresso SE = new FreteSuperExpresso(50.0 , 10.0, 2, 100 );
        c.addFrete(f);
        c.addFrete(E);
        c.addFrete(f);
        System.out.println(c.calcularFrete());
    }
}
