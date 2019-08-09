abstract class Militar {
  private String patente;
  private int matricula;
  

  public Militar(String patente, int matricula){
    this.patente = patente;
    this.matricula = matricula;
  }
  public String getpatente(){
    return patente;
  }
  public int getMatricula(){
    return matricula;
  }
  

  public abstract boolean podeProgredir();
}

class MilitarAeronautica extends Militar{
  private double duraPatente;
  private double horaVoo;

  public MilitarAeronautica(double duraPatente, double horaVoo,String patente, int matricula){
    super (patente, matricula);
    this.duraPatente = duraPatente;
    this.horaVoo = horaVoo;
  }
  public boolean podeProgredir(){
    if (duraPatente > 2 && horaVoo > 100){
      return true;
    }else {
      return false;
    }
  }
}
class MilitarExercito
