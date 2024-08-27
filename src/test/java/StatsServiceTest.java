import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void minsales() {
        StatsService service = new StatsService();

        int[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(minMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void calculateSumSales() {
        StatsService service = new StatsService();

        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.calculateSumSales(sumSales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void maxsales() {
        StatsService service = new StatsService();

        int[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 6;
        int actualMonth = service.maxSales(maxMonth);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();

        int[] averageAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageAmount(averageAmount);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void belowAverageAmount() {
        StatsService service = new StatsService();

        int[] counter = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCounter = 11;
        int actualCounter = service.belowAverageAmount(counter);

        Assertions.assertEquals(expectedCounter, actualCounter);
    }

    @Test
    public void aboveAverageAmount() {
        StatsService service = new StatsService();

        int[] counter = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCounter = 12;
        int actualCounter = service.aboveAverageAmount(counter);

        Assertions.assertEquals(expectedCounter, actualCounter);
    }

}


