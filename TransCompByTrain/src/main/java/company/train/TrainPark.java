package company.train;

public abstract class TrainPark {
    private String nameTrain;
    private boolean onOrder = false;

    TrainPark(){}

    TrainPark( String nameTrain, boolean onOrder){
        this.nameTrain = nameTrain;
        this.onOrder = onOrder;
    }

    public abstract void startMove ();

    public abstract void brake ();

    public abstract void typeTrain();

    public void setNameTrain(String nameTrain){
        this.nameTrain = nameTrain;
    }

    public String getNameTrain() {
        return this.nameTrain;
    }

    public void setOnOrder(boolean onOrder){
        this.onOrder = onOrder;
    }

    public boolean isOnOrder() {
        return this.onOrder;
    }
}
