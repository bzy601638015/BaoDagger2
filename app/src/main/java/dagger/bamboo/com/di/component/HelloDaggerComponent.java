package dagger.bamboo.com.di.component;

import dagger.Component;
import dagger.bamboo.com.MainActivity;

/**
 * Created by bamboo on 17/8/25.
 */
@Component
public interface HelloDaggerComponent {
    void inject(MainActivity activity);
}
