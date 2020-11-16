package FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint,
                  int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("A name should not be empty.");
        this.name = name;
    }

    private void setEndurance(int endurance) {
        validateStats(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validateStats(endurance, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStats(endurance, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStats(endurance, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStats(endurance, "Shooting");
        this.shooting = shooting;
    }

    public String getName() {
        return this.name;
    }

    private void validateStats(int stats, String exceptionPrefix) {
        if (stats < 0 || stats > 100) {
            throw new IllegalArgumentException(exceptionPrefix +
                    " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel() {

        return (endurance + sprint + dribble + passing + shooting) / 5.00;
    }
}
