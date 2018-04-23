package org.soraworld.rikka.entity;

import org.soraworld.rikka.CatalogType;
import org.soraworld.rikka.text.translation.Translatable;
import org.soraworld.rikka.util.annotation.CatalogedBy;

@CatalogedBy(EntityTypes.class)
public interface EntityType extends CatalogType, Translatable {
    Class<? extends Entity> getEntityClass();
}
