import java.util.Scanner;

public class Hora {
    Scanner scan = new Scanner(System.in);
    
    private int hora;
    private int min;
    private int seg;
    
    
    public void setHor(int h){
        if(h < 0 || h > 24){
            System.out.println("Dado inválido");
        } else {
            this.hora = h;
        }
    }
    
    public void setMin(int m){
        if(m < 0 || m > 60){
            System.out.println("Dado inválido");
        } else {
            this.min = m;
        }
    }
    
    public void setSeg(int s){
        if(s < 0 || s > 60){
            System.out.println("Dado inválido");
        } else {
            this.seg = s;
        }
    }
    
    public void setHor(){
        int x;
        
        do{
            System.out.println("Digite a hora:");
            x = scan.nextInt();
            if(x < 0 || x > 24){
                System.out.println("Dado inválido, digite novamente");
            } else {
                this.hora = x;
            }
            
        }while(x < 0 || x > 24);
    }
    
    public void setMin(){
        int x;
        
        do{
            System.out.println("Digite o minuto:");
            x = scan.nextInt();
            if(x < 0 || x > 60){
                System.out.println("Dado inválido, digite novamente");
            } else {
                this.min = x;
            }
            
        }while(x < 0 || x > 60);
    }
    
    public void setSeg(){
        int x;
        
        do{
            System.out.println("Digite o segundo:");
            x = scan.nextInt();
            if(x < 0 || x > 60){
                System.out.println("Dado inválido, digite novamente");
            } else {
                this.seg = x;
            }
            
        }while(x < 0 || x > 60);
    }
    
    public Hora(){
        boolean ver;
        
        do{
            System.out.println("Digite a hora:");
            this.hora = scan.nextInt();
            System.out.println("Digite o minuto:");
            this.min = scan.nextInt();
            System.out.println("Digite o segundo:");
            this.seg = scan.nextInt();
            if((hora < 0 || hora > 24) || (min < 0 || min > 60) || (seg < 0 || seg > 60)){
                ver = true;
                System.out.println("Dado inválido, digite novamente");
            } else {
                ver = false;
            }
        }while(ver);
    }
    
    public Hora(int h, int m, int s){
        if((hora < 0 || hora > 24) || (min < 0 || min > 60) || (seg < 0 || seg > 60)){
            System.out.println("Dado inválido");
        } else {
            this.hora = h;
            this.min = m;
            this.seg = s;
        }
    }
    
    public int getHor(){
        return this.hora;
    }
    
    public int getMin(){
        return this.hora;
    }
    
    public int getSeg(){
        return this.hora;
    }
    
    public String getHora1(){
        return this.hora + ":" + this.min + ":" + this.seg;
    }
    
    public String getHora2(){
        if(hora < 13){
            return this.hora + ":" + this.min + ":" + this.seg + " AM";
        } else {
            return (this.hora - 12) + ":" + this.min + ":" + this.seg + " PM";
        }
    }
    
    public int getSecundos(){
        return (((this.hora * 60) + this.min) * 60 + this.seg);
    }
}