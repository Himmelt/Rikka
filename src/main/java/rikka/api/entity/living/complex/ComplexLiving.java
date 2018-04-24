package rikka.api.entity.living.complex;

import rikka.api.entity.living.ILiving;

import java.util.Set;

public interface ComplexLiving extends ILiving {

    Set<? extends ComplexLivingPart> getParts();

}
