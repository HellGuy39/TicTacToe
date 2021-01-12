package com.hfad.noughtsandcrosses;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button startBut,resPoints;
    TextView playerMove,scoreP1,scoreP2;
    ImageButton but1,but2,but3,but4,but5,but6,but7,but8,but9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        playerMove = findViewById(R.id.playerMove);
        scoreP1 = findViewById(R.id.scoreP1);
        scoreP2 = findViewById(R.id.scoreP2);
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        but6 = findViewById(R.id.but6);
        but7 = findViewById(R.id.but7);
        but8 = findViewById(R.id.but8);
        but9 = findViewById(R.id.but9);
        startBut = findViewById(R.id.startBut);
        resPoints = findViewById(R.id.resPoints);
        buttonsOff();

        /*if (savedInstanceState != null) {
            scoreP1int = savedInstanceState.getInt("scoreP1int");
            scoreP2int = savedInstanceState.getInt("scoreP2int");
        }*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent settings = new Intent(this, SettingsActivity.class);
            startActivity(settings);
            return true;
        } else if (id == R.id.action_help) {
            Intent help = new Intent(this, HelpActivity.class);
            startActivity(help);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*@SuppressLint("MissingSuperCall")
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("scoreP1int",scoreP1int);
        savedInstanceState.putInt("scoreP1int",scoreP2int);
    }*/

    public int scoreP1int = 0;
    public int scoreP2int = 0;
    public int moves = 9;
    public boolean playerNow = false; // false - X | true - O
    //public boolean gameActivity = false; // false - не активна | true - активна

    //    1-й игрок - Крестик            2-й игрок - нолик
    boolean player1But1 = false;    boolean player2But1 = false;
    boolean player1But2 = false;    boolean player2But2 = false;
    boolean player1But3 = false;    boolean player2But3 = false;
    boolean player1But4 = false;    boolean player2But4 = false;
    boolean player1But5 = false;    boolean player2But5 = false;
    boolean player1But6 = false;    boolean player2But6 = false;
    boolean player1But7 = false;    boolean player2But7 = false;
    boolean player1But8 = false;    boolean player2But8 = false;
    boolean player1But9 = false;    boolean player2But9 = false;

    public void onClickScoreClean(View view) {
        scoreP1int = 0;
        scoreP2int = 0;
        scoreP1.setText(Integer.toString(scoreP1int));
        scoreP2.setText(Integer.toString(scoreP2int));
    }

    public void onClickStart(View view) {
        startBut.setText("Сначала"); // !
        moves = 9;
        winCheckerAllFalse();
        playerNow = false;
        //colorCleaner();
        ActualFiguresOnButtonsCleaner();
        //gameActivity = true;
        playerNowTextSwitcher();
        buttonsOn();
    }

    public void onClickBut1 (View view) {
        but1.setClickable(false);
        if (playerNow == false) {
            player1But1 = true;
            but1.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But1 = true;
            but1.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut2 (View view) {
        but2.setClickable(false);
        if (playerNow == false) {
            player1But2 = true;
            but2.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But2 = true;
            but2.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut3 (View view) {
        but3.setClickable(false);
        if (playerNow == false) {
            player1But3 = true;
            but3.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But3 = true;
            but3.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut4 (View view) {
        but4.setClickable(false);
        if (playerNow == false) {
            player1But4 = true;
            //but4.setText("X");
            but4.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But4 = true;
            but4.setImageResource(R.drawable.o);
            //but4.setText("O");
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut5 (View view) {
        but5.setClickable(false);
        if (playerNow == false) {
            player1But5 = true;
            but5.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But5 = true;
            but5.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut6 (View view) {
        but6.setClickable(false);
        if (playerNow == false) {
            player1But6 = true;
            but6.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But6 = true;
            but6.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut7 (View view) {
        but7.setClickable(false);
        if (playerNow == false) {
            player1But7 = true;
            but7.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But7 = true;
            but7.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut8 (View view) {
        but8.setClickable(false);
        if (playerNow == false) {
            player1But8 = true;
            but8.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But8 = true;
            but8.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void onClickBut9 (View view) {
        but9.setClickable(false);
        if (playerNow == false) {
            player1But9 = true;
            but9.setImageResource(R.drawable.x);
            playerNow = true;
        } else if (playerNow == true) {
            player2But9 = true;
            but9.setImageResource(R.drawable.o);
            playerNow = false;
        }
        moves--;
        playerNowTextSwitcher();
        winChecker();
    }

    public void buttonsOff() {
        but1.setClickable(false);
        but2.setClickable(false);
        but3.setClickable(false);
        but4.setClickable(false);
        but5.setClickable(false);
        but6.setClickable(false);
        but7.setClickable(false);
        but8.setClickable(false);
        but9.setClickable(false);
    }

    public void buttonsOn() {
        but1.setClickable(true);
        but2.setClickable(true);
        but3.setClickable(true);
        but4.setClickable(true);
        but5.setClickable(true);
        but6.setClickable(true);
        but7.setClickable(true);
        but8.setClickable(true);
        but9.setClickable(true);
    }

    public void winChecker() {
        // player 1
        if ((player1But1 && player1But2 && player1But3) == true ||
            (player1But4 && player1But5 && player1But6) == true ||
            (player1But7 && player1But8 && player1But9) == true ||
            (player1But1 && player1But4 && player1But7) == true ||
            (player1But2 && player1But5 && player1But8) == true ||
            (player1But3 && player1But6 && player1But9) == true ||
            (player1But1 && player1But5 && player1But9) == true ||
            (player1But7 && player1But5 && player1But3) == true) {
            playerMove.setText("Победил игрок 1(Крестик)!");
            scoreP1int++;
            scoreP1.setText(Integer.toString(scoreP1int));
            moves = 9;
            //winnerColor();
            buttonsOff();
            winCheckerAllFalse();
            //buttonTextCleaner();
            startBut.setText("Начать");
        } else if (
        //player 2
            (player2But1 && player2But2 && player2But3) == true ||
            (player2But4 && player2But5 && player2But6) == true ||
            (player2But7 && player2But8 && player2But9) == true ||
            (player2But1 && player2But4 && player2But7) == true ||
            (player2But2 && player2But5 && player2But8) == true ||
            (player2But3 && player2But6 && player2But9) == true ||
            (player2But1 && player2But5 && player2But9) == true ||
            (player2But7 && player2But5 && player2But3) == true) {
            playerMove.setText("Победил игрок 2(Нолик)!");
            scoreP2int++;
            scoreP2.setText(Integer.toString(scoreP2int));
            moves = 9;
            //winnerColor();
            buttonsOff();
            winCheckerAllFalse();
            //buttonTextCleaner();
            startBut.setText("Начать");
        } else if (moves == 0) {
            // Ничья
            playerMove.setText("Ничья");
            moves = 9;
            buttonsOff();
            winCheckerAllFalse();
            //buttonTextCleaner();
            startBut.setText("Начать");
        }
    }

    public void winCheckerAllFalse() {
        //1-й игрок
        player1But1 = false;
        player1But2 = false;
        player1But3 = false;
        player1But4 = false;
        player1But5 = false;
        player1But6 = false;
        player1But7 = false;
        player1But8 = false;
        player1But9 = false;
        //2-й игрок
        player2But1 = false;
        player2But2 = false;
        player2But3 = false;
        player2But4 = false;
        player2But5 = false;
        player2But6 = false;
        player2But7 = false;
        player2But8 = false;
        player2But9 = false;

    }

    public void ActualFiguresOnButtonsCleaner() {
        but1.setImageResource(android.R.color.transparent);
        but2.setImageResource(android.R.color.transparent);
        but3.setImageResource(android.R.color.transparent);
        but4.setImageResource(android.R.color.transparent);
        but5.setImageResource(android.R.color.transparent);
        but6.setImageResource(android.R.color.transparent);
        but7.setImageResource(android.R.color.transparent);
        but8.setImageResource(android.R.color.transparent);
        but9.setImageResource(android.R.color.transparent);
    }

    public void playerNowTextSwitcher() {
        if (playerNow == false) {
            playerMove.setText("Ходит игрок 1 (Крестик)");
        } else if (playerNow == true) {
            playerMove.setText("Ходит игрок 2 (Нолик)");
        }
    }

    public void winnerColor() {

        // С 1.3.1 - не используется
        // Кринжовая херь, лучше не смотреть

        if ((player1But1 && player1But2 && player1But3) == true ||
                (player2But1 && player2But2 && player2But3) == true) {
            but1.setBackgroundColor(getResources().getColor(R.color.green));
            but2.setBackgroundColor(getResources().getColor(R.color.green));
            but3.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But4 && player1But5 && player1But6) == true ||
                (player2But4 && player2But5 && player2But6) == true) {
            but4.setBackgroundColor(getResources().getColor(R.color.green));
            but5.setBackgroundColor(getResources().getColor(R.color.green));
            but6.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But7 && player1But8 && player1But9) == true ||
                (player2But7 && player2But8 && player2But9) == true) {
            but7.setBackgroundColor(getResources().getColor(R.color.green));
            but8.setBackgroundColor(getResources().getColor(R.color.green));
            but9.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But1 && player1But4 && player1But7) == true ||
                (player2But1 && player2But4 && player2But7) == true) {
            but1.setBackgroundColor(getResources().getColor(R.color.green));
            but4.setBackgroundColor(getResources().getColor(R.color.green));
            but7.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But2 && player1But5 && player1But8) == true ||
                (player2But2 && player2But5 && player2But8) == true) {
            but2.setBackgroundColor(getResources().getColor(R.color.green));
            but5.setBackgroundColor(getResources().getColor(R.color.green));
            but8.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But3 && player1But6 && player1But9) == true ||
                (player2But3 && player2But6 && player2But9) == true) {
            but3.setBackgroundColor(getResources().getColor(R.color.green));
            but6.setBackgroundColor(getResources().getColor(R.color.green));
            but9.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But1 && player1But5 && player1But9) == true ||
                (player2But1 && player2But5 && player2But9) == true) {
            but1.setBackgroundColor(getResources().getColor(R.color.green));
            but5.setBackgroundColor(getResources().getColor(R.color.green));
            but9.setBackgroundColor(getResources().getColor(R.color.green));
        } else if ((player1But7 && player1But5 && player1But3) == true ||
                (player2But7 && player2But5 && player2But3) == true) {
            but7.setBackgroundColor(getResources().getColor(R.color.green));
            but5.setBackgroundColor(getResources().getColor(R.color.green));
            but3.setBackgroundColor(getResources().getColor(R.color.green));
        }

    }

    public void colorCleaner() {
        // С 1.3.1 - не используется
        but1.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but2.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but3.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but4.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but5.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but6.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but7.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but8.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
        but9.setBackgroundColor(getResources().getColor(R.color.design_default_color_on_secondary));
    }

}