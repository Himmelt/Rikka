package rikka.api.text.chat;

import rikka.api.CatalogType;
import rikka.api.text.translation.RTranslatable;
import rikka.api.util.annotation.CatalogedBy;

@CatalogedBy(ChatVisibilities.class)
public interface ChatVisibility extends CatalogType, RTranslatable {
    boolean isVisible(ChatType chatType);
}
