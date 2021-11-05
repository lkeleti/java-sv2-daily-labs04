package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Double> stockList;

    public Stock(List<Double> stockList) {
        this.stockList = stockList;
    }

    public double maxProfit(){
        List<Double> differences = new ArrayList<>();

        double minValue = stockList.get(0);
        double maxValue = stockList.get(0);
        double beforeValue = stockList.get(0);

        for (int i = 1; i < stockList.size(); i++) {
            if (stockList.get(i) > beforeValue) {
                maxValue = stockList.get(i);
            }
            else {
                differences.add(maxValue-minValue);
                minValue = stockList.get(i);
                maxValue = stockList.get(i);
            }
            beforeValue = stockList.get(i);
        }
        differences.add(maxValue-minValue);

        double maxDifference = differences.get(0);

        for (int i = 1; i < differences.size(); i++) {
            if (differences.get(i) > maxDifference){
                maxDifference = differences.get(i);
            }
        }
        return maxDifference;
    }
}
