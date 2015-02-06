package com.nba.as.slamdunkscore;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by arobinson on 2/5/2015.
 */
public  class ChooseScoreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.choose_score, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button[] buttons = new Button[11];
        buttons[6] = (Button) getActivity().findViewById(R.id.button6);
        buttons[7] = (Button) getActivity().findViewById(R.id.button7);
        buttons[8] = (Button) getActivity().findViewById(R.id.button8);
        buttons[9] = (Button) getActivity().findViewById(R.id.button9);
        buttons[10] = (Button) getActivity().findViewById(R.id.button10);

        for(int i =0 ; i < buttons.length; i++){
            Button b = buttons[i];
            if(b != null){
                b.setOnClickListener(new onScoreClick(getActivity(),i));
            }
        }
    }
    public class onScoreClick implements View.OnClickListener {
        private int score;
        private Activity activity;
        public onScoreClick(Activity activity, int score){
            this.score = score;
            this.activity = activity;
        }
        @Override
        public void onClick(View v) {
            ShowScoreFragment scoreFragment = new ShowScoreFragment();

            Bundle bundle = new Bundle();
            bundle.putInt("show_score", score);
            scoreFragment.setArguments(bundle);

            FragmentTransaction transaction = activity.getFragmentManager().beginTransaction();
            transaction.add(R.id.main_container, scoreFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
