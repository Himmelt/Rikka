package rikka.api.text.action;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.item.inventory.ItemStackSnapshot;
import rikka.api.text.Text;
import rikka.api.util.RIdentifiable;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;

public abstract class HoverAction<R> extends TextAction<R> {

    HoverAction(R result) {
        super(result);
    }

    public void applyTo(Text.Builder builder) {
        builder.onHover(this);
    }

    public static final class ShowText extends HoverAction<Text> {
        ShowText(Text text) {
            super(text);
        }
    }

    public static final class ShowItem extends HoverAction<ItemStackSnapshot> {
        ShowItem(ItemStackSnapshot item) {
            super(item);
        }
    }

    public static final class ShowEntity extends HoverAction<ShowEntity.Ref> {
        ShowEntity(Ref ref) {
            super(ref);
        }

        public static final class Ref implements RIdentifiable {

            private final UUID uuid;
            private final String name;
            private final Optional<EntityType> type;

            public Ref(UUID uuid, String name, @Nullable EntityType type) {
                this(uuid, name, Optional.ofNullable(type));
            }

            public Ref(UUID uuid, String name) {
                this(uuid, name, Optional.empty());
            }

            public Ref(IEntity entity, String name) {
                this(entity.getUUID(), name, entity.getType());
            }

            protected Ref(UUID uuid, String name, Optional<EntityType> type) {
                this.uuid = uuid;
                this.name = name;
                this.type = type;
            }

            public UUID getUUID() {
                return this.uuid;
            }

            public String getName() {
                return this.name;
            }

            public Optional<EntityType> getType() {
                return this.type;
            }

            @Override
            public boolean equals(Object obj) {
                if (super.equals(obj)) {
                    return true;
                }

                if (!(obj instanceof Ref)) {
                    return false;
                }

                Ref that = (Ref) obj;
                return this.uuid.equals(that.uuid)
                        && this.name.equals(that.name)
                        && this.type.equals(that.type);
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(this.uuid, this.name, this.type);
            }

            @Override
            public String toString() {
                return MoreObjects.toStringHelper(this)
                        .add("uuid", this.uuid)
                        .add("name", this.name)
                        .add("type", this.type)
                        .toString();
            }

        }
    }

}
