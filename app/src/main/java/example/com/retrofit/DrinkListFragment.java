package example.com.retrofit;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public abstract class DrinkListFragment extends Fragment {
    public MainViewModel mViewModel;
    public MovieListAdapter mMovieListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_drinklist, container, false);

        final RecyclerView recyclerView = view.findViewById(R.id.movieList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        final MovieListAdapter mMovieListAdapter = new MovieListAdapter();
        recyclerView.setAdapter(mMovieListAdapter);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        getDrinks().observe(this, new Observer<List<Drink>>() {
            @Override
            public void onChanged(@Nullable List<Drink> drinks) {
                mMovieListAdapter.setList(drinks);
                mMovieListAdapter.notifyDataSetChanged();


            }
        });

        return view;
    }

    abstract LiveData<List<Drink>> getDrinks();

}