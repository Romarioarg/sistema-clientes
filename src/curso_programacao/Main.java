package curso_programacao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String ARQUIVO = "dados.txt";

    /* --------------------------------------------------------- *
     *  Carrega clientes já gravados em "dados.txt"               *
     * --------------------------------------------------------- */
    public static void carregarClientes(List<Cliente> clientes) {
        File file = new File(ARQUIVO);

        try {
            // cria o arquivo vazio na primeira execução
            if (!file.exists() && file.createNewFile()) {
                System.out.println("Arquivo '" + ARQUIVO + "' criado com sucesso!");
            }

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    if (!linha.startsWith("Cliente: ")) continue;

                    // "Cliente: Fulano, Email: x@y, Telefone: 999"
                    String[] partes          = linha.substring(9).split(", Email: ");
                    if (partes.length < 2) continue;

                    String nome              = partes[0].trim();
                    String[] emailTelefone   = partes[1].split(", Telefone: ");
                    if (emailTelefone.length < 2) continue;

                    String email             = emailTelefone[0].trim();
                    String telefone          = emailTelefone[1].trim();

                    clientes.add(new Cliente(nome, email, telefone));
                }
            }
            System.out.println("Clientes carregados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os clientes: " + e.getMessage());
        }
    }

    /* --------------------------------------------------------- *
     *  Salva um cliente em "dados.txt"                           *
     * --------------------------------------------------------- */
    public static void salvarCliente(String nome, String email, String telefone) {
        try (FileWriter writer = new FileWriter(ARQUIVO, true)) { // append = true
            writer.write(String.format(
                "Cliente: %s, Email: %s, Telefone: %s%n",
                nome, email, telefone));
            System.out.println("Dados do cliente salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados do cliente: " + e.getMessage());
        }
    }

    /* --------------------------------------------------------- *
     *  Ponto de entrada do programa                              *
     * --------------------------------------------------------- */
    public static void main(String[] args) {
        System.out.println(" O sistema de clientes esta pronto para uso!");

        // Exemplo rápido de uso
        List<Cliente> lista = new ArrayList<>();
        carregarClientes(lista);
        salvarCliente("Romario", "romario@email.com", "(11) 90000-0000");
    }
}

