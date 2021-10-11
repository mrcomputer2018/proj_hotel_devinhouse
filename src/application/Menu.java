package application;

import java.util.Scanner;

public class Menu {
    private String opcao;

    private Scanner entradaCaracter = new Scanner(System.in);

    // Metodos
    public void iniciar() {
        String opcao = mostrarMenu();

        while(!opcao.equals("4")){
            switch (opcao) {
                case "1":
                    opcao = mostrarMenuReservas();
                    break;
                case "2":
                    opcao = mostrarMenuHospedes();
                    break;
                case "3":
                    opcao = mostrarMenuQuartos();
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    opcao = mostrarMenu();
            }
        }
        System.out.println("Inicio");
    }

    private String mostrarMenu() {
        StringBuilder sb = new StringBuilder();

        sb.append("========================\n");
        sb.append("    HOTEL DEVinHOUSE    \n");
        sb.append("========================\n");
        sb.append("Digite comando desejado: \n");
        sb.append("\t1. Reservas. \n");
        sb.append("\t2. Hospedes.  \n");
        sb.append("\t3. Quartos. \n");
        sb.append("\t4. Sair do Sistema.");

        // Convertendo a classe stringbuilder para string
        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }

    private String mostrarMenuReservas() {
        StringBuilder sb = new StringBuilder();

        sb.append("===================\n");
        sb.append("       RESERVAS      \n");
        sb.append("===================\n");
        sb.append("Digite comando desejado: \n");
        sb.append("\t1. Ver reservas. \n");
        sb.append("\t2. Adicionar item a reservas.  \n");
        sb.append("\t3. Remover item da reservas. \n");
        sb.append("\t4. Limpar reservas. \n");
        sb.append("\t5. Sair de Reservas.");

        // Convertendo a classe stringbuilder para string
        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }

    private String mostrarMenuHospedes() {
        StringBuilder sb = new StringBuilder();

        sb.append("===================\n");
        sb.append("      HOSPEDES     \n");
        sb.append("===================\n");
        sb.append("Digite comando desejado: \n");
        sb.append("\t1. Ver hospedes. \n");
        sb.append("\t2. Adicionar item a hospedes.  \n");
        sb.append("\t3. Remover item de hospedes. \n");
        sb.append("\t4. Limpar hospedes. \n");
        sb.append("\t5. Sair de hospedes.");

        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }

    private String mostrarMenuQuartos() {
        StringBuilder sb = new StringBuilder();

        sb.append("===================\n");
        sb.append("       QUART0S     \n");
        sb.append("===================\n");
        sb.append("Digite comando desejado: \n");
        sb.append("\t1. Ver quartos. \n");
        sb.append("\t2. Adicionar item a quartos.  \n");
        sb.append("\t3. Remover item de quartos. \n");
        sb.append("\t4. Limpar quartos. \n");
        sb.append("\t5. Sair de quartos.");

        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }
}
