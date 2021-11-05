package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> stockList;

    public Stock(List<Double> stockList) {
        this.stockList = stockList;
    }

    public double maxProfit() {
        double max = 0;

        for (int i = 0; i < stockList.size(); i++) {
            max = checkDailyDifferences(max, i);
        }

        return max;
    }

    public double checkDailyDifferences(double max, int i) {
        for (int j = i + 1; j < stockList.size(); j++) {
            if (max < stockList.get(j) - stockList.get(i)) {
                max = stockList.get(j) - stockList.get(i);
            }
        }
    return max;
    }

}
