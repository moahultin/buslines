package com.moascode.topbuslines.journey;

import java.util.List;

public class Line {
    public Integer id;
    public Integer name;
    public List<Stop> stops;

    public Line(Integer id, Integer name, List<Stop> stops) {
        this.id = id;
        this.name = name;
        this.stops = stops;
    }
}
