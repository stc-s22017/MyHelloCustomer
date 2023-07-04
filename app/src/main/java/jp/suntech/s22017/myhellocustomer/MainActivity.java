package jp.suntech.s22017.myhellocustomer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンオブジェクトの用意
        Button btClick = findViewById(R.id.btShow);
        //リスナオブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //クリアボタンであるButtonオブジェクトの取得
        Button btClear = findViewById(R.id.btClear);
        Button btClear2 = findViewById(R.id.btNclear);
        //クリアボタンにリスナを設定
        btClear.setOnClickListener(listener);
        btClear2.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            //名前入力欄であるEdittextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etHome);
            //メッセージを表示するTextViewオブジェクトを取得
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();

            if(id == R.id.btShow){
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
                output.setText(inputStr2 + "にお住いの" + inputStr + "さん、こんにちは！");
            } else if (id == R.id.btClear) {
                input2.setText("");
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
            }else if(id == R.id.btNclear){
                input.setText("");
                String inputStr = input.getText().toString();
                String inputStr2 = input2.getText().toString();
            }
        }
    }
}