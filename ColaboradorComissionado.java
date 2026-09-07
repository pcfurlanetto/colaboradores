class ColaboradorComissionado extends colaborador {

    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(
            int matricula,
            String nome,
            double salarioBase,
            double valorVendas,
            double percentualComissao) {

        super(matricula, nome, salarioBase);

        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao() {
        return valorVendas * percentualComissao / 100;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularComissao();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor das Vendas: R$ " + valorVendas);
        System.out.println("Percentual de Comissão: " + percentualComissao + "%");
        System.out.println("Comissão: R$ " + calcularComissao());
    }
}
