package com.example.techtron.roulette;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.animation.Animation;
        import android.view.animation.DecelerateInterpolator;
        import android.view.animation.RotateAnimation;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.Random;

public class RouletteActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    ImageView wheelRoul;

    Random r;
    int degree = 0, degree_old = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roulette);
        button = (Button) findViewById(R.id.btn_spin);
        textView = (TextView) findViewById(R.id.textView);
        wheelRoul = (ImageView) findViewById(R.id.imRoulette);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree_old = degree % 360;
                degree = r.nextInt(360) + 720;
                RotateAnimation rotate = new RotateAnimation(degree_old, degree,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                wheelRoul.startAnimation(rotate);
            }
        });
    }
}
