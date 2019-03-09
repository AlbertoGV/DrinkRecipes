package example.com.retrofit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        ImageView imageView = findViewById(R.id.imagereceta);
        TextView tvreceta = findViewById(R.id.receta);
        TextView tvName = findViewById(R.id.name);
        TextView tvIngredient6 = findViewById(R.id.ingredient6);
        TextView tvIngredient1 = findViewById(R.id.ingredient1);
        TextView tvIngredient2 = findViewById(R.id.ingredient2);
        TextView tvIngredient3 = findViewById(R.id.ingredient3);
        TextView tvIngredient4= findViewById(R.id.ingredient4);
        TextView tvIngredient5= findViewById(R.id.ingredient5);
        TextView tvmesure1 = findViewById(R.id.mesure1);
        TextView tvmesure2 = findViewById(R.id.mesure2);
        TextView tvmesure3 = findViewById(R.id.mesure3);
        TextView tvmesure4 = findViewById(R.id.mesure4);
        TextView tvmesure5 = findViewById(R.id.mesure5);
        TextView tvmesure6 = findViewById(R.id.mesure6);
        Bundle bundle = getIntent().getExtras();
        toolbar.setTitle("DrinkRecipes");


        if (bundle != null) {

            String imagen = bundle.getString("IMAGEN");
            String receta = bundle.getString("RECETA");
            String ingrediente1 = bundle.getString("INGREDIENTE1");
            String ingrediente2 = bundle.getString("INGREDIENTE2");
            String ingrediente3= bundle.getString("INGREDIENTE3");
            String ingrediente4 = bundle.getString("INGREDIENTE4");
            String ingrediente5 = bundle.getString("INGREDIENTE5");
            String ingrediente6 = bundle.getString("INGREDIENTE6");

            String mesure1 = bundle.getString("MESURE1");
            String mesure2 = bundle.getString("MESURE2");
            String mesure3 = bundle.getString("MESURE3");
            String mesure4 = bundle.getString("MESURE4");
            String mesure5 = bundle.getString("MESURE5");
            String mesure6 = bundle.getString("MESURE6");

            String name= bundle.getString("NAME");

            GlideApp.with(RecetaActivity.this)
                    .asBitmap()
                    .load(imagen)
                    .into(imageView);

            tvreceta.setText(receta);
            tvName.setText(name);
            tvIngredient1.setText(ingrediente1);
            tvIngredient2.setText(ingrediente2);
            tvIngredient3.setText(ingrediente3);
            tvIngredient4.setText(ingrediente4);
            tvIngredient5.setText(ingrediente5);
            tvIngredient6.setText(ingrediente6);
            tvmesure1.setText(mesure1);
            tvmesure2.setText(mesure2);
            tvmesure3.setText(mesure3);
            tvmesure4.setText(mesure4);
            tvmesure5.setText(mesure5);
            tvmesure6.setText(mesure6);

        }
    }

}
