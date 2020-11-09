package JediGalaxy;

public class JediKnight {
    private long totalStarsCollected;

    public JediKnight(){
      this.totalStarsCollected = 0L;
    }

    public long getTotalScore() {
        return totalStarsCollected;
    }

    public void setTotalScore(long totalScore) {
        this.totalStarsCollected = totalScore;
    }

    @Override
    public String toString() {
        return this.totalStarsCollected + "";
    }
}
