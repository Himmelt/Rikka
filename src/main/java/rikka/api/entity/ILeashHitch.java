package rikka.api.entity;

import rikka.api.entity.api.Hanging;

public interface ILeashHitch extends IEntity, Hanging {
    IEntity getLeashedEntity();
}
