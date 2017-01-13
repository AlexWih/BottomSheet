package io.github.farhadfaghihi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBottomSheetBehavior = (Button)findViewById(R.id.button_bottomsheetlayout) ;
        btnBottomSheetBehavior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,PersistentBottomSheetActivity.class) ;
                startActivity(intent);
            }
        });

        Button btnBottomSheetFragment = (Button)findViewById(R.id.button_bottomsheetfragment) ;
        btnBottomSheetFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showBottomSheetFragment();
            }
        });
    }

    private void showBottomSheetFragment(){

        FragmentModalBottomSheet fragmentModalBottomSheet = new FragmentModalBottomSheet();
        fragmentModalBottomSheet.show(getSupportFragmentManager(),"BottomSheet Fragment");
    }
}
