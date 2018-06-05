package rikka.api.command;

import rikka.api.entity.living.IPlayer;

import java.util.*;

public abstract class IICommand {

    private final String perm;
    private final boolean onlyPlayer;

    private final List<String> aliases = new ArrayList<>();
    private final HashMap<String, IICommand> subs = new LinkedHashMap<>();

    public IICommand(String perm, boolean onlyPlayer, String... aliases) {
        this.perm = perm;
        this.onlyPlayer = onlyPlayer;
        this.aliases.addAll(Arrays.asList(aliases));
    }

    public boolean execute(ICommandSender sender, CommandArgs args) {
        if (args.empty()) return false;
        IICommand sub = subs.get(args.first());
        if (sub == null) return false;
        if (sub.canRun(sender)) {
            args.next();
            if (sender instanceof IPlayer) return sub.execute((IPlayer) sender, args);
            if (!onlyPlayer) return sub.execute(sender, args);
            sender.sendMsg("only player");
            return true;
        }
        sender.sendMsg("no permission " + sub.perm);
        return false;
    }

    public boolean execute(IPlayer player, CommandArgs args) {
        return execute((ICommandSender) player, args);
    }

    protected void addSub(IICommand sub) {
        for (String alias : sub.aliases) {
            subs.putIfAbsent(alias, sub);
        }
    }

    private boolean canRun(ICommandSender sender) {
        return perm == null || sender.hasPermission(perm);
    }

    public static List<String> getMatchList(String text, Collection<String> possibles) {
        ArrayList<String> list = new ArrayList<>();
        if (text.isEmpty()) list.addAll(possibles);
        else for (String s : possibles) if (s.startsWith(text)) list.add(s);
        return list;
    }

}
