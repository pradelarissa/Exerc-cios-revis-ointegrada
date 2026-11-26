public class Main {
    static void main() {

        DadosAlunos a1 = new DadosAlunos("22000010", "Luísa", 8.0, 7.5, 9.0);
        DadosAlunos a2 = new DadosAlunos("20000017", "Isadora", 5.0, 6.0, 4.5);
        DadosAlunos a3 = new DadosAlunos("21000133", "Tyson", 9.5, 10.0, 8.0);
        DadosAlunos a4 = new DadosAlunos("24000050", "Larissa", 4.0, 3.0, 5.0);
        DadosAlunos[] alunos = {a1, a2, a3, a4};

        for (DadosAlunos a : alunos) {
            double média = a.media();
            String notafinal = a.notafinal();
        }


    }
}


