package rxjava.zjxtwvf.terminator.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(){
        Observable.create(new OnSubcrible<String>() {
            @Override
            public void call(Subcrible<? super String> subcrible) {
                subcrible.onNext("发出事件------------>");
            }
        }).subcribe(new Subcrible<String>() {
            @Override
            public void onNext(String s) {
                System.out.println("收到事件：  " +s);
            }
        });
    }
}
