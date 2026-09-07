public class colaborador {
        protected int matricula;
        protected String nome;
        protected double salarioBase;

    public colaborador(int matricula, String nome, double salarioBase)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal()
    {
        return salarioBase;
    }

    public void exibirDados()
        {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Salário Base: R$ " + salarioBase);
            System.out.println("Salário Final: R$ " + calcularSalarioFinal());
        }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

}
