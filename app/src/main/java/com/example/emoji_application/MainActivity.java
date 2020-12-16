package com.example.emoji_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import hani.momanii.supernova_emoji_library.Actions.EmojIconActions;
import hani.momanii.supernova_emoji_library.Helper.EmojiconEditText;
import hani.momanii.supernova_emoji_library.Helper.EmojiconTextView;

public class MainActivity extends AppCompatActivity {

    EmojiconEditText editText;
    EmojiconTextView textView;
    EmojIconActions emojIconActions ;
    ImageView send, emjoi;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_view);
        send = findViewById(R.id.emoji_send);
        emjoi = findViewById(R.id.emoji_icon);
        view = findViewById(R.id.rootid);



        emojIconActions  = new EmojIconActions(this,view,editText,emjoi);
        emojIconActions.ShowEmojIcon();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  data = editText.getText().toString();
                textView.setText(data);
            }
        });
    }
}