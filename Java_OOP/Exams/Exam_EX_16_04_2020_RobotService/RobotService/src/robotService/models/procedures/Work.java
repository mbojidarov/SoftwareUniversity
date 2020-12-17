package robotService.models.procedures;

import robotService.models.robots.interfaces.Robot;

public class Work extends BaseProcedure{

    @Override
    public void doService(Robot robot, int procedureTime) {
        robot.setHappiness(robot.getHappiness() + 12);
        robot.setEnergy(robot.getEnergy() - 6);

        super.doService(robot, procedureTime);
    }
}
