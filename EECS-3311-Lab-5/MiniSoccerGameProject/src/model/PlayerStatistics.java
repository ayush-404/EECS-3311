package model;

public class PlayerStatistics {
    private Integer statistics = 0;


    public void setStatistics(Integer newStatistics) {
        statistics = newStatistics;
    }

    public Integer getStatistics() {
        return statistics;
    }

    public String toString() {
        return getStatistics().toString();
    }
}
