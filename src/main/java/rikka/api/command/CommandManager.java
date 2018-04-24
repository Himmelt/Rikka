package rikka.api.command;

import rikka.api.command.dispatcher.Dispatcher;
import rikka.api.plugin.PluginContainer;
import rikka.api.world.Location;
import rikka.api.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public interface CommandManager extends Dispatcher {

    Optional<CommandMapping> register(Object plugin, CommandCallable callable, String... alias);

    Optional<CommandMapping> register(Object plugin, CommandCallable callable, List<String> aliases);

    Optional<CommandMapping> register(Object plugin, CommandCallable callable, List<String> aliases, Function<List<String>, List<String>> callback);

    Optional<CommandMapping> removeMapping(CommandMapping mapping);

    Set<PluginContainer> getPluginContainers();

    Set<CommandMapping> getOwnedBy(Object instance);

    Optional<PluginContainer> getOwner(CommandMapping mapping);

    int size();

    @Override
    boolean process(ICommandSender source, String arguments);

    @Override
    List<String> getSuggestions(ICommandSender source, String arguments, @Nullable Location<World> location);
}
