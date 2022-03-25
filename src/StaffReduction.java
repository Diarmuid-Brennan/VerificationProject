import java.math.BigDecimal;

public class StaffReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        if(result.intValue() > 16){
            return new BigDecimal("16");
        }
        return result;
    }
}
