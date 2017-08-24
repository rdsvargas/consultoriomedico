/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.InputMismatchException;
import util.Console;

/**
 *
 * @author Roger
 */
public class Menu {

    public static int Principal() {
        int mnuPrincipal = 0;
        System.out.println("");
        System.out.println("1 - Cadastro de Pacientes");
        System.out.println("2 - Cadastro de Medicamentos");
        System.out.println("3 - Sair");
        while (true) {
            mnuPrincipal = Console.scanInt("Selecione uma das opções: ");
            if (mnuPrincipal == 1 || mnuPrincipal == 2 || mnuPrincipal == 3) {
                break;
            }
        }
        return mnuPrincipal;
    }

    public static int Paciente() {
        int mnuPaciente = 0;
        System.out.println("");
        System.out.println("1 - Adicionar novo Paciente");
        System.out.println("2 - Visualizar todos Pacientes");
        System.out.println("3 - Sair");
        while (true) {
            try {
                mnuPaciente = Console.scanInt("Selecione uma das opções: ");
                if (mnuPaciente == 1 || mnuPaciente == 2) {
                    break;
                } else if (mnuPaciente == 3) {
                    mnuPaciente = -1;
                    break;
                } else {
                    System.err.println("Opção inválida");
                }
            } catch (InputMismatchException exc) {
                System.err.println("Opção inválida - " + exc.getMessage());
            }

        }
        return mnuPaciente;
    }

    public static int Medicamento() {
        int mnuMedicamento = 0;
        System.out.println("");
        System.out.println("1 - Adicionar novo Medicamento");
        System.out.println("2 - Visualizar todos Medicamentos");
        System.out.println("3 - Sair");
        while (true) {
            try {
                mnuMedicamento = Console.scanInt("Selecione uma das opções: ");
                if (mnuMedicamento == 1 || mnuMedicamento == 2) {
                    break;
                } else if (mnuMedicamento == 3) {
                    mnuMedicamento = -1;
                    break;
                } else {
                    System.err.println("Opção inválida");
                }
            } catch (InputMismatchException exc) {
                System.err.println("Opção inválida -" + exc.getMessage() );
            }

        }
        return mnuMedicamento;
    }
}
