package company.train;

public class LuggageTrain extends TrainPark{
    private String modelTrain; //модель поезда
    private String typeCarriage; //тип вагона для перевозки
    private int maxWeightLuggage; //максимальный вес для погрузки

    public LuggageTrain(){}

    public LuggageTrain(int indexTrain, String nameTrain, int since, boolean onOrder){
        super(indexTrain, nameTrain, since, onOrder);
    }

    public LuggageTrain(int indexTrain, String nameTrain, int since, boolean onOrder, String modelTrain, String typeCarriage, int maxWeightLuggage){
        super(indexTrain, nameTrain, since, onOrder);
        this.modelTrain = modelTrain;
        this.typeCarriage = typeCarriage;
        this.maxWeightLuggage = maxWeightLuggage;
    }

    public void setLuggageTrain(String modelTrain, String typeCarriage, int maxWeightLuggage){
        this.modelTrain = modelTrain;
        this.typeCarriage = typeCarriage;
        this.maxWeightLuggage = maxWeightLuggage;
    }

    public void getLuggageTrain(){
        System.out.println("Model train: " + this.modelTrain);
        System.out.println("Type carriage: " + this.typeCarriage);
        System.out.println("Max weight luggage in carriage: " + this.maxWeightLuggage + "T");
    }
}
