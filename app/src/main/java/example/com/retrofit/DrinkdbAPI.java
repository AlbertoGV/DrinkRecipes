package example.com.retrofit;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DrinkdbAPI {

    /*@GET("/api/json/v1/1/random.php")
    Call<RandomResponse> getRandom();*/

    @GET("/api/json/v1/1/random.php")
    Call<RandomResponse> getRandom();

    @GET("/api/json/v1/1/search.php?s=")
    Call<MargaritasResponse> getMargaritas();

    @GET("/api/json/v1/1/search.php?s=cocktail")
    Call<RonResponse> getRonDrinks();

}
