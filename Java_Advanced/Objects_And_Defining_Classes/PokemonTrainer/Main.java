package PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Trainer> trainerMap = new LinkedHashMap<>();

        Pokemon pokemon;
        Trainer trainer;

        String input = scanner.nextLine();
        while (!"Tournament".equals(input)) {
            String [] parts = input.split("\\s+");
            String trainerName = parts[0];
            String pokemonName = parts[1];
            String element = parts[2];
            int health = Integer.parseInt(parts[3]);

            pokemon = new Pokemon(pokemonName, element, health);
            trainer = new Trainer(trainerName);
            trainer.addPokemon(pokemon);
            if (trainerMap.containsKey(trainerName)){
                trainerMap.get(trainerName).getData().add(pokemon);
                continue;
            }
            trainerMap.putIfAbsent(trainerName, trainer);


            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!"End".equals(command)){
            for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
               if (entry.getValue().getData().contains(command)){
                   trainer.setBadges(1);
               }else{
                   trainer.removeHealth();
                   trainer.removePokemon();
               }
            }


//            if (trainer.pokemonHasElement(command)){
//                trainer.setBadges();
//            }else{
//                trainer.removeHealth();
//                trainer.removePokemon();
//            }
            command = scanner.nextLine();
        }
        trainerMap.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getBadges(), b1.getValue().getBadges()))
                .forEach(trainer1 -> System.out.println(trainer1.getKey() + " " + trainer1.getValue()));
    }
}
