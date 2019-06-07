class Tv{
    private int volume, canal;
    private boolean ligado;
    public Tv(int volume, int canal, boolean ligado){
        this.volume = volume;
        this.canal = canal;
        this.ligado = ligado;
    }
    public int getVolume(){
        return volume;
    }
    public int aumentarVolume(){
        return volume++;
    }
    public int diminuirVolume(){
        return volume--;
    }
    public int getCanal(){
        return canal;
    }
    public void trocarCanal(int canal){
        this.canal = canal;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void ligarTv(){
        this.ligado = true;
    }
    public void desligarTv(){
        this.ligado = false;
    }
}
class Controle{
    private Tv tv;
    
    public Controle(Tv tv){
        this.tv = tv;
        
    }
    public Tv getTv(){
        return tv;
    }
    public int getVolume(){
        return tv.getVolume();
    }
    public void aumentarVolume(){
         tv.aumentarVolume();
    }
    public void diminuirVolume(){
        tv.diminuirVolume();
    }
    public int getCanal(){
       return tv.getCanal();
    }
    public void trocarCanal(){
        tv.trocarCanal(canal);
    }
    public boolean getLigado(){
       return tv.getLigado();
    }
    public void ligarTv(){
        tv.ligarTv();
    }
    public void desligarTv(){
        tv.desligarTv();
    }
}
public class Principal{
    public static void main(String[]args){
        Tv t = new Tv(90,5,true);
        Controle c = new Controle(t);
         System.out.println(c.getTv());
         System.out.println(c.getVolume());
         System.out.println(c.getCanal());
         System.out.println(c.getLigado());
         c.desligarTv();
         c.trocarCanal(5);
         c.aumentarVolume();
         System.out.println(c.getVolume());
         System.out.println(c.getCanal());
         System.out.println(c.getLigado());
         c.desligarTv();
    }
}
