package com.nba.as.slamdunkscore;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.app.Fragment;

/**
 * Created by arobinson on 2/5/2015.
 */
public class ShowScoreFragment extends Fragment{

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Drawable[] images = new Drawable[11];
        images[6] = getResources().getDrawable(R.drawable.score_8);
        images[7] = getResources().getDrawable(R.drawable.score_8);
        images[8] = getResources().getDrawable(R.drawable.score_8);
        images[9] = getResources().getDrawable(R.drawable.score_9);
        images[10] = getResources().getDrawable(R.drawable.score_10);

        ImageView scoreImageView = (ImageView)getActivity().findViewById(R.id.scoreImageView);

        Drawable image = images[getArguments().getInt("show_score")];
        scoreImageView.setImageDrawable(image);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.show_score, container, false);
    }
}

