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
    }
    else {
      return false;
    }
  }
}
class MilitarExercito extends Militar {
  private boolean particGuerra;
  private boolean vencGuerra;

  public MilitarExercito(boolean particGuerra, boolean vencGuerra,String patente,int matricula){
    super(patente, matricula);
    this.particGuerra = particGuerra;
    this.vencGuerra = vencGuerra;
  }
  public boolean podeProgredir(){
    if (particGuerra == true && vencGuerra == true){
      return true; 
    }
    else {
      return false;
    }
  }
}
class MilitarMarinha extends Militar {
  private boolean conserAviao;

  public MilitarMarinha(boolean conserAviao, String patente, int matricula){
    super(patente, matricula);
    this.conserAviao = conserAviao;
  }
  public boolean podeProgredir(){
    if (conserAviao == true){
      return true; 
    }
    else {
      return false;
    }
  }
}


