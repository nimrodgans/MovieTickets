package com.example.tickets.nimrodpasha.movietickets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class MainPageActivity extends AppCompatActivity {

    AsyncHttpResponseHandler m_httpReponseHandler;
    AsyncHttpClient m_httpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        m_httpReponseHandler = new MyAsyncHttpResponseHandler();
        m_httpClient = new AsyncHttpClient(21147/*Set real port from definitions*/);

        m_httpClient.get("ip:port/movies", m_httpReponseHandler);
    }

    private class MyAsyncHttpResponseHandler extends AsyncHttpResponseHandler
    {
        @Override
        public void onStart() {
            super.onStart();

            // Call loader indicator
        }

        @Override
        public void onSuccess(int i, cz.msebera.android.httpclient.Header[] headers, byte[] bytes) {
            // Show results
        }

        @Override
        public void onFailure(int i, cz.msebera.android.httpclient.Header[] headers, byte[] bytes, Throwable throwable) {
            // Show failure
        }
    }
}



