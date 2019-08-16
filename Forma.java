public abstract class Forma {
  public Forma(){
}
  public abstract double calcularArea();{
}
  public abstract double calcularPerimetro();{
}
}
public class Retangulo extends Forma {
  float base;
  private float altura;
  public Retangulo (float base, float altura){
    this.base = base;
    this.altura = altura;
}
public double calcularArea(){
  return (base * altura);
}
  public double calcularPerimetro(){
    return (2 * base) + (2 * altura);
}
}
public class Circulo extends Forma {
  private float raio;
  private float pi = 3.141616f;

  public Circulo (float raio){
    this.raio = raio;
}
  public double calcularArea(){
    return (pi * raio * raio);
}
  public double calcularPerimetro(){
    return (2 * pi * raio);
}
}
 public class Quadrado extends Retangulo {
    public Quadrado (float base, float altura){
    super (base , altura);
}
  public double calcularArea(){
    return (base * base);
}
  public double calcularPerimetro(){
    return (4 * base);
}
}
  public class Principal {
    public static void main (String[] args){
      Retangulo r = new Retangulo(2.0f , 3.0f);
      System.out.println(r.calcularArea());
      System.out.println(r.calcularPerimetro());
      System.out.println(c.calcularArea()); System.out.println(c.calcularPerimetro());
      Quadrado q = new Quadrado(3.0f, 4.0f);
      System.out.println(q.calcularArea());
      System.out.println(q.calcularPerimetro()); .
}
}
