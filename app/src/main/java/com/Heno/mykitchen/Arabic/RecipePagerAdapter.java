package com.Heno.mykitchen.Arabic;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class RecipePagerAdapter extends FragmentPagerAdapter {

    private int id;
    private String table;
    private int count;
    private Context context;

    public RecipePagerAdapter(FragmentManager fm, Context context, int id, String table) {
        super(fm);

        this.id = id;
        this.table = table;
        this.context = context;

        count = DatabaseHelper.getInstance(context).getCount(table);
    }

    @Override
    public Fragment getItem(int position) {

      return new RecipeFragment(context, position, table);

    }

    @Override
    public int getCount() {
        return count;
    }
}
