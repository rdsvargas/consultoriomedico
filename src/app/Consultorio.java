/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import classes.Paciente;
import classes.Medicamento;
import classes.Menu;
import java.util.ArrayList;
import util.Console;

/**
 *
 * @author Roger
 */
public class Consultorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medicamento> medicamentos = new ArrayList<>();

        int mnuPrincipal = 0;
        while (mnuPrincipal != -1) {
            switch (Menu.Principal()) {
                case 1: // Cadastro de Pacientes
                    mnuPrincipal = 1;
                    while (true) {
                        int mnuPaciente = Menu.Paciente();
                        if (mnuPaciente == -1) {
                            break;
                        } else if (mnuPaciente == 1) { // Adicionar Novo Paciente
                            System.out.println("");
                            pacientes.add(new Paciente(Console.scanString("Informe nome do paciente: "),
                                    Console.scanString("Informe a data de nascimento: "),
                                    Console.scanString("Informe o RG: ")));
                        } else if (mnuPaciente == 2) { // Visualizar Todos Paciente
                            if (pacientes.isEmpty()) {

                            } else {
                                System.out.println("");
                                System.out.println(String.format("%-11s", "|RG")
                                        + String.format("%-21s", "|Paciente")
                                        + String.format("%-11s", "|Data Nasc"));
                                pacientes.stream().forEach((paciente) -> {
                                    //System.out.println(paciente.toString());
                                    System.out.println(String.format("|%-10s", paciente.getRg())
                                            + String.format("|%-20s", paciente.getNome())
                                            + String.format("|%-10s", paciente.getDataNascimento()));
                                });
                            }
                        }
                    }
                    break;
                case 2: // Cadastro de Medicamentos
                    mnuPrincipal = 2;
                    while (true) {
                        int mnuMedicamento = Menu.Medicamento();
                        if (mnuMedicamento == -1) {
                            break;
                        } else if (mnuMedicamento == 1) {
                            System.out.println("");
                            medicamentos.add(new Medicamento(Console.scanString("Informe código: "),
                                    Console.scanString("Informe nome: "),
                                    Console.scanString("Informe descrição: ")));
                        } else if (mnuMedicamento == 2) {
                            System.out.println("");
                            medicamentos.stream().forEach((medicamento) -> {
                                System.out.println(medicamento.getCodigo() + " - " + medicamento.getNome() + " - " + medicamento.getDescricao());
                            });
                        }
                    }
                    break;
                case 3:
                    mnuPrincipal = -1;
                    break;
            }
        }
    }
}
