package application;

import java.util.Scanner;

public class Menu {
    private String opcao;

    private Scanner entradaCaracter = new Scanner(System.in);

    // Metodos
    public void iniciar() {
        String opcao = mostrarMenu();
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

    private String mostrarMenuReserva() {
        StringBuilder sb = new StringBuilder();

        sb.append("===================\n");
        sb.append("       RESERVAS      \n");
        sb.append("===================\n");
        sb.append("Digite comando desejado: \n");
        sb.append("\t1. Ver lista. \n");
        sb.append("\t2. Adicionar item a lista.  \n");
        sb.append("\t3. Remover item da lista. \n");
        sb.append("\t4. Limpar lista. \n");
        sb.append("\t5. Sair de Reserva.");

        // Convertendo a classe stringbuilder para string
        System.out.println(sb.toString());

        return entradaCaracter.nextLine();
    }
}
