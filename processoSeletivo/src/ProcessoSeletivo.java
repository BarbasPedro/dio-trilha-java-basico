import java.util.concurrent.ThreadLocalRandom;
import javax.security.sasl.Sasl;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo:");

        selecaoCandidatos();

    }

    static void selecaoCandidatos () {
        double salarioBase = 2000.00;
        String [] candidatos = {"PEDRO", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        System.out.println("Lista de candidatos:");

        for(String candidato: candidatos) {
            System.out.println(candidato);
        }

        while (candidatosSelecionados < 5  && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];

            double salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado. O salário pretendido foi " + salarioPretendido);

                candidatosSelecionados ++;
            } else {
                System.out.println("xxx: O candidato " + candidato + " não foi selecionado.");
            }
            candidatoAtual ++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
}
