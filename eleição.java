import java.util.Scanner;

class Candidato{
  private String nome;
  private String partido;
  private int num_votos;

public Candidato(String nome, String partido){
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
public int getqtdvotos(){
  return num_votos;
}
public int adic_votos(){
  return num_votos ++;
}

}
class Urna {    
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
  tVotos ++ ;
    if (voto ==1){
      candidato_1.adic_votos();
    }
    else if (voto ==2){
      candidato_2.adic_votos();
    }
    else if (voto ==3){
      vNulosBrancos ++;
    }
    else {
      System.out.println("voto inválido");
    }
}
public void exibirTotalVotosNulosBrancos(){
  System.out.println("Total de votos Brancos/Nulos " + vNulosBrancos);
  }
        
public void exibirTotalGeralVotos(){
  System.out.println("Total de votos " + tVotos);
}      
public void  exibirTotalCandidato1(){
  System.out.println("Total de votos do Candidato 1: " + candidato_1);
}
public void exibirTotalCandidato2(){
  System.out.println("Total de votos do Candidato 2: " + candidato_2);
}
public void exibircandidatovencedor(){
  if (candidato_1.getqtdvotos() > candidato_2.getqtdvotos()){
    System.out.println("candidatovencedor: ");
    System.out.println(candidato_1.getnome());
    System.out.println(candidato_1.getpartido());
    System.out.println("total de votos foi: ");
    System.out.println(candidato_1.getqtdvotos());
  }  else if(candidato_2.getqtdvotos() > candidato_1.getqtdvotos()){
    System.out.println("candidatovencedor: ");
    System.out.println(candidato_2.getnome());
    System.out.println(candidato_2.getpartido());
    System.out.println("total de votos foi: ");
    System.out.println(candidato_2.getqtdvotos());
    }
  else {
    System.out.println("Empatou");
  }

}
}
public class Main{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    Candidato candidato1 = new Candidato("Barros" , "Caianense" );
    Candidato candidato2 = new Candidato("Otacilio" , "Pessoano" );
    Urna u = new Urna(candidato1 , candidato2);
    int vot = -1;
    while (vot != 0){
      System.out.println("Vote: ");
      vot = teclado.nextInt();
      if (vot != 0){
         u.votar(vot);
      }
       
    }
  }

}

   
            
