package example.com.retrofit;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviedbRepository {
    DrinkdbAPI drinkdbAPI;

    public MoviedbRepository(){
        drinkdbAPI = MoviedbModule.getAPI();
    }

    public LiveData<List<Drink>> getRandom(){
        final MutableLiveData<List<Drink>> lista = new MutableLiveData<>();

        drinkdbAPI.getRandom().enqueue(new Callback<RandomResponse>() {

            @Override
            public void onResponse(Call<RandomResponse> call, Response<RandomResponse> response) {
                lista.setValue(response.body().drinks);

            }

            @Override
            public void onFailure(Call<RandomResponse> call, Throwable t) {
                System.out.println("No se ha podido conectar con la base de datos");
            }
        });

        return lista;
    }
    public LiveData<List<Drink>> getMargaritas(){
        final MutableLiveData<List<Drink>> lista = new MutableLiveData<>();

       drinkdbAPI.getMargaritas().enqueue(new Callback<MargaritasResponse>() {
            @Override
            public void onResponse(Call<MargaritasResponse> call, Response<MargaritasResponse> response) {
                lista.setValue(response.body().drinks);
            }

            @Override
            public void onFailure(Call<MargaritasResponse> call, Throwable t) {
                System.out.println("No se ha podido conectar con la base de datos");
            }
        });

        return lista;

    }



    public LiveData<List<Drink>> getRonDrinks(){
        final MutableLiveData<List<Drink>> lista = new MutableLiveData<>();

        drinkdbAPI.getRonDrinks().enqueue(new Callback<RonResponse>() {
            @Override
            public void onResponse(Call<RonResponse> call, Response<RonResponse> response) {
                lista.setValue(response.body().drinks);
            }

            @Override
            public void onFailure(Call<RonResponse> call, Throwable t) {
                System.out.println("No se ha podido conectar con la base de datos");
            }
        });

        return lista;
    }

}