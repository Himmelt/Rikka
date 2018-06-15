package rikka.api.service.permission;

public interface Permissible {
    /*
     * null -> true
     * empty -> false
     * */
    boolean hasPermission(String perm);
}
