package rikka.api.entity;

import rikka.api.CatalogType;
import rikka.api.text.translation.Translatable;
import rikka.api.util.annotation.CatalogedBy;

@CatalogedBy(EntityTypes.class)
public interface EntityType extends CatalogType, Translatable {
    Class<? extends IEntity> getEntityClass();
}
