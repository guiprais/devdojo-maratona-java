package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        count = 0;

        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i += 1) {
            System.out.println("For " + i);
        }
    }
}
