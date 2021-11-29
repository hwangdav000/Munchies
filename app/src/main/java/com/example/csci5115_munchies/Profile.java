package com.example.csci5115_munchies;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private Button button;
    ListView listView;
    String[] mTitle = {"Batman bat", "Zuko zuk", "Karen Notareal"};
    String[] mDescription = {"ID: bruce3333", "ID: zuken222" ,"ID: kare155"};
    int[] images = {R.drawable.batman, R.drawable.zuko, R.drawable.fake_friend_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        button = (Button) findViewById(R.id.logout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLogin();
            }
        });

        button = (Button) findViewById(R.id.editName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editName();
            }
        });

        button = (Button) findViewById(R.id.addFriend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFriend();
            }
        });

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    Toast.makeText(Profile.this, "test", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 1) {
//                    Toast.makeText(Profile.this, "test1", Toast.LENGTH_SHORT).show();
//                }
//                if (position == 2) {
//                    Toast.makeText(Profile.this, "test2", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
        // implements navigation to different activities
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.top_navigation);
        bottomNavigationView.setSelectedItemId(R.id.profileIc);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.favoriteIc:
                startActivity(new Intent(this, FavoritePage.class));
                return true;

            case R.id.profileIc:
                startActivity(new Intent(this, Profile.class));
                return true;

            case R.id.foodIc:
                startActivity(new Intent(this, RecommendPage.class));
                return true;
        }
        return true;
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.row1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.rowImage);
            TextView myTitle = row.findViewById(R.id.row1);
            TextView myDescription = row.findViewById(R.id.row2);

            // now set resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }

    public void backLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void editName() {
        Intent intent = new Intent(this, EditName.class);
        startActivity(intent);
    }

    public void addFriend() {
        Intent intent = new Intent(this, AddFriend.class);
        startActivity(intent);
    }
}