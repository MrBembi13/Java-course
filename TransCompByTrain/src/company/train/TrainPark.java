package company.train;

public abstract class TrainPark {
    protected int indexTrain;
    protected String nameTrain;
    protected boolean onOrder = false;

    public TrainPark(){}

    public TrainPark(int indexTrain, String nameTrain, boolean onOrder){
        this.indexTrain = indexTrain;
        this.nameTrain = nameTrain;
        this.onOrder = onOrder;
    }

    public abstract void startMove ();

    public abstract void brake ();

    public void setIndexTrain(int indexTrain){
        this.indexTrain = indexTrain;
    }

    public int getIndexTrain(){
        return this.indexTrain;
    }

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
