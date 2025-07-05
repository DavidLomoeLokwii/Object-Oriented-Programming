package david.greetings;

import java.util.Arrays;
import java.util.Random;

public class AQOprogram {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = random.nextInt(300) + 1;
        }

        System.out.println("AQI Readings for 30 Days:");
        System.out.println(Arrays.toString(aqiReadings));

        Arrays.sort(aqiReadings);
        double median;
        int middle = aqiReadings.length / 2;

        if (aqiReadings.length % 2 == 0) {
    
            median = (aqiReadings[middle - 1] + aqiReadings[middle]) / 2.0;
        } else {
           
            median = aqiReadings[middle];
        }
    }
        }
   