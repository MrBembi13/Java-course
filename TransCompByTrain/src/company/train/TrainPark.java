package company.train;

public class TrainPark {
    protected int indexTrain; //индекс поезда в парке для идентификации
    protected String nameTrain; //марка поезда
    protected int since; //год выготовления
    protected boolean onOrder = false; //на заказе или нет

    public TrainPark(){}

    public TrainPark(int indexTrain, String nameTrain, int since, boolean onOrder){
        this.indexTrain = indexTrain;
        this.nameTrain = nameTrain;
        this.since = since;
        this.onOrder = onOrder;
    }

    public void setTrainPark(int indexTrain, String nameTrain, int since, boolean onOrder){
        this.indexTrain = indexTrain;
        this.nameTrain = nameTrain;
        this.since = since;
        this.onOrder = onOrder;
    }

    public void getTrainPark(){
        System.out.println("IndexTrain in park: " + this.indexTrain);
        System.out.println("Train: " + this.nameTrain);
        System.out.println("Since " + this.since);
        System.out.println("Are train on order? " + this.onOrder);
    }
}
