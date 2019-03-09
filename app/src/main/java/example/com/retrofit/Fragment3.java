package example.com.retrofit;

import android.arch.lifecycle.LiveData;
import android.support.v4.app.Fragment;

import java.util.List;

public class Fragment3 extends DrinkListFragment {


    @Override
    LiveData<List<Drink>> getDrinks() {
        return mViewModel.getRonDrinks();
    }
}
