package com.example.fboysapplication.direct;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;

import com.example.fboysapplication.R;

public class StreamViewFragment extends Fragment {
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stream_view,container,false);

        webView = (WebView)view.findViewById(R.id.streamWebView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://192.168.1.7:5000/");

        return view;
    }

}
