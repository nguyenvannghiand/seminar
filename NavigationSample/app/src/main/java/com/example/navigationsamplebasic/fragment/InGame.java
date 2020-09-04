package com.example.navigationsamplebasic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.navigationsamplebasic.R;

public class InGame extends Fragment {
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_in_game, container, false);
		//
		view.findViewById(R.id.checkBox3).setOnClickListener(v -> {
			Navigation.findNavController(view).navigate(R.id.action_in_game_to_resultsWinner);
		});
		//
		view.findViewById(R.id.checkBox).setOnClickListener(gameOverListener);
		view.findViewById(R.id.checkBox2).setOnClickListener(gameOverListener);
		view.findViewById(R.id.checkBox4).setOnClickListener(gameOverListener);
		return view;
	}

	View.OnClickListener gameOverListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Navigation.findNavController(v).navigate(R.id.action_in_game_to_gameOver);
		}
	};
}
