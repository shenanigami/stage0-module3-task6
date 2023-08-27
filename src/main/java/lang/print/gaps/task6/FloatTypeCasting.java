package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundedNumber = (int) numberToBeRounded;
        roundedNumber += (numberToBeRounded - roundedNumber) < 0.5 ? 0 : 1;
        System.out.println(roundedNumber);
    }
}
