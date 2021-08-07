import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {

        String[] nome = new String[20];
        String[] endereco = new String[20];
        String[] telefone = new String[20];

        for (int i= 0 ;i<20; i++){
            nome[i] = "";
            endereco[i] = "";
            telefone[i] = "";
        }

        String opcao = "";
        String continuar ="";
        int posicao = 0;
        String nomeExcluir = "";

        Scanner entrada = new Scanner(System.in);


        do {
            System.out.println("Escolha a opção: Incluir(1) - Listar(2) - Excluir(3) - Sair(4)");
            opcao = entrada.nextLine();

            switch (opcao){
                case "1":
                    //codigo para incluir
                    do {
                        System.out.print("Digite o nome: ");
                        nome[posicao]= entrada.nextLine();

                        System.out.print("Digite o endereço: ");
                        endereco[posicao]= entrada.nextLine();

                        System.out.print("Digite o telefone: ");
                        telefone[posicao] = entrada.nextLine();

                        System.out.println("deseja continuar o cadastramento?(s/n)");
                        continuar = entrada.nextLine();

                        posicao++;

                    }while (continuar.equals("s"));
                    break;

                case "2":
                    //codigo para listar
                    for (int i= 0; i<20; i++) {
                        if (!nome[i].equals("")) {
                            System.out.println("Nome: " + nome[i] +
                                    " Telefone: " + telefone[i] +
                                    " Endereço: " + endereco[i]);
                        }
                    }
                    break;

                case "3":
                    //codigo para excluir
                    System.out.println("Quem deseja excluir?");
                    nomeExcluir = entrada.nextLine();
                    for (int i= 0; i<20; i++){
                        if(nome[i].equals(nomeExcluir)){
                            nome[i] = "";
                            endereco[i] = "";
                            telefone[i] = "";
                        }
                    }

                    break;

                case "4":
                    //Código para sair
                    System.out.printf("Programa Finalizado.");
                    return;

                default:
                    //opção invalida
                    System.out.println("opção invalida! Tente Novamente.");
                    break;


            }
        } while (!opcao.equals("Sair"));
    }
}
