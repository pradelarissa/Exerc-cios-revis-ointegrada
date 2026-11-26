public class DadosAlunos {

    // Atributos
    public String matricula;
    public String nome;
    public double notaProva1;
    public double notaProva2;
    public double notaTrabalho;

    // Construtor
    public DadosAlunos(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }


    // Média ponderada
    public double media() {
        double somaPonderada = (notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2.0);
        double somaPesos = 2.5 + 2.5 + 2.0;
        return somaPonderada / somaPesos;
    }

    // Nota prova final
    public String notafinal () {
        double m = media();
        if (m >= 7.0) {
             System.out.println("Aprovado!");
        }
        else {
            System.out.println("Recuperação");
        }
        return null;
    }
}
