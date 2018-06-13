package thiagodev.com.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import thiagodev.com.atmconsultoria.R;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription("Nossa missão é maior topp. \n" + "Sei lá mano... QUEBROU!")

                .addGroup("Fale Conosco")
                .addEmail("atmconsultoria@gmail.com", "Envie um e-mail.")
                .addGroup("Redes Sociais")
                .addFacebook("thiagohenriquex")
                .addTwitter("_thsantos")
                .addYoutube("youtube.com")
                .addInstagram("thiago0803")

                .create();

        setContentView(aboutPage);
    }
}
