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

public class TitleScreen extends Fragment {
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_title_screen, container, false);

		view.findViewById(R.id.play_btn).setOnClickListener(v -> {
			Navigation.findNavController(view).navigate(R.id.action_title_screen_to_register);
		});
		//
		view.findViewById(R.id.leaderboard_btn).setOnClickListener(v -> {
			Navigation.findNavController(view).navigate(R.id.action_title_screen_to_leaderboard);
		});
		return view;
	}
}
