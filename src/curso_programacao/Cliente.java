package curso_programacao;

/**
 * Representa um cliente com nome, e-mail e telefone.
 */
public class Cliente {

    private String nome;
    private String email;
    private String telefone;

    /*------------------------------------------------------------
     *  Construtor
     *-----------------------------------------------------------*/
    public Cliente(String nome, String email, String telefone) {
        this.nome     = nome;
        this.email    = email;
        this.telefone = telefone;
    }

    /*------------------------------------------------------------
     *  Getters e Setters
     *-----------------------------------------------------------*/
    public String getNome()               { return nome;     }
    public void   setNome(String nome)    { this.nome = nome; }

    public String getEmail()              { return email;    }
    public void   setEmail(String email)  { this.email = email; }

    public String getTelefone()           { return telefone; }
    public void   setTelefone(String fone){ this.telefone = fone; }

    /*------------------------------------------------------------
     *  Utilitários
     *-----------------------------------------------------------*/
    @Override
    public String toString() {
        return String.format("Cliente[nome=%s, email=%s, telefone=%s]",
                             nome, email, telefone);
    }

    /*------------------------------------------------------------
     *  Método de teste rápido (opcional)
     *-----------------------------------------------------------*/
    public static void main(String[] args) {
        Cliente c = new Cliente("Romario", "romario@email.com", "(11)90000-0000");
        System.out.println(c);
    }
}

