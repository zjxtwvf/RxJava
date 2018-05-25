package rxjava.zjxtwvf.terminator.rxjava;

public class Observable<T> {

    public OnSubcrible<T> onSubcrible;

    public Observable(OnSubcrible<T> onSubcrible){
        this.onSubcrible = onSubcrible;
    }

    public static <T> Observable<T> create(OnSubcrible<? super T> onSubcrible){
        return new Observable(onSubcrible);
    }

    public void subcribe(Subcrible<? super T> subcrible){
        onSubcrible.call(subcrible);
    }
}
