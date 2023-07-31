package edu.csueb.codepath.fitness_tracker.fragments;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;

import edu.csueb.codepath.fitness_tracker.R;

public class VideoFragment extends Fragment implements View.OnClickListener {

    private VideoView videoView;
    private Button btnVideo1, btnVideo2, btnVideo3, btnVideo4, btnVideo5, btnVideo6, btnVideo7, btnVideo8, btnVideo9, btnVideo10, btnVideo11, btnVideo12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        videoView = view.findViewById(R.id.video_view);
        btnVideo1 = view.findViewById(R.id.btn_video1);
        btnVideo2 = view.findViewById(R.id.btn_video2);
        btnVideo3 = view.findViewById(R.id.btn_video3);
        btnVideo4 = view.findViewById(R.id.btn_video4);
        btnVideo5 = view.findViewById(R.id.btn_video5);
        btnVideo6 = view.findViewById(R.id.btn_video6);
        btnVideo7 = view.findViewById(R.id.btn_video7);
        btnVideo8 = view.findViewById(R.id.btn_video8);
        btnVideo9 = view.findViewById(R.id.btn_video9);
        btnVideo10 = view.findViewById(R.id.btn_video10);
        btnVideo11 = view.findViewById(R.id.btn_video11);
        btnVideo12 = view.findViewById(R.id.btn_video12);

        btnVideo1.setOnClickListener(this);
        btnVideo2.setOnClickListener(this);
        btnVideo3.setOnClickListener(this);
        btnVideo4.setOnClickListener(this);
        btnVideo5.setOnClickListener(this);
        btnVideo6.setOnClickListener(this);
        btnVideo7.setOnClickListener(this);
        btnVideo8.setOnClickListener(this);
        btnVideo9.setOnClickListener(this);
        btnVideo10.setOnClickListener(this);
        btnVideo11.setOnClickListener(this);
        btnVideo12.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_video1:
                playVideo(R.raw.tutorial1);
                break;
            case R.id.btn_video2:
                playVideo(R.raw.tutorial2);
                break;
            case R.id.btn_video3:
                playVideo(R.raw.tutorial3);
                break;
            case R.id.btn_video4:
                playVideo(R.raw.tutorial4);
                break;
            case R.id.btn_video5:
                playVideo(R.raw.tutorial5);
                break;
            case R.id.btn_video6:
                playVideo(R.raw.tutorial6);
                break;
            case R.id.btn_video7:
                playVideo(R.raw.tutorial7);
                break;
            case R.id.btn_video8:
                playVideo(R.raw.tutorial8);
                break;
            case R.id.btn_video9:
                playVideo(R.raw.tutorial9);
                break;
            case R.id.btn_video10:
                playVideo(R.raw.tutorial10);
                break;
            case R.id.btn_video11:
                playVideo(R.raw.tutorial11);
                break;
            case R.id.btn_video12:
                playVideo(R.raw.tutorial12);
                break;
        }
    }

    private void playVideo(int videoResId) {
        String videoPath = "android.resource://" + requireContext().getPackageName() + "/" + videoResId;
        Uri videoUri = Uri.parse(videoPath);
        videoView.setVideoURI(videoUri);

        MediaController mediaController = new MediaController(requireContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
