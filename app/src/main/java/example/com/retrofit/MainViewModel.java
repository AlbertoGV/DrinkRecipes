package example.com.retrofit;
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private MoviedbRepository moviedbRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        moviedbRepository = new MoviedbRepository();
    }

    public LiveData<List<Drink>> getRandom(){
        return moviedbRepository.getRandom();
    }

    public LiveData<List<Drink>> getMargaritas(){
        return moviedbRepository.getMargaritas();
    }

    public LiveData<List<Drink>> getRonDrinks(){
        return moviedbRepository.getRonDrinks();
    }
//4545454
}