package np.com.sabinb.newsportaldemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class SecondActivity extends ActionBarActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        webView = (WebView)findViewById(R.id.webView);
        Intent inIntent = getIntent();
        String url = inIntent.getExtras().getString("URL");
        webView.loadUrl("http://www."+url+".com");
        webView.setWebViewClient(new MyWebViewClient());
    }
    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }



}
