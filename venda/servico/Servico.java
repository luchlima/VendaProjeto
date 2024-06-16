package br.com.alura.projeto.venda.servico;

import br.com.alura.projeto.venda.vendavel.Vendavel;


public class Servico implements Vendavel {
        private String nome;
        private double precoPorServico;
        private double precoHora;


    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoPorServico() {
        return precoPorServico;
    }

    public void setPrecoPorServico(double precoPorServico) {
        this.precoPorServico = precoPorServico;
    }

    @Override
    public double calcularPrecoTotal() {
        double valorTotal = precoPorServico - aplicarDesconto();
        return valorTotal;
    }

    @Override
    public double aplicarDesconto() {
        double desconto = precoHora * percentualDesconto();
        return desconto;
    }

    @Override
    public double percentualDesconto() {
        double percentual = 0.10;
        return percentual;
    }
}
