package com.example.bottomsheet;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetDialog;
public class MainActivity extends AppCompatActivity {
    Button show;
    BottomSheetDialog bottomSheetDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=findViewById(R.id.show);
        bottomSheetDialog=new BottomSheetDialog(this);
        create();
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.show();
            }
        });
        bottomSheetDialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }
    private void create() {
        View view= getLayoutInflater().inflate(R.layout.bottomsheet,null,false);
        TextView textView1=view.findViewById(R.id.name1);
        TextView textView2=view.findViewById(R.id.name2);
        TextView textView3=view.findViewById(R.id.name3);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.dismiss();
                Toast.makeText(MainActivity.this, textView1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.dismiss();
                Toast.makeText(MainActivity.this, textView2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog.dismiss();
                Toast.makeText(MainActivity.this, textView3.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        bottomSheetDialog.setContentView(view);
    }
}