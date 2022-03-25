import java.math.BigDecimal;

public class StudentReduction implements IReducedCalculate{
    @Override
    public BigDecimal calculateReduction(BigDecimal result) {
        if(result.intValue() > 5.50){
            return new BigDecimal("16");
        }
        return result;
    }
}
