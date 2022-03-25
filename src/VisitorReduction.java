import java.math.BigDecimal;

public class VisitorReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        BigDecimal value = new BigDecimal("10");
        if(result.compareTo(value) == -1){
            return new BigDecimal("0");
        }
        BigDecimal diff = result.subtract(value);
        diff = diff.multiply(new BigDecimal("0.5"));
        return diff.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
