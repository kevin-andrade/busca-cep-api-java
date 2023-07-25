import br.com.buscacep.Address;
import br.com.buscacep.FileGenerator;
import br.com.buscacep.QueryCep;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueryCep queryCep = new QueryCep();

        System.out.println("Digite o seu CEP: ");
        String cep = scanner.nextLine();

        try {
            Address newAddress = queryCep.searchAddress(cep);
            System.out.println(newAddress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}
