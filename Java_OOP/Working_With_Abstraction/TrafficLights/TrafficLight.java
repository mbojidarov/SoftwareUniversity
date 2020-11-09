package TrafficLights;

public class TrafficLight {
    private Lights light;

    public TrafficLight(Lights light){
        this.light = light;
    }

    public Lights getLight() {
        return this.light;
    }

    public void updateLightColors(){
        switch (light){
            case RED:
                this.light = Lights.GREEN;
                break;
            case GREEN:
                this.light = Lights.YELLOW;
                break;
            case YELLOW:
                this.light = Lights.RED;
        }
    }
}

