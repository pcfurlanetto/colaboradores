class ColaboradorProducao extends colaborador {
    private int quantidadePecas;
    private double valorPorPeca;

    public ColaboradorProducao(
        int matricula,
        String nome,
        double salarioBase,
        int quantidadePecas,
        double valorPorPeca) {

    super(matricula, nome, salarioBase);

    this.quantidadePecas = quantidadePecas;
    this.valorPorPeca = valorPorPeca;
    }

    public double calcularProdutividade() {
        return quantidadePecas * valorPorPeca;
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        this.quantidadePecas = quantidadePecas;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public void setValorPorPeca(double valorPorPeca) {
        this.valorPorPeca = valorPorPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularProdutividade();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor da Peca: R$ " + valorPorPeca);
        System.out.println("Quantidade de Pecas: R$ " + quantidadePecas);
        System.out.println("Produtividade: R$ " + calcularProdutividade());
    }
}
