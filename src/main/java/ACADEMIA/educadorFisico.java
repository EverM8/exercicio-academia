package ACADEMIA;

public class educadorFisico extends Pessoa{
    private double salario;
    private String esporteEnsinado;

    public educadorFisico(String nome, String sobrenome, double salario, String esporteEnsinado){
        super(nome, sobrenome);
        this.salario=salario;
        this.esporteEnsinado=esporteEnsinado;
    }

    @Override
    public void seApresentar(){
        System.out.println("Olá me chamo "+this.getNome()+" "+this.getSobrenome()+" e dou aula de "+this.getEsporteEnsinado()+"!");
    }

    public void ensinando(){
        if(esporteEnsinado.equals("Futebol")||esporteEnsinado.equals("Tênis")||esporteEnsinado.equals("Basquete")){
            System.out.println("Estou ensinando " + this.getEsporteEnsinado()+"!");
        }else{
            System.out.println("Ensinamos somente futebol, tênis e basquete");
        }
    }

    public void aumentoSalario(double salario1){
        if (salario>=15000.00){
            System.out.println("Você está pedindo muito!");
        }else {
            setSalario(salario1);
            System.out.println("Seu novo salário é de "+salario1+"R$!");
        }
    }


    @Override
    public void contusao(){
        System.out.println("O professor "+this.getNome()+" se machucou ensinando! ");
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEsporteEnsinado() {
        return esporteEnsinado;
    }

    public void setEsporteEnsinado(String esporteEnsinado) {
        this.esporteEnsinado = esporteEnsinado;
    }


}
