package dagger.bamboo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.bamboo.com.di.component.DaggerHelloDaggerComponent;
import dagger.bamboo.com.model.HelloDagger;

public class MainActivity extends AppCompatActivity {

    @Inject
    HelloDagger mHelloDagger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerHelloDaggerComponent.builder().build().inject(this);
        mHelloDagger.print();
    }
}
