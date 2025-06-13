package curso_programacao;

/**
 * Representa um produto com nome, preço e quantidade em estoque.
 */
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    /*------------------------------------------------------------
     *  Construtor
     *-----------------------------------------------------------*/
    public Produto(String nome, double preco, int quantidade) {
        this.nome        = nome;
        this.preco       = preco;
        this.quantidade  = quantidade;
    }

    /*------------------------------------------------------------
     *  Getters e Setters
     *-----------------------------------------------------------*/
    public String  getNome()                    { return nome; }
    public void    setNome(String nome)         { this.nome = nome; }

    public double  getPreco()                   { return preco; }
    public void    setPreco(double preco)       { this.preco = preco; }

    public int     getQuantidade()              { return quantidade; }
    public void    setQuantidade(int quantidade){ this.quantidade = quantidade; }

    /*------------------------------------------------------------
     *  Utilitários
     *-----------------------------------------------------------*/
    @Override
    public String toString() {
        return String.format("Produto[nome=%s, preco=%.2f, qtd=%d]",
                             nome, preco, quantidade);
    }

    /*------------------------------------------------------------
     *  Método de teste rápido 
     *-----------------------------------------------------------*/
    public static void main(String[] args) {
        Produto p = new Produto("Camiseta", 59.90, 30);
        System.out.println(p);
    }
}
