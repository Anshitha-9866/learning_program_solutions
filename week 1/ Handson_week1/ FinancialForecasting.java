public class FinancialForecasting {

    // Recursive method to calculate future value with fixed growth rate
    public static double forecast(double currentValue, double rate, int months) {
        if (months == 0) return currentValue;
        return forecast(currentValue * (1 + rate), rate, months - 1);
    }

    // Optimized version using iteration (avoids stack overflow)
    public static double forecastIterative(double currentValue, double rate, int months) {
        for (int i = 0; i < months; i++) {
            currentValue *= (1 + rate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        double currentSales = 10000;
        double monthlyGrowthRate = 0.10; // 10%
        int months = 6;

        double futureValueRecursive = forecast(currentSales, monthlyGrowthRate, months);
        double futureValueIterative = forecastIterative(currentSales, monthlyGrowthRate, months);

        System.out.println("Forecasted Sales (Recursive): $" + futureValueRecursive);
        System.out.println("Forecasted Sales (Iterative): $" + futureValueIterative);
    }
}
