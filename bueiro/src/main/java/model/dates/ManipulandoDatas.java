package model.dates;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManipulandoDatas {
    public static LocalDate convertendoDeStringParaLocalDateInexistente(Scanner leitor) throws ParseException {
        System.out.println("Adicione a nova data no formato ''yyyy-MM-dd'':\n");
        String data = leitor.nextLine();
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public static LocalDate convertendoDeStringParaLocalDateExistente(String data) throws ParseException {
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
