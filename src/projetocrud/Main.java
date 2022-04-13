package projetocrud;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import projetocrud.model.Aluno;
import projetocrud.model.Pessoa;

/**
 *
 * @author Douglas
 */
public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcao;
        String checaSeForAluno;
        String alteraPessoa;
        String dataCadastro;
        String dataUltimaAlteracao;
        String dataCadastroInicial = "";
        String dataSemAlteracao = "nenhuma";

        do {
            System.out.println("------------------------------------------------");
            System.out.println("Bem vindo ao sistema de cadastro!");
            System.out.println("Digite o número da operação que desejas efetuar: ");
            System.out.println("1 - Cadastrar pessoa ou aluno");
            System.out.println("2 - Mostrar todas as pessoas e alunos");
            System.out.println("3 - Atualizar dados de uma pessoa ou aluno");
            System.out.println("4 - Deletar uma pessoa ou aluno");
            System.out.println("0 - Encerrar o programa");
            System.out.println("------------------------------------------------");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite um número de telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println("Digite uma data de nascimento: ");
                    String dataNascimento = sc.nextLine();

                    LocalDateTime localDateCadastro = LocalDateTime.now();
                    DateTimeFormatter formatterCadastro = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                    String formattedStringCadastro = localDateCadastro.format(formatterCadastro);
                    dataCadastro = formattedStringCadastro;
                    dataCadastroInicial = dataCadastro;
                    dataUltimaAlteracao = dataSemAlteracao;

                    System.out.println("Caso queira criar um aluno, digite a letra S/s: ");
                    checaSeForAluno = sc.nextLine();
                    if (checaSeForAluno.charAt(0) == 'S' || checaSeForAluno.charAt(0) == 's') {
                        System.out.println("Digite uma nota final: ");
                        Double notaFinal = sc.nextDouble();
                        pessoas.add(new Aluno(notaFinal, nome, telefone, dataNascimento, dataCadastro, dataUltimaAlteracao));
                    } else {
                        pessoas.add(new Pessoa(nome, telefone, dataNascimento, dataCadastro, dataUltimaAlteracao));
                    }
                    System.out.println("Cadastro efetuado com sucesso!");
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    pessoas.forEach(p -> {
                        System.out.println(p.toString());
                    });
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("Número de cadastros no sistema:");
                    System.out.println(pessoas.size());
                    break;
                case 3:
                    System.out.println("Digite o nome de uma pessoa ou aluno para alterar");
                    alteraPessoa = sc.nextLine();
                    ListIterator<Pessoa> pli = pessoas.listIterator();
                    while (pli.hasNext()) {
                        Pessoa p = pli.next();
                        if (p.getNome().equals(alteraPessoa)) {
                            System.out.println("Digite um nome: ");
                            nome = sc.nextLine();
                            System.out.println("Digite um número de telefone: ");
                            telefone = sc.nextLine();
                            System.out.println("Digite uma data de nascimento: ");
                            dataNascimento = sc.nextLine();

                            LocalDateTime localDateAlteracao = LocalDateTime.now();
                            DateTimeFormatter formatterAlteracao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                            String formattedStringAlteracao = localDateAlteracao.format(formatterAlteracao);
                            dataUltimaAlteracao = formattedStringAlteracao;
                            dataCadastro = dataCadastroInicial;

                            System.out.println("Caso queira criar um aluno, digite a letra S/s: ");
                            checaSeForAluno = sc.nextLine();
                            if (checaSeForAluno.charAt(0) == 'S' || checaSeForAluno.charAt(0) == 's') {
                                System.out.println("Entre com uma nova nota final");
                                Double notaFinal = sc.nextDouble();
                                pli.set(new Aluno(notaFinal, nome, telefone, dataNascimento, dataCadastro, dataUltimaAlteracao));
                            } else {
                                pli.set(new Pessoa(nome, telefone, dataNascimento, dataCadastro, dataUltimaAlteracao));
                            }
                        }
                    }
                    System.out.println("Pessoa/Aluno atualizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Digite o nome de uma pessoa ou aluno para deletar");
                    alteraPessoa = sc.nextLine();
                    Iterator<Pessoa> i = pessoas.iterator();
                    while (i.hasNext()) {
                        Pessoa p = i.next();
                        if (p.getNome().equals(alteraPessoa)) {
                            i.remove();
                        }
                    }
                    System.out.println("Pessoa/Aluno removido com sucesso!");
                    break;
            }

        } while (opcao != 0);

    }

}
