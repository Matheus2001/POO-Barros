class Funcionario{
    private int codigo;
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private int idade;
    private double salario;
    private int num_dependentes;

public Funcionario (int codigo, String nome, int cpf, String endereco, int telefone, int idade, double salario, int num_dependentes){
    this.codigo = codigo;
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
    this.idade = idade;
    this.salario = salario;
    this.num_dependentes = num_dependentes;
}
public void exibir(){
    System.out.println("<<<<<<<< -Código do funcionário: " + codigo);
    System.out.println("<<<<<<<< -Nome do Funcionário: " + nome);
    System.out.println("<<<<<<<< -CPF: " + cpf);
    System.out.println("<<<<<<<< -Residência do funcionário: " + endereco);
    System.out.println("<<<<<<<< -Telefone celular: " + telefone);
    System.out.println("<<<<<<<< -Sua idade: " + idade);
    System.out.println("<<<<<<<< -Salário recebido: " + salario);
    System.out.println("<<<<<<<< -Dependentes: " + num_dependentes);
}
public void alterarSalario(double salario){
    this.salario = salario;
}
public double calculaSalarioLiquid(int percent){
    return (salario - (salario * 0.11) + (num_dependentes * (salario * percent/100)));
    
}
}
public class Main{
  public static void main(String[] args){
    Funcionario f = new Funcionario(5, "Chucky", 71057422, "Rabo da Lacraia", 88539511, 19, 1800, 3);
    //f.exibir();
   // f.calculaSalarioLiquid(10);
    f.alterarSalario(3000);
    f.exibir();
    //System.out.println(f.calculaSalarioLiquid(10));
    
  }

}
