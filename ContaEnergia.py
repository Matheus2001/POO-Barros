class Cont_nergia {
  private String nome_cliente;
  private double consumo;

public Cont_nergia (String nome_cliente, int consumo){
  this.nome_cliente = nome_cliente;
  this.consumo = consumo;
}
public String getnome_cliente(){
  return nome_cliente;
} 
public void setnome_Cliente(String nome_Cliente){
  this.nome_cliente = nome_Cliente;
}
public double calcularValor(){
  if (consumo <= 50){
    return  10.00;
}
  else if (consumo <= 100){
    return 10.00 + ((consumo-50) * 0.20);
}
  else if (consumo <= 200){
    return 10.00 + (100-50) * 0.20 + (consumo -100) * 0.25;
  }
else{
  return 10.00 + (100-50) * 0.20 + (200-100) * 0.25 + (consumo - 200) * 0.35;
}
}
}
public class Main{
  public static void main(String[] args){
    Cont_nergia c = new Cont_nergia("Italousse", 1500);
    double valor = c.calcularValor();
    System.out.println(valor);
  }
}
