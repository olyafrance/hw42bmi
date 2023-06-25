public class BmiService {
    public int calculate(double heihgtm, int weightkg) {
        int bmi;
        bmi = (int) (weightkg / (heihgtm * heihgtm));
        return bmi;
    }

}
