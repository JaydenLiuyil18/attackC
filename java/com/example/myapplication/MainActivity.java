package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//import java.net.MalformedURLException;

/**
 * downloading url
 */
public class MainActivity extends AppCompatActivity {
    /**
     * constant.
     */
    public static final int REQUEST_CODE = 100;
    /**
     * do.
     */
    private Button button;

    /**
     * oncreate;
     * @param savedInstanceState it is an Instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAcitivity2();

            }
        });
        Intent classs = new Intent(this, activity2.class);

        //ImageView myImageView = (ImageView) findViewById(R.id.my_image_view);
        //myImageView.setImageResource(R.drawable.background);

    }

    /**
     * dowanload URL
     */
    public void openAcitivity2() {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
//    public Bitmap getBitmapFromURL(String src) {
//        try {
//            java.net.URL url = new java.net.URL(src);
//            HttpURLConnection connection = (HttpURLConnection) url
//                    .openConnection();
//            connection.setDoInput(true);
//            connection.connect();
//            InputStream input = connection.getInputStream();
//            Bitmap myBitmap = BitmapFactory.decodeStream(input);
//            return myBitmap;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    /**
//     * download url incase of runoutof memory
//     * @param bm
//     * @param newHeight
//     * @param newWidth
//     * @return
//     */
//    public Bitmap getResizedBitmap(Bitmap bm, int newHeight, int newWidth) {
//        int width = bm.getWidth();
//        int height = bm.getHeight();
//        float scaleWidth = ((float) newWidth) / width;
//        float scaleHeight = ((float) newHeight) / height;
//        // CREATE A MATRIX FOR THE MANIPULATION
//        Matrix matrix = new Matrix();
//        // RESIZE THE BIT MAP
//        matrix.postScale(scaleWidth, scaleHeight);
//
//        // "RECREATE" THE NEW BITMAP
//        Bitmap resizedBitmap = Bitmap.createBitmap(bm, 0, 0, width, height,
//                matrix, false);
//
//        return resizedBitmap;
//    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

}
