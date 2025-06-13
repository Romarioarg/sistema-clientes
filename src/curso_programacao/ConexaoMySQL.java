package curso_programacao;

/**
 * Stub de conexão: exibe que o sistema está preparado para usar MySQL.
 * (Quando você quiser realmente conectar, basta implementar o método
 * getConnection() com JDBC.)
 */
public final class ConexaoMySQL {

    /*------------------------------------------------------------
     *  Configurações (placeholders) – NÃO contém senha real
     *-----------------------------------------------------------*/
    private static final String URL      = "jdbc:mysql://<host>:3306/<database>";
    private static final String USER     = "<usuario>";
    private static final String PASSWORD = "<senha>";

    // Impede criação de instâncias
    private ConexaoMySQL() {}

    /*------------------------------------------------------------
     *  Apenas imprime o status de preparo
     *-----------------------------------------------------------*/
    public static void exibirStatus() {
        System.out.println(" Configuracoes carregadas. Pronto para conectar ao MySQL.");
        System.out.println("   URL configurada : " + URL);
        System.out.println("   Usuario         : " + USER);
        // Senha propositalmente não exibida
    }

    /*------------------------------------------------------------
     *  Método principal de teste
     *-----------------------------------------------------------*/
    public static void main(String[] args) {
        exibirStatus();
    }
}
