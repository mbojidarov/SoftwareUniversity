package robotService.models.procedures;

import robotService.models.procedures.interfaces.Procedure;
import robotService.models.robots.interfaces.Robot;

import java.util.ArrayList;
import java.util.Collection;

import static robotService.common.ExceptionMessages.INSUFFICIENT_PROCEDURE_TIME;

public abstract class BaseProcedure implements Procedure {
    private Collection<Robot> robots;

    protected BaseProcedure() {
        this.robots = new ArrayList<>();
    }

    @Override
    public String history() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        this.robots.forEach(rob -> sb.append(String.format(" Robot type: %s - %s - Happiness: %d - Energy: %d",
                rob.getClass().getSimpleName(), rob.getName(), rob.getHappiness(), rob.getEnergy()))
                .append(System.lineSeparator()));

        return sb.toString().trim();
    }

    @Override
    public void doService(Robot robot, int procedureTime) {
    if (robot.getProcedureTime() < procedureTime){
        throw new IllegalArgumentException(INSUFFICIENT_PROCEDURE_TIME);
    }
    robot.setProcedureTime(robot.getProcedureTime() - procedureTime);
    robots.add(robot);
    }
}
