package rikka.api.command;

import org.spongepowered.api.text.Text;
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

    public boolean execute(ICommandSender sender, ArrayList<String> args) {
        if (args.isEmpty()) return false;
        IICommand sub = subs.get(args.remove(0));
        if (sub == null) return false;
        if (sub.canRun(sender)) {
            if (sender instanceof IPlayer) {
                return sub.execute((IPlayer) sender, args);
            } else if (onlyPlayer) {
                sendChat(sender, "only player");
            } else {
                return sub.execute(sender, args);
            }
        } else sendChat(sender, "no permission " + sub.perm);
        return false;
    }

    public boolean execute(IPlayer player, ArrayList<String> args) {
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

    public void sendChat(ICommandSender sender, String format, Object... args) {
        sender.sendMessage(Text.of(String.format(format, args)));
    }

}
