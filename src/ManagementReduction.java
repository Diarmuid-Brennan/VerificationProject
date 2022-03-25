import java.math.BigDecimal;

public class ManagementReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        if(result.intValue() < 4){
            return new BigDecimal("4");
        }
        return result;
    }
}
