package example.com.retrofit;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieListViewHolder>{
    public List<Drink> drinkList = new ArrayList<>();

    @NonNull
    @Override
    public MovieListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false);
        return new MovieListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovieListViewHolder holder, int position) {
        final Drink drink = drinkList.get(position);

        holder.title.setText(drink.strDrink);

        GlideApp.with(holder.itemView.getContext()).load(drink.strDrinkThumb).into(holder.imagenDrink);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),RecetaActivity.class);

                String imagen= drink.getStrDrinkThumb();
                String receta= drink.getStrInstructions();

                String ingredient1 = drink.getStrIngredient1();
                String ingredient2 = drink.getStrIngredient2();
                String ingredient3 = drink.getStrIngredient3();
                String ingredient4 = drink.getStrIngredient4();
                String ingredient5 = drink.getStrIngredient5();
                String ingredient6 = drink.getStrIngredient6();

                String mesure1 = drink.getStrMeasure1();
                String mesure2 = drink.getStrMeasure2();
                String mesure3 = drink.getStrMeasure3();
                String mesure4 = drink.getStrMeasure4();
                String mesure5 = drink.getStrMeasure5();
                String mesure6 = drink.getStrMeasure6();

                String name = drink.getStrDrink();

                intent.putExtra("IMAGEN",imagen);
                intent.putExtra("RECETA",receta);
                intent.putExtra("INGREDIENTE1",ingredient1);
                intent.putExtra("INGREDIENTE2",ingredient2);
                intent.putExtra("INGREDIENTE3",ingredient3);
                intent.putExtra("INGREDIENTE4",ingredient4);
                intent.putExtra("INGREDIENTE5",ingredient5);
                intent.putExtra("INGREDIENTE6",ingredient6);
                intent.putExtra("MESURE1",mesure1);
                intent.putExtra("MESURE2",mesure2);
                intent.putExtra("MESURE3",mesure3);
                intent.putExtra("MESURE4",mesure4);
                intent.putExtra("MESURE5",mesure5);
                intent.putExtra("MESURE6",mesure6);
                intent.putExtra("NAME",name);

                v.getContext().startActivity(intent);

            }
        });
    }
    public void setList(List<Drink> drinks){

        this.drinkList = drinks;
    }

    @Override
    public int getItemCount() {

        return drinkList.size();
    }

    class MovieListViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imagenDrink;


        public MovieListViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.movieTitle);
            imagenDrink = itemView.findViewById(R.id.imagen_drink);


        }
    }
}