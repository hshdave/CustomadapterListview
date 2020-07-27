package com.example.customadapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    ListView plistv;
    ListviewAdapter listviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plistv = findViewById(R.id.listview);

        String apiurl = getResources().getString(R.string.pokemonurl);

        listviewAdapter = new ListviewAdapter(MainActivity.this,getData(apiurl));

        plistv.setAdapter(listviewAdapter);


    }

    public ArrayList<Pokemon> getData(String url) {

        ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();

        try {
            String jsondata = new AsycData().execute(url).get();

            JSONObject mainobj = new JSONObject(jsondata);
            JSONArray pokemonArray = mainobj.getJSONArray("Pokemon");

            for (int i = 0; i < pokemonArray.length(); i++) {
                JSONObject childobj = pokemonArray.getJSONObject(i);

                String name = childobj.getString("name");
                String image = childobj.getString("image");
                String type = childobj.getString("type");
                String ability = childobj.getString("ability");
                String height = childobj.getString("height");
                String weight = childobj.getString("weight");
                String description = childobj.getString("description");

                pokemonArrayList.add(new Pokemon(name,image,type,ability,height,weight,description));

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        System.out.println("Size of Arraylist(Outside try) :"+pokemonArrayList.size());
        return  pokemonArrayList;
    }
}