package company.train;

public class CustomerTrain extends TrainPark implements TrainInfo{
    private String typeTrain;
    private boolean canTrainWork = true;
    private boolean fullTankOil = true;
    private static int countCustomerTrain = 0;
    private int indexTrain = 0;

    public CustomerTrain(){
        countCustomerTrain++;
        this.indexTrain = countCustomerTrain;
    }

    public CustomerTrain(String nameTrain, boolean onOrder){
        super(nameTrain, onOrder);
        countCustomerTrain++;
        this.indexTrain = countCustomerTrain;
    }

    public CustomerTrain(String nameTrain, boolean onOrder, String typeTrain){
        super(nameTrain, onOrder);
        this.typeTrain = typeTrain;
        countCustomerTrain++;
        this.indexTrain = countCustomerTrain;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public String getTypeTrain() {
        return this.typeTrain;
    }

    public void setCanTrainWork(boolean canTrainWork){
        this.canTrainWork = canTrainWork;
    }

    public void setFullTankOil(boolean fullTankOil) {
        this.fullTankOil = fullTankOil;
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
    public void fullTankOil(){
        if (fullTankOil) System.out.println("Train has full tank.");
        else System.out.println("Train hasn't full tank.");
    }

    @Override
    public void canTrainWorks() {
        if (canTrainWork) System.out.println("Train can go on order.");
        else System.out.println("Train can't go on order.");
    }

    @Override
    public void typeTrain(){
        System.out.println("This is Customer train!!!");
    }
}
