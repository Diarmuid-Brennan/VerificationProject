import java.math.BigDecimal;

public class ManagementReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        BigDecimal value = new BigDecimal("4");
        if(result.compareTo(value) == -1){
            return value;
        }
        return result;
    }
}
