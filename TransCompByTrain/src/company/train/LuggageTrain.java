package company.train;

public class LuggageTrain extends TrainPark implements TrainInfo{
    private String typeCarriage;
    private int maxWeightLuggage;
    private boolean canTrainWork = true;
    private boolean fullTankOil = true;

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

    public void setCanTrainWork(boolean canTrainWork){
        this.canTrainWork = canTrainWork;
    }

    public void setFullTankOil(boolean fullTankOil) {
        this.fullTankOil = fullTankOil;
    }

    @Override
    public void fullTankOil(){
        if (fullTankOil) System.out.println("Train has full tank.");
        else System.out.println("Train hasn't full tank.");
    }

    @Override
    public void canTrainWorks(){
        if (canTrainWork) System.out.println("Train can go on order.");
        else System.out.println("Train can't go on order.");
    }

    @Override
    public void startMove (){
        System.out.println("Train starts moving!!!");
    }

    @Override
    public void brake (){
        System.out.println("Train brakes!!!");
    }

    @Override
    public void typeTrain(){
        System.out.println("This is Luggage train!!!");
    }
}
