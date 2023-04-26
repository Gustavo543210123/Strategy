public class Main {
    public static void main(String[] args) {
        Disciplina disc1 = new Disciplina(new Aritmetica(),"Gustavo",7,8);
        disc1.CalculaMedia();
        System.out.println("Nome: "+disc1.getNome()+"\r\nMedia: "+disc1.getMedia()+"\r\nSituacao: "+disc1.getSituacao());

        Disciplina disc2 = new Disciplina(new Geometrica(),"Juliana",10,10);
        disc2.CalculaMedia();
        System.out.println("Nome: "+disc2.getNome()+"\r\nMedia: "+disc2.getMedia()+"\r\nSituacao: "+disc2.getSituacao());
    }
}