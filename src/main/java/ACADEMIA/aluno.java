package ACADEMIA;


public class aluno extends Pessoa{
    private String email;
    private String endereco;

    public aluno(String nome,String sobrenome,String email,String endereco){
        super(nome,sobrenome);
        this.email=email;
        this.endereco=endereco;
    }

    @Override
    public void treinar(){
        System.out.println(this.getNome()+" "+this.getSobrenome()+" está treinando!");
    }

    public void entrou(){
        System.out.println(this.getNome()+" "+this.getSobrenome()+" entrou para academia "+academia.getNome());
    }



}
