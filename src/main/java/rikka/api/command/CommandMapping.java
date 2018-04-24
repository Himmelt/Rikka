package rikka.api.command;

import java.util.Set;

public interface CommandMapping {
    String getPrimaryAlias();

    Set<String> getAllAliases();

    CommandCallable getCallable();
}
