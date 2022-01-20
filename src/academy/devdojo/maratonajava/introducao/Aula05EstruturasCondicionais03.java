package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 0.097;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.4950;
        double valorImposto;

        if (salarioAnual <= 34712) {
            salarioAnual *= primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            salarioAnual *= segundaFaixa;
        } else {
            salarioAnual *= terceiraFaixa;
        }

        System.out.println(salarioAnual);
    }
}
