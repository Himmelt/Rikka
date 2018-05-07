package rikka.bukkit.server;

public final class NMSVersion {

    public static final boolean v1_7_R4;
    public static final boolean v1_10_R1;
    public static final boolean v1_11_R1;
    public static final boolean v1_12_R1;

    static {
        boolean v1_7_r4 = false, v1_10_r1 = false, v1_11_r1 = false, v1_12_r1 = false;
        try {
            org.bukkit.craftbukkit.v1_7_R4.CraftServer.class.getName();
            net.minecraft.server.v1_7_R4.MinecraftServer.class.getName();
            v1_7_r4 = true;
        } catch (Throwable ignored) {
        }
        try {
            org.bukkit.craftbukkit.v1_10_R1.CraftServer.class.getName();
            net.minecraft.server.v1_10_R1.MinecraftServer.class.getName();
            v1_10_r1 = true;
        } catch (Throwable ignored) {
        }
        try {
            org.bukkit.craftbukkit.v1_11_R1.CraftServer.class.getName();
            net.minecraft.server.v1_11_R1.MinecraftServer.class.getName();
            v1_11_r1 = true;
        } catch (Throwable ignored) {
        }
        try {
            org.bukkit.craftbukkit.v1_12_R1.CraftServer.class.getName();
            net.minecraft.server.v1_12_R1.MinecraftServer.class.getName();
            v1_12_r1 = true;
        } catch (Throwable ignored) {
        }
        v1_7_R4 = v1_7_r4;
        v1_10_R1 = v1_10_r1;
        v1_11_R1 = v1_11_r1;
        v1_12_R1 = v1_12_r1;
    }

}
