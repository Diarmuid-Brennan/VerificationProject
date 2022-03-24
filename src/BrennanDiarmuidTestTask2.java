//package cm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BrennanDiarmuidTestTask2 {
    Period one = new Period(9,16);
    Period two = new Period(20,24);
    Period three = new Period(7,9);
    Period four = new Period(16,20);
    ArrayList<Period> reduced = new ArrayList<>();

    ArrayList<Period> normal = new ArrayList<>();
    BigDecimal norm = new BigDecimal("5");
    BigDecimal reduc = new BigDecimal("3");

    @BeforeEach
    public void initEach(){
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);
    }


    @Test
    public void RateConstructorTestReducedRateLessThanZero() throws Exception {
        int num = Integer.MIN_VALUE;
        reduc = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("A rate cannot be negative", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedRateLessThanZero1() throws Exception {
        int num = -39;
        reduc = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("A rate cannot be negative", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedRateLessThanZero2() throws Exception {
        int num = -1;
        reduc = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("A rate cannot be negative", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedRateGreaterNormalRate() throws Exception {
        int num = Integer.MAX_VALUE;
        reduc = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedRateGreaterThanNormalRate1() throws Exception {
        int num = 50;
        reduc = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedRateGreaterThanNormalRate2() throws Exception {
        int num = 6;
        reduc = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }


    @Test
    public void RateConstructorTestNormalRateNull() throws Exception {
        norm = null;
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The rates cannot be null", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedRateNull() throws Exception {
        reduc = null;
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The rates cannot be null", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedValidEntries() throws Exception {
        int num = 0;
        reduc = new BigDecimal(num);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("10");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestReducedValidEntries1() throws Exception {
        int num = 1;
        reduc = new BigDecimal(num);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("13");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestReducedValidEntries2() throws Exception {
        int num = 4;
        reduc = new BigDecimal(num);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("22");
        assertEquals(cost, result);
    }


    @Test
    public void RateConstructorTestNormalRateLessThanZero() throws Exception {
        int num = Integer.MIN_VALUE;
        norm = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("A rate cannot be negative", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalRateLessThanZero1() throws Exception {
        int num = -39;
        norm = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("A rate cannot be negative", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalRateLessThanZero2() throws Exception {
        int num = -1;
        norm = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("A rate cannot be negative", exception.getMessage());
    }


    @Test
    public void RateConstructorTestNormalValidEntries() throws Exception {
        int num = 0;
        norm = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalValidEntries1() throws Exception {
        int num = 1;
        norm = new BigDecimal(num);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalValidEntries3() throws Exception {
        int num = 5;
        norm = new BigDecimal(num);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("19");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestNormalValidEntries4() throws Exception {
        int num = 10;
        norm = new BigDecimal(num);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("29");
        assertEquals(cost, result);
    }
    @Test
    public void RateConstructorTestNormalRateLessThanReducedRate() throws Exception {
        norm = new BigDecimal(4);
        reduc = new BigDecimal(5);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalRateLessThanReducedRate1() throws Exception {
        norm = new BigDecimal(0);
        reduc = new BigDecimal(5);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalRateLessThanReducedRate2() throws Exception {
        norm = new BigDecimal(0);
        reduc = new BigDecimal(1);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The normal rate cannot be less or equal to the reduced rate", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalRateGreaterEqualToReducedRate() throws Exception {
        norm = new BigDecimal(7);
        reduc = new BigDecimal(3);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("23");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestNormalRateGreaterThanEqualToReducedRate1() throws Exception {
        norm = new BigDecimal(0);
        reduc = new BigDecimal(0);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("0");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestReducedPeriodsNull() throws Exception {
        Period one = new Period(9,11);
        Period two = new Period(8,12);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = null;
        ArrayList<Period> normal = new ArrayList<>();
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("periods cannot be null", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsNull() throws Exception {
        Period one = new Period(9,11);
        Period two = new Period(8,12);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = null;
        reduced.add(three);
        reduced.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("periods cannot be null", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedPeriodsOverlap() throws Exception {
        Period one = new Period(9,11);
        Period two = new Period(8,12);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedPeriodsOverlap1() throws Exception {
        Period one = new Period(9,15);
        Period two = new Period(9,12);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedPeriodsOverlap2() throws Exception {
        Period one = new Period(9,10);
        Period two = new Period(9,10);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedPeriodsDoNotOverlap() throws Exception {
        Period one = new Period(9,11);
        Period two = new Period(11,16);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("19");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestReducedPeriodsDontOverlap1() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(21,24);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("19");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestNormalPeriodsOverlap() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(8,9);
        Period four = new Period(7,9);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsOverlap1() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(17,19);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsOverlap2() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(7,9);
        Period four = new Period(7,9);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsOverlap3() throws Exception {
        Period one = new Period(2, 8);
        Period two = new Period(6, 7);
        Period five = new Period(11, 12);
        Period three = new Period(8, 9);
        Period four = new Period(16, 20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        reduced.add(five);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestPeriodsOverlap() throws Exception {
        Period one = new Period(2, 5);
        Period two = new Period(6, 7);
        Period five = new Period(11, 12);
        Period three = new Period(8, 9);
        Period six = new Period(4, 5);
        Period four = new Period(16, 20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        reduced.add(five);
        normal.add(three);
        normal.add(four);
        normal.add(six);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods overlaps", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsDoNotOverlap() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("19");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestNormalPeriodsDontOverlap1() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(7,8);
        Period four = new Period(8,9);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        Period period = new Period(6,12);
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("19");
        assertEquals(cost, result);
    }

    @Test
    public void RateConstructorTestNormalPeriodsReducedPeriodsOverlap() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(7,11);
        Period four = new Period(10,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods are not valid individually", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsReducedPeriodsOverlap1() throws Exception {
        Period one = new Period(9,16);
        Period two = new Period(20,24);
        Period three = new Period(7,9);
        Period four = new Period(16,24);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods overlaps", exception.getMessage());
    }

    @Test
    public void RateConstructorTestNormalPeriodsReducedPeriodsOverlap2() throws Exception {
        Period one = new Period(8,16);
        Period two = new Period(20,24);
        Period three = new Period(7,9);
        Period four = new Period(15,21);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        reduced.add(two);
        normal.add(three);
        normal.add(four);

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal ));

        assertEquals("The periods overlaps", exception.getMessage());
    }

    @Test
    public void RateConstructorTestReducedPeriodsDontOverlap() throws Exception {
        Period one = new Period(9,11);
        Period two = new Period(11,16);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        normal.add(three);

        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        assertEquals(CarParkKind.STAFF.toString(), "STAFF");
    }

    @Test
    public void RateConstructorTestNormalPeriodsDontOverlap() throws Exception {
        Period one = new Period(9,11);
        Period two = new Period(11,16);
        Period three = new Period(7,9);
        Period four = new Period(16,20);
        ArrayList<Period> reduced = new ArrayList<>();
        ArrayList<Period> normal = new ArrayList<>();
        reduced.add(one);
        normal.add(three);

        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        assertEquals(CarParkKind.STAFF.toString(), "STAFF");
    }

    @Test
    void CalculateTestFreePeriod() throws Exception {
        Period period = new Period(0,7);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("0");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestFreePeriod1() throws Exception {
        Period period = new Period(0,6);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("0");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestFreePeriod2() throws Exception {
        Period period = new Period(0,1);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("0");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestNormalPeriod() throws Exception {
        Period period = new Period(7,8);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("5");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestNormalPeriod1() throws Exception {
        Period period = new Period(7,9);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);
        BigDecimal result = new BigDecimal("10");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestNormalPeriod2() throws Exception {
        Period period = new Period(16,20);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("20");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedPeriod() throws Exception {
        Period period = new Period(9,16);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("21");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedPeriod1() throws Exception {
        Period period = new Period(21,22);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("3");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedPeriod2() throws Exception {
        Period period = new Period(9,11);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("6");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestFreeToNormalPeriod() throws Exception {
        Period period = new Period(6,8);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("5");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestFreeToNormalPeriod1() throws Exception {
        Period period = new Period(0,9);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("10");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedToFreePeriod() throws Exception {
        Period period = new Period(20,24);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("12");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedToFreePeriod1() throws Exception {
        Period period = new Period(21,23);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("6");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestNormalToReducedPeriod() throws Exception {
        Period period = new Period(7,10);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("13");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestNormalToReducedPeriod1() throws Exception {
        Period period = new Period(7,16);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("31");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestNormalToReducedPeriod2() throws Exception {
        Period period = new Period(16,21);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("23");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedToNormalPeriod() throws Exception {
        Period period = new Period(15,20);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("23");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestReducedToNormalPeriod1() throws Exception {
        Period period = new Period(9,19);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("36");
        assertEquals(cost, result);
    }

    @Test
    void CalculateTestFreeToNormalToReducedPeriod() throws Exception {
        Period period = new Period(6,12);
        Rate rate =  new Rate(CarParkKind.STAFF, norm, reduc, reduced, normal );
        BigDecimal cost = rate.calculate(period);

        BigDecimal result = new BigDecimal("19");
        assertEquals(cost, result);
    }


}