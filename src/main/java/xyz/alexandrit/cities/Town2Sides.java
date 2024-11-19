package xyz.alexandrit.cities;

import java.util.List;

public class Town2Sides extends Town {
    public Town2Sides(String name) {
        super(name);
    }

    public Town2Sides(String name, List<Road> roads) {
        super(name, roads);
    }

    public Town2Sides(String name, Road... roads) {
        super(name, roads);
    }

    @Override
    public Town putRoad(Town town, int cost) {
        super.putRoad(town, cost);
        boolean flag = false;
        for (var road : town.roads) {
            if (road.to.equals(this)) {
                road.cost = cost;
                flag = true;
                break;
            }
        }
        if (!flag) {
            town.roads.add(new Road(this, cost));
        }
        return this;
    }
}
