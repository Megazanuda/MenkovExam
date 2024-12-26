public class Fractions{
    public int Num;
    public int Denom;

    public String DoFraction(int num, int denom) throws ZeroException {
        if (denom == 0){
            throw new ZeroException("Делеитель не может быть равен нулю!");
        }
        Num = num;
        Denom = denom;
        return "Дробь: " + Num + "/" + Denom;
    }


}

