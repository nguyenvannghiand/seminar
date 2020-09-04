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

public class ResultsWinner extends Fragment {
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_results_winner, container, false);

		view.findViewById(R.id.play_btn2).setOnClickListener(v -> {
			Navigation.findNavController(view).navigate(R.id.action_results_winner_to_match);
		});

		view.findViewById(R.id.leaderboard_btn2).setOnClickListener(v -> {
			Navigation.findNavController(view).navigate(R.id.action_results_winner_to_leaderboard);
		});

		return view;
	}
}
