package viceCity.core;

import viceCity.core.interfaces.Controller;
import viceCity.models.guns.BaseGun;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.neighbourhood.GangNeighbourhood;
import viceCity.models.players.BasePlayer;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;
import viceCity.repositories.GunRepository;

import java.util.ArrayList;
import java.util.Collection;

import static viceCity.common.ConstantMessages.*;

public class ControllerImpl implements Controller {
private GunRepository gunsRepository;
private Collection<Player> civilPlayers;
private BasePlayer player;
private BaseGun baseGun;

private GangNeighbourhood gangNeighbourhood;

    public ControllerImpl() {
        this.gunsRepository = new GunRepository();
        this.civilPlayers = new ArrayList<>();
        this.player = new MainPlayer();
        this.gangNeighbourhood = new GangNeighbourhood(player, civilPlayers);
    }

    @Override
    public String addPlayer(String name) {
        Player civil = new CivilPlayer(name);
        civilPlayers.add(civil);

        return String.format(PLAYER_ADDED, name);
    }

    @Override
    public String addGun(String type, String name) {
        Gun gun;
        if ("Pistol".equals(type)){
            gun = new Pistol(name);
            gunsRepository.add(gun);
        }else if ("Rifle".equals(type)){
            gun = new Rifle(name);
            gunsRepository.add(gun);
        }else{
            return GUN_TYPE_INVALID;
        }
        return String.format(GUN_ADDED, name, type);
    }

    @Override
    public String addGunToPlayer(String name) {
//        Gun gun = gunsRepository.getModels().stream().findFirst()
        Player civilPlayer = new CivilPlayer(name);

        if (this.gunsRepository.find(name) == null){
            return GUN_QUEUE_IS_EMPTY;
        }

        if ("Vercetti".equals(name)){
            player = new MainPlayer();
            addGunToPlayer(name);
            return String.format(GUN_ADDED_TO_MAIN_PLAYER, "Pistol", name);
                                                            //todo
        }else{
            if (!civilPlayer.getName().equals(name)){

                return CIVIL_PLAYER_DOES_NOT_EXIST;
            }else {
                return String.format(GUN_ADDED_TO_CIVIL_PLAYER, "Pistol", civilPlayer.getName());
            }
        }

    }

    @Override
    public String fight() {
        return null;
    }
}
