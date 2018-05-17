package rikka.api.entity.api;

public interface Explosive {
    default Integer explosionRadius() {
        return 0;
    }

    void detonate();
}
