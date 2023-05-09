package org.example;

public enum PlanetEnum {
    Mercury(1,0,57910,2493,null),
    Venus(2,50000,0,6051,PlanetEnum.Mercury),
    Earth(3,38000,0,6378,PlanetEnum.Venus),
    Mars(4,55760,0,3389,Earth),
    Jupiter(5,550000,0,69911,Mars),
    Saturn(6,1195000,0,58232,Jupiter),
    Uranus(7,1500000,0,25362,Saturn),
    Neptune(8,1800000,0,24622,Uranus);
    private final int countFromSun;
    private final int farFromNeighbor;
    private int farFromSun;
    private final int radius;
    private final PlanetEnum previous;


    PlanetEnum(int countFromSun, int farFromNeighbor, int farFromSun, int radius, PlanetEnum previous) {
        this.countFromSun = countFromSun;
        this.farFromNeighbor = farFromNeighbor;
        if(previous==null){
            this.farFromSun=farFromSun;
        }
        else {
            this.farFromSun = previous.getFarFromSun()+getFarFromNeighbor();
        }
        this.radius = radius;
        this.previous = previous;
    }
    public int getCountFromSun() {
        return countFromSun;
    }

    public int getFarFromNeighbor() {
        return farFromNeighbor;
    }

    public int getFarFromSun() {
        return farFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public PlanetEnum getPrevious() {
        return previous;
    }
}
