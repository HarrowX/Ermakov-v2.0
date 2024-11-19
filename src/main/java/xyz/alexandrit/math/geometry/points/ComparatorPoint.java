package xyz.alexandrit.math.geometry.points;

import xyz.alexandrit.math.exception.DimensionException;

import java.util.Comparator;

public class ComparatorPoint implements Comparator<AbstractPoint<?>> {
    @Override
    public int compare(AbstractPoint o1, AbstractPoint o2) {
        if (!o1.dimension().equals(o2.dimension()))
            throw new DimensionException("");
        for (int i = 0; i < o1.dimension(); i++) {
            if (o1.get(i).doubleValue() > o2.get(i).doubleValue())
                return 1;
            if (o1.get(i).doubleValue() < o2.get(i).doubleValue())
                return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
