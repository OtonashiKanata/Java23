package pl.karolska.homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HospitalStreams {

    public static void main(String[] args) {
        List<String> specializations = Arrays.asList(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra");

        List <String> fixed = specializations.stream()
                .map(spec -> spec.split(":"))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        Predicate<String> prefix = s -> s.equals("Szpital") || s.equals("Przychodnia");
        fixed.removeIf(prefix);


        fixed.forEach(System.out::println);

    }
}