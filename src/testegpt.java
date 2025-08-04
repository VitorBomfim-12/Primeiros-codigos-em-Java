import java.util.Scanner;

public class testegpt {
    
    static int senhaAdmin = 3658;
    static int senhaUsuario = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tentativasMestras = 0;

        while (tentativasMestras < 2) {
            int opcao = mostrarMenu();

            if (opcao == 1) {
                if (!criarSenha()) {
                    tentativasMestras++;
                }
            } else if (opcao == 2) {
                acessarPerfil();
            } else {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado. Falha mestra.");
        scan.close();
    }

    public static int mostrarMenu() {
        System.out.println("Bem-vindo ao sistema!\n1 - Criar senha\n2 - Acessar perfil");
        return scan.nextInt();
    }

    public static boolean criarSenha() {
        int tentativas = 0;

        while (tentativas < 4) {
            System.out.print("Digite a senha do administrador: ");
            int entrada = scan.nextInt();

            if (entrada == senhaAdmin) {
                System.out.print("Digite a nova senha do usuário: ");
                senhaUsuario = scan.nextInt();
                System.out.println("Senha cadastrada com sucesso!\n");
                return true; // sucesso
            } else {
                System.out.println("Senha incorreta.");
                tentativas++;
            }
        }

        System.out.println("Tentativas excedidas. Voltando ao menu.\n");
        return false; // falhou
    }

    public static void acessarPerfil() {
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite a senha do usuário: ");
            int entrada = scan.nextInt();

            if (entrada == senhaUsuario) {
                System.out.println("Usuário acessado com sucesso!\n");
                return;
            } else {
                System.out.println("Senha incorreta.\n");
                tentativas++;
            }
        }

        System.out.println("Número máximo de tentativas. Voltando ao menu.\n");
    }
}
