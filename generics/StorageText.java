package generics;

public class StorageText implements Storage<String>{

    public String book;
    
    @Override
    public void addData(String item) {
        this.book = item;
    }

    @Override
    public String viewData() {
        return this.book;
    }
}
