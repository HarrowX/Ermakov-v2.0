package xyz.alexandrit.cities;


import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.*;

public class Town {
    @Getter
    String name;
    List<Road> roads = new ArrayList<>();

    public Town(String name) {
        this.name = name;
    }

    public Town(String name, List<Road> roads) {
        this(name);
        this.roads.addAll(roads);
    }

    public Town(String name, Road... roads) {
        this(name, Arrays.stream(roads).toList());
    }

    public Town putRoad(Town town, int cost) {
        if (town == null) throw new IllegalArgumentException();
        for (var road : roads) {
            if (road.to.equals(town)) {
                road.cost = cost;
                return this;
            }
        }
        roads.add(new Road(town, cost));
        return this;
    }
    public List<Road> getRoads() {
        return new ArrayList<>(roads);
    }

    public Town to(int index) {
        if (index < 0 || index >= roads.size()) throw new IllegalArgumentException();
        return roads.get(index).to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town town)) return false;
        if(this.hashCode() != town.hashCode())
            return false;
        if(!this.name.equals(town.name))
            return false;
        Map<Road, Boolean> hash = new HashMap<>();
        Queue<Road> queue = new LinkedList<>(roads);
        while (true) {
            var road = queue.poll();
            if (road == null) break;
            if (!hash.containsKey(road)) {
                hash.put(road, false);
                queue.addAll(road.to.roads);
            }
        }
        Queue<Road> queueOther = new LinkedList<>(town.roads);
        Set<Road> set = new HashSet<>();
        while (true) {
            var road = queueOther.poll();
            if (set.contains(road)) continue;
            if (road == null) break;
            if (!hash.containsKey(road)) {
                return false;
            }
            set.add(road);
            queueOther.addAll(road.to.roads);
            hash.put(road, true);
        }
        return !hash.containsValue(false);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name) + roads.hashCode();
    }

    @Override
    public String toString() {
        return STR."town: \"\{name}\"";
    }
}
