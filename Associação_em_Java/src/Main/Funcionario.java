package Main;

public class Funcionario {

    private String nome;

    private String cpf;

    private double salario;

    private Empresa empresa;

    
    public Funcionario(String nome, String cpf, double salario, Empresa empresa) {

        this.nome = nome;

        this.cpf = cpf;

        this.salario = salario;

        this.empresa = empresa;

    }

    public String getNome() {
        return this.nome;
    }


    public String getcpf() {
        return this.cpf;
    }

  

    public double getSalario() {
        return this.salario;
    }


    public Empresa getEmpresa() {
        return this.empresa;
    }

    

public void setNome(String nome) {
        this.nome = nome;
    }


  public void setcpf(String cpf) {
        this.cpf = cpf;
    }


public void setsalario(double salario) {
        this.salario = salario;
    }


public void setempresa(Empresa empresa) {
        this.empresa = empresa;
    }


}