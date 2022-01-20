package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 26;

        if (age < 15) {
            System.out.println("Categoria infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria juvenil");
        }  else {
            System.out.println("Categoria adulto");
        }


    }
}
