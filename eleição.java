public class Candidato{
  private String nome;
  private String partido;
  private int num_votos;

public Candidato(String nome, String partido, int num_votos){
  this.nome = nome;
  this.partido = partido;
  this.num_votos = 0;
}
public String getnome(){
  return nome;
}
public String getpartido(){
  return partido;
}
public int adic_votos(){
  return num_votos += 1;
}

}
public class Urna {    
  private Candidato candidato_1;
  private Candidato candidato_2;
  private int tVotos;
  private int vNulosBrancos;   
public Urna(Candidato candidato_1, Candidato  candidato_2){
this.candidato_1 = candidato_1;
this.candidato_2 = candidato_2;
this.tVotos = 0;
this.vNulosBrancos = 0;
}
public void votar(int voto){
  tVotos += 1;
    if (voto ==1){
      candidato_1.adic_votos();
    }
    else if (voto ==2){
      candidato_2.adic_votos();
    }
    else if (voto ==3){
      vNulosBrancos +=1;
    }
    else {
      System.out.println("voto inválido");
    }

}
