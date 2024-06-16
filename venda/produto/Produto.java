package br.com.alura.projeto.venda.produto;

import br.com.alura.projeto.venda.vendavel.Vendavel;

public class Produto implements Vendavel {
    private double precoUnidade;
    private int quantidade;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoTotal() {
      double valorTotal = quantidade * precoUnidade - aplicarDesconto();
      return valorTotal;
    }


    @Override
    public double aplicarDesconto() {
        double desconto = precoUnidade * percentualDesconto();
        return desconto;
    }

    @Override
    public double percentualDesconto() {
        double percentual = 0.35;
        return percentual;
    }
}