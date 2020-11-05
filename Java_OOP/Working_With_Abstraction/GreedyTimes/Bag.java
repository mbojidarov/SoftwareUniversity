package GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private long totalCapacity;
    private long currentCapacity;
    private long totalGold;
    private boolean isGoldAdded;
    private long totalGems;
    private Map<String, Long> gems;
    private long totalCash;
    private Map<String, Long> cash;
//    private Gold gold;
//    private List<Gem>gems;
//    private List<Cash>cash;
//    private long capacity;

    public Bag(long capacity) {
        this.totalCapacity = capacity;
        this.currentCapacity = 0;
        this.totalGold = 0;
        this.isGoldAdded = false;
        this.totalGems = 0;
        this.gems = new LinkedHashMap<>();
        this.totalCash = 0;
        this.cash = new LinkedHashMap<>();
    }
    private boolean hasFreeSpace(long quantity){
        return this.currentCapacity + quantity <= this.totalCapacity;
    }

    public void addCash(String currency, long quantity){
        if (hasFreeSpace(quantity) && this.totalGems >= this.totalCash + quantity){
            // moga da dobavqm Cash
            if (!this.cash.containsKey(currency)){
                this.cash.put(currency, quantity);
            }else{
                this.cash.put(currency, this.cash.get(currency) + quantity);
            }
            this.totalCash += quantity;
            this.currentCapacity += quantity;
        }
    }

    public void addGem(String gem, long quantity){
        if (hasFreeSpace(quantity) && this.totalGems + quantity <= this.totalGold){
            // moga da dobavqm Gems
            if (!this.gems.containsKey(gem)){
                this.gems.put(gem, quantity);
            }else{
                this.gems.put(gem, this.gems.get(gem) + quantity);
            }
            this.totalGems += quantity;
            this.currentCapacity += quantity;
        }
    }
    public void addGold(long quantity){
        if (hasFreeSpace(quantity)){
            // moga da dobavqm Gold
        this.totalGold += quantity;
        this.currentCapacity += quantity;
        this.isGoldAdded = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (isGoldAdded) {
            sb.append("<Gold> $").append(this.totalGold).append(System.lineSeparator());
            sb.append("##Gold - ").append(this.totalGold).append(System.lineSeparator());
        }

        if (gems.size() > 0) {
            sb.append("<Gem> $").append(this.totalGems).append(System.lineSeparator());
            this.gems.entrySet().stream()
                    .sorted((g1, g2) -> {
                        int compareResult = g2.getKey().compareTo(g1.getKey());
                        if (compareResult == 0) {
                            compareResult = g1.getValue().compareTo(g2.getValue());
                        }
                        return compareResult;
                    }).forEach(entry -> {
                sb.append("##").append(entry.getKey()).append(" - ")
                        .append(entry.getValue()).append(System.lineSeparator());
            });
        }

        if (cash.size() > 0) {
            sb.append("<Cash> $").append(this.totalCash).append(System.lineSeparator());
            this.cash.entrySet().stream()
                    .sorted((c1, c2) -> {
                        int compareResult2 = c2.getKey().compareTo(c1.getKey());
                        if (compareResult2 == 0) {
                            compareResult2 = c1.getValue().compareTo(c2.getValue());
                        }
                        return compareResult2;
                    }).forEach(entry -> {
                sb.append("##").append(entry.getKey()).append(" - ")
                        .append(entry.getValue()).append(System.lineSeparator());
            });
        }
        return sb.toString().trim();
    }
}
