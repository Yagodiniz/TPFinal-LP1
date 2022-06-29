public class Teste {
    public static void main(String[] args){
        AmostraTemperatura t1 = new AmostraTemperatura(10, 10, 2010, 10, 10, 10, 10.10f);

        System.out.println("numseq: " + t1.getNumSeq());
        System.out.println("data: " + t1.getData());
        System.out.println("hora: " + t1.getHora());
        System.out.println("valor: " + t1.getValor());

        AmostraTemperatura t2 = new AmostraTemperatura();

        System.out.println("numseq: " + t2.getNumSeq());
        System.out.println("data: " + t2.getData());
        System.out.println("hora: " + t2.getHora());
        System.out.println("valor: " + t2.getValor());

        t1.setData();
        t1.setHora();
        t1.setValor();

        System.out.println("numseq: " + t1.getNumSeq());
        System.out.println("data: " + t1.getData());
        System.out.println("hora: " + t1.getHora());
        System.out.println("valor: " + t1.getValor());
    }
}
