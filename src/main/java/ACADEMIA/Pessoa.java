package ACADEMIA;

public class Pessoa {
    private static String nome;
    private String sobrenome;

    public Pessoa(String nome,String sobrenome){
        this.nome=nome;
        this.sobrenome=sobrenome;
    }

    public void seApresentar(){
        System.out.println("Olá me chamo "+getNome()+"!");
    }

    public void treinar(){
        System.out.println("Estou trinando!");
    }


    public void contusao(){
        System.out.println("O aluno "+this.nome+" se contudiu durante o treinamento!");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo "+comida+"!");
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
