package rikka.api.service.permission;

import javax.annotation.Nonnull;

public interface Permissible {

    boolean hasPermission(@Nonnull String permission);

}
