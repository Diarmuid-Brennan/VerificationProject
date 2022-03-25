import java.math.BigDecimal;

public class StaffReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        BigDecimal value = new BigDecimal("16");
        if(result.compareTo(value) == 1){
            return value;
        }
        return result;
    }
}
