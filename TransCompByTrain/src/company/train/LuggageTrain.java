package company.train;

public class LuggageTrain extends TrainPark{
    private String typeCarriage;
    private int maxWeightLuggage;

    public LuggageTrain(){}

    public LuggageTrain(int indexTrain, String nameTrain, boolean onOrder){
        super(indexTrain, nameTrain, onOrder);
    }

    public LuggageTrain(int indexTrain, String nameTrain, boolean onOrder, String typeCarriage, int maxWeightLuggage){
        super(indexTrain, nameTrain, onOrder);
        this.typeCarriage = typeCarriage;
        this.maxWeightLuggage = maxWeightLuggage;
    }

    public void setTypeCarriage(String typeCarriage) {
        this.typeCarriage = typeCarriage;
    }

    public void setMaxWeightLuggage(int maxWeightLuggage) {
        this.maxWeightLuggage = maxWeightLuggage;
    }

    public String getTypeCarriage() {
        return this.typeCarriage;
    }

    public int getMaxWeightLuggage() {
        return this.maxWeightLuggage;
    }

    @Override
    public void startMove (){
        System.out.println("Train starts moving!!!");
    }

    @Override
    public void brake (){
        System.out.println("Train brakes!!!");
    }
}
