package ACADEMIA;

public class academia {
    private static String nome;
    private String esporte;
    private double mensalidade;

    public academia(String nome, String esporte, double mensalidade){
        this.nome=nome;
        this.esporte=esporte;
        this.mensalidade=mensalidade;
    };

    public void aumentoMensalidade(double mensalidade1){
        if (mensalidade1<=mensalidade+mensalidade*0.1){
        setMensalidade(mensalidade1);
            System.out.println("Houve um aumento na mensalidade da academia "+this.nome+" agora é de R$"+this.mensalidade);
        }else {
            System.out.println("Esse acrecimo na mensálidade é inviável!");
        }
    }

    public void contratar(){
        System.out.println("Contratamos o educador "+educadorFisico.getNome());
    }

    public static String getNome() {
         return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
