package com.company.factoryMethod;

import com.company.hierarchy.AbstractUnit;

public abstract class ArmyFactory {

    protected abstract AbstractUnit createUnit(UnitType type);

    /**
     * Тут могут быть методы операций по созданию объектов
     * (пример: три метода готовки кофе: перемалывание, готовка, наливаем в кружку),
     * но для данной иерархии они не предусмотрены
     * (на данный момент)
     */
}
