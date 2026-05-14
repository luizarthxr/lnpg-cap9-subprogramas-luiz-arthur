import java.util.Scanner;

public class ControleAcademicoModularizado {

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public static String verSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void mostrarAluno(String nome, double media, String situacao) {
        System.out.println(nome + " - Média: " + media + " - " + situacao);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2, nome3, nome4, nome5;
        double nota1, nota2, nota3;
        double media1, media2, media3, media4, media5;
        String situacao1, situacao2, situacao3, situacao4, situacao5;

        System.out.println("Digite o nome do aluno 1:");
        nome1 = sc.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = sc.nextDouble();

        media1 = calcularMedia(nota1, nota2, nota3);
        situacao1 = verSituacao(media1);

        sc.nextLine();

        System.out.println("Digite o nome do aluno 2:");
        nome2 = sc.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = sc.nextDouble();

        media2 = calcularMedia(nota1, nota2, nota3);
        situacao2 = verSituacao(media2);

        sc.nextLine();

        System.out.println("Digite o nome do aluno 3:");
        nome3 = sc.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = sc.nextDouble();

        media3 = calcularMedia(nota1, nota2, nota3);
        situacao3 = verSituacao(media3);

        sc.nextLine();

        System.out.println("Digite o nome do aluno 4:");
        nome4 = sc.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = sc.nextDouble();

        media4 = calcularMedia(nota1, nota2, nota3);
        situacao4 = verSituacao(media4);

        sc.nextLine();

        System.out.println("Digite o nome do aluno 5:");
        nome5 = sc.nextLine();

        System.out.println("Digite a nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a nota 3:");
        nota3 = sc.nextDouble();

        media5 = calcularMedia(nota1, nota2, nota3);
        situacao5 = verSituacao(media5);

        System.out.println();
        System.out.println("RELATÓRIO FINAL");

        mostrarAluno(nome1, media1, situacao1);
        mostrarAluno(nome2, media2, situacao2);
        mostrarAluno(nome3, media3, situacao3);
        mostrarAluno(nome4, media4, situacao4);
        mostrarAluno(nome5, media5, situacao5);

        sc.close();
    }
}
