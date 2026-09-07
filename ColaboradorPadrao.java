public class ColaboradorPadrao extends colaborador {

    public ColaboradorPadrao(int matricula, String nome, double salarioBase)
    {
        super(matricula, nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal()
    {
        return salarioBase;
    }
}
