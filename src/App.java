import exceptions.DataInvalidaException;
import model.Pessoa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("111.111.111-01",
                "João", LocalDate.of(2000,1,1));
        try {
            pessoa.setNascimento(LocalDate.of(2025,6,5));
        } catch (DataInvalidaException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(pessoa);
    }

    private static void lerArquivo(String file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(
                new FileReader(file)
        );
    }

}
