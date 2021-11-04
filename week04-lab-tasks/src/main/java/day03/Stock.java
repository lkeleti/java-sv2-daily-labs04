package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> stockList;

    public Stock(List<Double> stockList) {
        this.stockList = stockList;
    }

    public double maxProfit() {
        double minValue = stockList.get(0);
        double maxValue = stockList.get(0);

        for (int i = 0; i < stockList.size(); i++) {
            if (stockList.get(i) < minValue) {
                minValue = stockList.get(i);
                maxValue = stockList.get(i); //Csak az ezek utáni nagyobb értékeket veszem figyelembe
            }
            if (stockList.get(i) > maxValue) {
                maxValue = stockList.get(i);
            }
        }

        return maxValue-minValue;
    }

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }
}
