package rikka.api.command;

import rikka.api.entity.living.IPlayer;

import java.util.*;

import static rikka.api.command.ExecuteResult.*;

public abstract class IICommand implements ICommand {

    private final String perm;
    private final boolean onlyPlayer;

    private final List<String> aliases = new ArrayList<>();
    private final HashMap<String, IICommand> subs = new LinkedHashMap<>();

    public IICommand(String perm, boolean onlyPlayer, String... aliases) {
        this.perm = perm;
        this.onlyPlayer = onlyPlayer;
        this.aliases.addAll(Arrays.asList(aliases));
    }

    public String getName() {
        return aliases.isEmpty() ? "emptyCmdName" : aliases.get(0);
    }

    public ExecuteResult execute(ICommandSender sender, CommandArgs args) {
        if (args.empty()) return EMPTY_ARGS;
        IICommand sub = subs.get(args.first());
        if (sub == null) return FAILED;
        if (sub.canRun(sender)) {
            args.next();
            if (sender instanceof IPlayer) return sub.execute((IPlayer) sender, args);
            if (!onlyPlayer) return sub.execute(sender, args);
            return ONLY_PLAYER;
        }
        return NO_PERMISSION;
    }

    public List<String> tabCompletions(CommandArgs args) {
        String first = args.first();
        if (args.size() == 1) return getMatchList(first, subs.keySet());
        if (subs.containsKey(first)) {
            args.next();
            return subs.get(first).tabCompletions(args);
        }
        return new ArrayList<>();
    }

    protected void addSub(IICommand sub) {
        for (String alias : sub.aliases) {
            subs.putIfAbsent(alias, sub);
        }
    }

    public boolean canRun(ICommandSender sender) {
        return perm == null || sender.hasPermission(perm);
    }

    public static List<String> getMatchList(String text, Collection<String> possibles) {
        ArrayList<String> list = new ArrayList<>();
        if (text.isEmpty()) list.addAll(possibles);
        else for (String s : possibles) if (s.startsWith(text)) list.add(s);
        return list;
    }

}
