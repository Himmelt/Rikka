package rikka.api.text.action;

import rikka.api.command.RCommandSender;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.item.inventory.ItemStackSnapshot;
import rikka.api.text.Text;

import javax.annotation.Nullable;
import java.net.URL;
import java.util.UUID;
import java.util.function.Consumer;

public final class TextActions {

    private TextActions() {
    }

    public static ClickAction.OpenUrl openUrl(URL url) {
        return new ClickAction.OpenUrl(url);
    }

    public static ClickAction.RunCommand runCommand(String command) {
        return new ClickAction.RunCommand(command);
    }

    public static ClickAction.ChangePage changePage(int page) {
        return new ClickAction.ChangePage(page);
    }

    public static ClickAction.SuggestCommand suggestCommand(String command) {
        return new ClickAction.SuggestCommand(command);
    }

    public static ClickAction.ExecuteCallback executeCallback(Consumer<RCommandSender> callback) {
        return new ClickAction.ExecuteCallback(callback);
    }

    public static HoverAction.ShowText showText(Text text) {
        return new HoverAction.ShowText(text);
    }

    public static HoverAction.ShowItem showItem(ItemStackSnapshot item) {
        return new HoverAction.ShowItem(item);
    }

    public static HoverAction.ShowEntity showEntity(HoverAction.ShowEntity.Ref entity) {
        return new HoverAction.ShowEntity(entity);
    }

    public static HoverAction.ShowEntity showEntity(UUID uuid, String name, @Nullable EntityType type) {
        return showEntity(new HoverAction.ShowEntity.Ref(uuid, name, type));
    }

    public static HoverAction.ShowEntity showEntity(UUID uuid, String name) {
        return showEntity(new HoverAction.ShowEntity.Ref(uuid, name));
    }

    public static HoverAction.ShowEntity showEntity(IEntity entity, String name) {
        return showEntity(new HoverAction.ShowEntity.Ref(entity, name));
    }

    public static ShiftClickAction.InsertText insertText(String text) {
        return new ShiftClickAction.InsertText(text);
    }

}
