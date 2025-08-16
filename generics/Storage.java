package generics;

public interface Storage<T> {

    public void addData(T item);
    T viewData();
}