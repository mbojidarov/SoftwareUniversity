package viceCity.models.neighbourhood;

import viceCity.models.players.Player;

import java.util.ArrayList;
import java.util.Collection;

public class GangNeighbourhood implements Neighbourhood{
private Player mainPlayer;
private Collection<Player> civilPlayers;

    public GangNeighbourhood(Player mainPlayer, Collection<Player> civilPlayers) {
        this.mainPlayer = mainPlayer;
        this.civilPlayers = new ArrayList<>();
    }

    @Override
    public void action(Player mainPlayer, Collection<Player> civilPlayers) {

    }
}
