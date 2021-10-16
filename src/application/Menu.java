package application;

import java.util.Scanner;

public class Menu {
    // Atributos
    private String opcao;
    private String opcaoReservas;
    private String opcaoHospedes;
    private String opcaoQuartos;

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
                    // System.out.println("Opcao invalida - menu!!!");
                    opcao = mostrarMenu();
            }
        }
        System.out.println("Sistema Finalizado!!!");
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

        // Convertendo a classe string builder para string
        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }

    // Reservas
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

        // Convertendo a classe string builder para string
        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }

    private void iniciarMenuReservas() {
        opcaoReservas = mostrarMenuReservas();

        while(!opcaoReservas.equals("5")){
            switch (opcaoReservas) {
                case "1":
                    System.out.println("Ver reservas");
                    opcaoReservas = mostrarMenuReservas();
                    break;

                case "2":
                    System.out.println("Adicionar item a reservas");
                    opcaoReservas = mostrarMenuReservas();
                    break;
                case "3":
                    System.out.println("Remover item da reservas");
                    opcaoReservas = mostrarMenuReservas();
                    break;
                case "4":
                    System.out.println(" Limpar reservas.");
                    opcaoReservas = mostrarMenuReservas();
                    break;
                default:
                    System.out.println("Opcao invalida - reservas!!!");
                    opcaoReservas = mostrarMenuReservas();
            }
        }
    }

    // Hospedes
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

    private void iniciarMenuHospedes() {
        opcaoHospedes = mostrarMenuHospedes();

        while (!opcaoHospedes.equals("5")) {
            switch (opcaoHospedes) {
                case "1":
                    System.out.println("Ver reservas");
                    opcaoHospedes = mostrarMenuHospedes();
                    break;

                case "2":
                    System.out.println("Adicionar item a reservas");
                    opcaoHospedes = mostrarMenuHospedes();
                    break;
                case "3":
                    System.out.println("Remover item da reservas");
                    opcaoHospedes = mostrarMenuHospedes();
                    break;
                case "4":
                    System.out.println(" Limpar reservas.");
                    opcaoHospedes = mostrarMenuHospedes();
                    break;
                default:
                    System.out.println("Opcao invalida - reservas!!!");
                    opcaoHospedes = mostrarMenuHospedes();
            }
        }
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

    // Quartos
    private void iniciarMenuQuartos() {
        opcaoQuartos = mostrarMenuQuartos();

        while (!opcaoQuartos.equals("5")) {
            switch (opcaoQuartos) {
                case "1":
                    System.out.println("Ver reservas");
                    opcaoQuartos = mostrarMenuQuartos();
                    break;

                case "2":
                    System.out.println("Adicionar item a reservas");
                    opcaoQuartos = mostrarMenuQuartos();
                    break;
                case "3":
                    System.out.println("Remover item da reservas");
                    opcaoQuartos = mostrarMenuQuartos();
                    break;
                case "4":
                    System.out.println(" Limpar reservas.");
                    opcaoQuartos = mostrarMenuQuartos();
                    break;
                default:
                    System.out.println("Opcao invalida - reservas!!!");
                    opcaoQuartos = mostrarMenuQuartos();
            }
        }
    }
}
