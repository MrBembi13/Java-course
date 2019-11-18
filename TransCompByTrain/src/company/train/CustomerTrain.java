package company.train;

public class CustomerTrain extends TrainPark {
    private String modelTrain; //модель поезда
    private String typeTrain; //тип поезда

    public CustomerTrain(){}

    public CustomerTrain(int indexTrain, String nameTrain, int since, boolean onOrder){
        super(indexTrain, nameTrain, since, onOrder);
    }

    public CustomerTrain(int indexTrain, String nameTrain, int since, boolean onOrder, String modelTrain, String typeTrain){
        super(indexTrain, nameTrain, since, onOrder);
        this.modelTrain = modelTrain;
        this.typeTrain = typeTrain;
    }

    public void setCustomerTrain(String modelTrain, String typeTrain){
        this.modelTrain = modelTrain;
        this.typeTrain = typeTrain;
    }

    public void getCustomerTrain(){
        System.out.println("Model train: " + this.modelTrain);
        System.out.println("Type train: " + this.typeTrain);
    }
}
