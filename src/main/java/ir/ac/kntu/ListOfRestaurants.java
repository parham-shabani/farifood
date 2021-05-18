package ir.ac.kntu;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class ListOfRestaurants {
    private ArrayList<Restaurant> restaurants = new ArrayList<>();

    public ListOfRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public ListOfRestaurants() {
        restaurants();
    }



    private ZonedDateTime zdt;

    //fd means first day
    //sd means second day

    private ZonedDateTime rest1Startfd;
    private ZonedDateTime rest1Startsd;
    private ZonedDateTime rest1Endfd;
    private ZonedDateTime rest1Endsd;

    private ZonedDateTime rest2Startfd;
    private ZonedDateTime rest2Startsd;
    private ZonedDateTime rest2Endfd;
    private ZonedDateTime rest2Endsd;

    private ZonedDateTime rest3Startfd;
    private ZonedDateTime rest3Startsd;
    private ZonedDateTime rest3Endfd;
    private ZonedDateTime rest3Endsd;

    private ZonedDateTime rest4Start;
    private ZonedDateTime rest4End;

    public ListOfRestaurants(ZonedDateTime rest1Startfd, ZonedDateTime rest1Startsd, ZonedDateTime rest1Endfd, ZonedDateTime rest1Endsd,
                             ZonedDateTime rest2Startfd, ZonedDateTime rest2Startsd, ZonedDateTime rest2Endfd, ZonedDateTime rest2Endsd,
                             ZonedDateTime rest3Startfd, ZonedDateTime rest3Startsd, ZonedDateTime rest3Endfd, ZonedDateTime rest3Endsd,
                             ZonedDateTime rest4Start, ZonedDateTime rest4End) {
        this.rest1Startfd = rest1Startfd;
        this.rest1Startsd = rest1Startsd;
        this.rest1Endfd = rest1Endfd;
        this.rest1Endsd = rest1Endsd;
        this.rest2Startfd = rest2Startfd;
        this.rest2Startsd = rest2Startsd;
        this.rest2Endfd = rest2Endfd;
        this.rest2Endsd = rest2Endsd;
        this.rest3Startfd = rest3Startfd;
        this.rest3Startsd = rest3Startsd;
        this.rest3Endfd = rest3Endfd;
        this.rest3Endsd = rest3Endsd;
        this.rest4Start = rest4Start;
        this.rest4End = rest4End;
    }

    public int restaurantScore(ArrayList<Integer> score) {
        int sum = 0;
        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i);
        }
        return sum / score.size();
    }

    public void restaurants() {
        ArrayList<Integer> firstScoreR1 = new ArrayList<>();
        firstScoreR1.add(5);
        ArrayList<Integer> firstScoreR2 = new ArrayList<>();
        firstScoreR2.add(5);
        ArrayList<Integer> firstScoreR3 = new ArrayList<>();
        firstScoreR3.add(5);
        ArrayList<Integer> firstScoreR4 = new ArrayList<>();
        firstScoreR4.add(5);
        LocalTime zeroAm = LocalTime.of(0, 0);

        Restaurant restaurant1 = new Restaurant("KFC", "Shahid chamran st", PriceType.LUXURY, firstScoreR1);
        ZoneId zone = ZoneId.systemDefault();
        LocalDate today = LocalDate.now(zone);
        zdt = ZonedDateTime.now(zone);

        LocalTime fourPM = LocalTime.of(16, 0);
        LocalTime twoAM = LocalTime.of(2, 0);
        rest1Startfd = today.atTime(fourPM).atZone(zone);
        rest1Endfd = today.plusDays(1).atTime(zeroAm).atZone(zone);
        rest1Startsd = today.atTime(zeroAm).atZone(zone);
        rest1Endsd = today.atTime(twoAM).atZone(zone);

        Restaurant restaurant2 = new Restaurant("mcDonald", "piroozi st", PriceType.LUXURY, firstScoreR2);
        LocalTime fivePM = LocalTime.of(17, 0);
        LocalTime twoAMhalf = LocalTime.of(2, 30);
        rest2Startfd = today.atTime(fivePM).atZone(zone);
        rest2Endfd = today.plusDays(1).atTime(zeroAm).atZone(zone);
        rest2Startsd = today.atTime(zeroAm).atZone(zone);
        rest2Endsd = today.atTime(twoAMhalf).atZone(zone);

        Restaurant restaurant3 = new Restaurant("Atawich", "Marzdaran", PriceType.ECONOMIC, firstScoreR3);
        LocalTime sixPM = LocalTime.of(18, 0);
        LocalTime oneAM = LocalTime.of(1, 0);
        rest3Startfd = today.atTime(sixPM).atZone(zone);
        rest3Endfd = today.plusDays(1).atTime(zeroAm).atZone(zone);
        rest3Startsd = today.atTime(zeroAm).atZone(zone);
        rest3Endsd = today.atTime(oneAM).atZone(zone);

        Restaurant restaurant4 = new Restaurant("Feri kasif", "Nezam abad", PriceType.NORMAL, firstScoreR4);
        LocalTime fivePMhalf = LocalTime.of(17, 30);
        LocalTime elevenPM = LocalTime.of(23, 0);
        rest4Start = today.atTime(fivePMhalf).atZone(zone);
        rest4End = today.atTime(elevenPM).atZone(zone);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);
    }


    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }


    public ZonedDateTime getZdt() {
        return zdt;
    }


    public ZonedDateTime getRest1Startfd() {
        return rest1Startfd;
    }


    public ZonedDateTime getRest1Startsd() {
        return rest1Startsd;
    }


    public ZonedDateTime getRest1Endfd() {
        return rest1Endfd;
    }


    public ZonedDateTime getRest1Endsd() {
        return rest1Endsd;
    }


    public ZonedDateTime getRest2Startfd() {
        return rest2Startfd;
    }


    public ZonedDateTime getRest2Startsd() {
        return rest2Startsd;
    }


    public ZonedDateTime getRest2Endfd() {
        return rest2Endfd;
    }


    public ZonedDateTime getRest2Endsd() {
        return rest2Endsd;
    }


    public ZonedDateTime getRest3Startfd() {
        return rest3Startfd;
    }


    public ZonedDateTime getRest3Startsd() {
        return rest3Startsd;
    }


    public ZonedDateTime getRest3Endfd() {
        return rest3Endfd;
    }


    public ZonedDateTime getRest3Endsd() {
        return rest3Endsd;
    }


    public ZonedDateTime getRest4Start() {
        return rest4Start;
    }


    public ZonedDateTime getRest4End() {
        return rest4End;
    }

}
