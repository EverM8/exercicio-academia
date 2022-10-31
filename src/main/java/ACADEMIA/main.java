package ACADEMIA;

public class main {
    public static void main(String[] args) {

        academia redbull=new academia("RedBull","Futebol", 3000.0);
        redbull.aumentoMensalidade(3300.0);

        academia open=new academia("Academia Open", "Tênis", 1000.00);
        open.aumentoMensalidade(1100.1);

        academia nba=new academia("Academia NBA", "Basquetebol", 700.00);
        nba.aumentoMensalidade(706.0);


        /*ALUNOS*/

        aluno aluno1=new aluno("Timo","Werner","timo@email.com", "Rua Alemanha");
        aluno1.seApresentar();
        aluno1.treinar();
        aluno1.entrou();
        aluno1.contusao();

        aluno aluno2=new aluno("Rafael", "Nadal", "rafael@email.com", "Rua Espanha");
        aluno2.seApresentar();
        aluno2.treinar();
        aluno2.entrou();
        aluno2.contusao();

        aluno aluno3= new aluno("Lewis", "Hamilton", "lewis@email.com", "Rua Inglaterra");
        aluno3.seApresentar();
        aluno3.treinar();
        aluno3.entrou();
        aluno3.contusao();

        aluno aluno4=new aluno("Steven", "Gerrard", "steven@email.com", "Rua Inglaterra");
        aluno4.seApresentar();
        aluno4.treinar();
        aluno4.entrou();
        aluno4.contusao();

        aluno aluno5=new aluno("Stephen", "Curry", "stephen@email.com", "Rua USA");
        aluno5.seApresentar();
        aluno5.treinar();
        aluno5.entrou();
        aluno5.contusao();

        aluno aluno6= new aluno("Roger", "Federer", "roger@email.com", "Rua Suiça");
        aluno6.seApresentar();
        aluno6.treinar();
        aluno6.entrou();
        aluno6.contusao();


        /*EDUCADORES FISÍCOS*/
        educadorFisico ed1=new educadorFisico("Frank","Lampard", 10000.00,"Futebol");
        ed1.seApresentar();
        ed1.ensinando();
        ed1.aumentoSalario(13000.0);
        System.out.println(ed1.getSalario());
        ed1.contusao();

        educadorFisico ed2=new educadorFisico("Marco", "Rose", 3000.00, "Futebol");
        ed2.seApresentar();
        ed2.ensinando();
        ed2.aumentoSalario(13000.0);
        System.out.println(ed2.getSalario());
        ed2.contusao();

        educadorFisico ed3=new educadorFisico("Jurgen", "Klopp", 1000.00, "Futebol");
        ed3.seApresentar();
        ed3.ensinando();
        ed3.aumentoSalario(13000.0);
        System.out.println(ed3.getSalario());
        ed3.contusao();

        educadorFisico ed4=new educadorFisico("Gustavo", "Kuerten", 4000.00, "Tênis");
        ed4.seApresentar();
        ed4.ensinando();
        ed4.aumentoSalario(13000.0);
        System.out.println(ed4.getSalario());
        ed4.contusao();

        educadorFisico ed5=new educadorFisico("Larry", "Stefanki", 7500.00, "Tênis");
        ed5.seApresentar();
        ed5.ensinando();
        ed5.aumentoSalario(13000.0);
        System.out.println(ed5.getSalario());
        ed5.contusao();

        educadorFisico ed6=new educadorFisico("Steven", "Kerr", 5000.00, "Basquetebol");
        ed6.seApresentar();
        ed6.ensinando();
        ed6.aumentoSalario(13000.0);
        System.out.println(ed6.getSalario());
        ed6.contusao();

        educadorFisico ed7=new educadorFisico("Gustavo", "Conti", 8000.00, "Basquetebol");
        ed7.seApresentar();
        ed7.ensinando();
        ed7.aumentoSalario(13000.0);
        System.out.println(ed7.getSalario());
        ed7.contusao();

    }
}
