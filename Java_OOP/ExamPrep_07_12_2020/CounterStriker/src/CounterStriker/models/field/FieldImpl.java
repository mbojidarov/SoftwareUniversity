package CounterStriker.models.field;

import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;

import java.util.Collection;
import java.util.stream.Collectors;

public class FieldImpl implements Field{

    @Override
    public String start(Collection<Player> players) {
        Collection<Player> counterTerrorist = players.stream().filter(p -> p instanceof CounterTerrorist).collect(Collectors.toList());
        Collection<Player> terrorist = players.stream().filter(p -> p instanceof Terrorist).collect(Collectors.toList());

        while (counterTerrorist.stream().anyMatch(Player::isAlive)
                && terrorist.stream().anyMatch(Player::isAlive)){

        }
        return "Terrorist win!";
    }
}
