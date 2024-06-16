package br.com.alura.projeto.venda.teste;

import br.com.alura.projeto.venda.produto.Produto;
import br.com.alura.projeto.venda.servico.Servico;

public class teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPrecoUnidade(5.45);
        produto.setQuantidade(2);
        System.out.println("===============================================================");
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preco por unidade: " + produto.getPrecoUnidade());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Percentual Descontado: " + produto.percentualDesconto() + "%");
        System.out.println("Desconto: " + produto.aplicarDesconto());
        System.out.println("Total: " + produto.calcularPrecoTotal());
        System.out.println("===============================================================");

        Servico servico = new Servico();
        servico.setPrecoPorServico(10);
        servico.setPrecoHora(5);
        servico.setNome("Entrega");
        System.out.println("===============================================================");
        System.out.println("Servico: " + servico.getNome());
        System.out.println("Preco por servico: " + servico.getPrecoPorServico());
        System.out.println("Preco por hora: " + servico.getPrecoHora());
        System.out.println("Percentual Descontado: " + servico.percentualDesconto() + "%");
        System.out.println("Desconto: " + servico.aplicarDesconto());
        System.out.println("Total: " + servico.calcularPrecoTotal());
        System.out.println("===============================================================");

    }
}
