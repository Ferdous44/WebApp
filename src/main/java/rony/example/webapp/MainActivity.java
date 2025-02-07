package rony.example.webapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends AppCompatActivity {
    WebView Webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Webview= findViewById(R.id.Webview);
        Webview.getSettings().setJavaScriptEnabled(true);
        Webview.loadUrl("https://www.daraz.com.bd/");

    }
}