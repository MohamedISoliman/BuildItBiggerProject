package me.geekymind.androidjokes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokes extends AppCompatActivity {

  private static final String KEY_JOKE = "JOKE";

  public static void start(Context context, String joke) {
    Intent starter = new Intent(context, DisplayJokes.class);
    starter.putExtra(KEY_JOKE, joke);
    context.startActivity(starter);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_jokes);

    if (getIntent() != null && getIntent().getExtras() != null) {
      String joke = getIntent().getStringExtra(KEY_JOKE);
      TextView textView = findViewById(R.id.container);
      textView.setText(joke);
    }
  }
}
