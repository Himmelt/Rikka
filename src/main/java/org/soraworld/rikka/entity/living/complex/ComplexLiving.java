package org.soraworld.rikka.entity.living.complex;

import org.soraworld.rikka.entity.living.Living;

import java.util.Set;

public interface ComplexLiving extends Living {

    Set<? extends ComplexLivingPart> getParts();

}
