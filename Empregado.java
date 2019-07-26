abstract class Empregado {
    private String nome, sobrenome, cpf;
    private double vencimento;
    public Empregado (String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.vencimento = vencimento;
    }
    public abstract double vencimento();
}
class Assalariado extends Empregado{
    private double salario;
    public Assalariado (double salario, String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
        this.salario = salario;
}
    public double vencimento(){
        return salario;
}
}
class Comissionado extends Empregado{
    private double totalVenda, taxaComissao;
    public Comissionado (double totalVenda, double taxaComissao, String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
}
    public double vencimento(){
        return (totalVenda * taxaComissao);
}

}

class Horista extends Empregado {
    private double precoHora, horasTrabalhadas;
    public Horista(double precoHora, double horasTrabalhadas, String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
}
    public double vencimento(){
        return (precoHora * horasTrabalhadas);
}
}

public class Principal{
    public static void main (String[]args){
        Assalariado A = new Assalariado (2000.0, "josé", "André", "64685876");
        System.out.println(A.vencimento());
        Comissionado C = new Comissionado(70.0, 50.0, "Marcos", "Antonio", "57858687");
        System.out.println(C.vencimento());
        Horista H = new Horista(100.0 , 20.0, "Italo", "leite", "9875765");
        System.out.println(H.vencimento()); 
    }

}
