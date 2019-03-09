package example.com.retrofit;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class    Fragment2 extends DrinkListFragment {


    @Override
    LiveData<List<Drink>> getDrinks() {

        return mViewModel.getRandom();

    }

}




