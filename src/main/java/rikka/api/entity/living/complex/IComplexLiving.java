package rikka.api.entity.living.complex;

import rikka.api.entity.living.ILiving;

import java.util.Set;

public interface IComplexLiving extends ILiving {
    Set<? extends ComplexLivingPart> getParts();
}
