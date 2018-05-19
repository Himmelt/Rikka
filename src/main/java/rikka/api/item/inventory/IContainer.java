package rikka.api.item.inventory;

import rikka.api.entity.living.IPlayer;
import rikka.api.item.inventory.type.Interactable;

import java.util.Set;

public interface IContainer extends Interactable {
    Set<IPlayer> getViewers();

    boolean hasViewers();

    void open(IPlayer viewer) throws IllegalArgumentException;

    void close(IPlayer viewer) throws IllegalArgumentException;
}
