package robotService.models.procedures;

import robotService.models.robots.interfaces.Robot;

import static robotService.common.ExceptionMessages.*;

public class Repair extends BaseProcedure{

    @Override
    public void doService(Robot robot, int procedureTime) {
        if (robot.isRepaired()){
        throw new IllegalArgumentException(String.format(ALREADY_REPAIRED, robot.getName()));
        }
        robot.setHappiness(robot.getHappiness() - 5);
        robot.setRepaired(true);

        super.doService(robot, procedureTime);
    }
}
