import java.math.BigDecimal;

public class StudentReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        BigDecimal value = new BigDecimal("5.50");
        if(result.compareTo(value) == -1){
            return result;
        }
        BigDecimal diff = result.subtract(value);
        BigDecimal reduc = diff.multiply(new BigDecimal("0.25"));
        diff = diff.subtract(reduc);
        diff = diff.add(value);
        return diff.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
