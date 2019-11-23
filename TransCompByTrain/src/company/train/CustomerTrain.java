package company.train;

public class CustomerTrain extends TrainPark {
    private String typeTrain;

    public CustomerTrain(){}

    public CustomerTrain(int indexTrain, String nameTrain, boolean onOrder){
        super(indexTrain, nameTrain, onOrder);
    }

    public CustomerTrain(int indexTrain, String nameTrain, boolean onOrder, String typeTrain){
        super(indexTrain, nameTrain, onOrder);
        this.typeTrain = typeTrain;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public String getTypeTrain() {
        return this.typeTrain;
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
