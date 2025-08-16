package generics;

public class StorageNumber implements Storage<Integer>{
    
    public Integer number;
    
    @Override
    public void addData(Integer item) {
        this.number = item;
    }

    @Override
    public Integer viewData() {
        return this.number;
    }
}
