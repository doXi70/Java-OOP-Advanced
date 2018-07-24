package p09_TrafficLights;

import java.util.List;

public class StateMachine {
    private static List<TraficLights> lights;

    public StateMachine(List<TraficLights> _lights) {
        lights = _lights;
    }

    public void changeLights() {
        for (int i = 0; i < lights.size(); i++) {
            if (lights.get(i).ordinal() == 2) {
                lights.set(i, TraficLights.GREEN);
            } else if (lights.get(i).ordinal() == 1) {
                lights.set(i, TraficLights.RED);
            } else {
                lights.set(i, TraficLights.YELLOW);
            }
        }
    }

    public void printLights() {
        for (TraficLights light : lights) {
            System.out.print(light.name() + " ");
        }
    }
}
