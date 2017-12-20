package test.liaoli.com.xlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.elvishew.xlog.XLog;
import com.elvishew.xlog.printer.AndroidPrinter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.log).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                XLog.e("hello");

            }

        });

    }
}
