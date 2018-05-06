package rikka.api.command;

import rikka.api.text.Text;
import rikka.api.world.Location;

import javax.annotation.Nullable;
import java.util.List;

public interface CommandCallable {

    boolean process(RCommandSender source, String arguments);

    List<String> getSuggestions(RCommandSender source, String arguments, @Nullable Location location);

    boolean testPermission(RCommandSender source);

    Text getUsage(RCommandSender source);

}
