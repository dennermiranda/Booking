package com.example.summerproject;

import java.io.IOException;

import org.json.JSONException;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView time1, time2, time3, time4, an1, an2, an3, an4;
	FeedParser fp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fp = new FeedParser();
		Resultado aula1, aula2, aula3, aula4;
		aula1 = new Resultado("","1");
		aula2 = new Resultado("","2");
		aula3 = new Resultado("","3");
		aula4 = new Resultado("", "4");
		//passando do json q ele pega pra um objeto intermediario
		try {
			fp.parseJSON(aula1, 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fp.parseJSON(aula2, 2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fp.parseJSON(aula3, 3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fp.parseJSON(aula4, 4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//inicializando os nomes
		an1 = (TextView)findViewById(R.id.nome1);
		an2 = (TextView)findViewById(R.id.nome2);
		an3 = (TextView)findViewById(R.id.nome3);
		an4 = (TextView)findViewById(R.id.nome4);
		//atribuindo valores pra eles
		an1.setText(aula1.getNome());
		an2.setText(aula2.getNome());
		an3.setText(aula3.getNome());
		an4.setText(aula4.getNome());
		
		//fazendo a msm coisa pras horas
		time1 = (TextView)findViewById(R.id.hora1);
		time2 = (TextView)findViewById(R.id.hora2);
		time3 = (TextView)findViewById(R.id.hora3);
		time4 = (TextView)findViewById(R.id.hora4);
		//atribuindo valores pra eles
		time1.setText(aula1.getBeg()+":00 - 10:00");
		time2.setText(aula2.getBeg()+":00 - 11:00");
		time3.setText(aula3.getBeg()+":00 - 10:00");
		time4.setText(aula4.getBeg()+":00 - 11:00");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
