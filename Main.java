import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int id = 0;
        int escolha = 0;
        pessoa[] pessoa = new pessoa[10];

        while(op != 5){
            
            System.out.println("Digite uma opção: \n1 - Cadastrar uma nova pessoa\n2 -  Editar dados de uma pessoa cadastrada\n3 - Apresentar dados de uma pessoa cadastrada\n4 - Excluir dados de uma pessoa cadastrada\n5 - Sair");
            op = scanner.nextInt();

            switch (op){
                case 1:

                if(id == 10){
                    System.out.println("Quantidade máxima de usuários cadastrados atingida (eu só não sei criar array infinito em java)");
                }else{
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();

                    System.out.println("Digite o email da pessoa: ");
                    String email = scanner.nextLine();
                    
                    id = id + 1;

                    pessoa[id-1] = new pessoa(nome, idade, email);

                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;
                } 

                case 2:
                    for(int i = 0;i < id; i++){
                        System.out.println(i+1 + " - " + pessoa[i].getnome() + "\n");
                    }

                    System.out.println("Digite o número de usuário que você deseja alterar as informações: ");
                    escolha = scanner.nextInt();

                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();

                    System.out.println("Digite o email da pessoa: ");
                    String email = scanner.nextLine();

                    pessoa[escolha-1] = new pessoa(nome, idade, email);
                    break;

                case 3:
                    for(int i = 0;i < id; i++){
                        System.out.println(i+1 + " - " + pessoa[i].getnome() + "\n");
                    }

                    System.out.println("Digite o número de usuário que você deseja visualizar as informações: ");
                    escolha = scanner.nextInt();

                    System.out.println("nome do usuário: " + pessoa[escolha-1].getnome());
                    System.out.println("idade do usuário: " + pessoa[escolha-1].getidade());
                    System.out.println("email do usuário: " + pessoa[escolha-1].getemail());

                    break;

                case 4:
                    for(int i = 0;i < id; i++){
                        System.out.println(i+1 + " - " + pessoa[i].getnome() + "\n");
                    }

                    System.out.println("Digite o número de usuário que você deseja apagar as informações: ");
                    escolha = scanner.nextInt();

                    pessoa[escolha-1] = null;

                    for(int i = escolha-1;i < id; i++){
                        pessoa[i] = pessoa[i+1];
                    }

                    //continuar pessoa[id-1] ;


                    System.out.println("Usuário excluído com sucesso (eu acho)");

                    break;

                case 5:
                    System.out.println("Você escolheu sair. Tenha um ótimo dia");
                    break;

                default:
                System.out.println("Isso não é uma opção, cuzão");
            }

        }


        scanner.close();
    }
}

    
