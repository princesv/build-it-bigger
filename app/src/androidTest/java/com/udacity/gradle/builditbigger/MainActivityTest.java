package com.udacity.gradle.builditbigger;

import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.ViewAssertion;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.instanceOf;

import androidx.test.espresso.Espresso;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;


public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private IdlingResource mIdlingResource;

    @Before
    public void registerIdlingResource(){
        mIdlingResource = mActivityTestRule.getActivity().getIdlingResource();
      //  Espresso.registerIdlingResources(mIdlingResource);
        IdlingRegistry.getInstance().register(mIdlingResource);
    }


    @Test
    public void clickGridViewItem_OpensOrderActivity() {


       // onData(anything()).inAdapterView(withId(R.id.recipe_grid_recycler_view)).atPosition(1).perform(click());
        onView(withId(R.id.joke_button)).perform(click());
        onView(withId(R.id.joke_view)).check(matches(withText("Why do scientists not trust atoms? Because they make up everything!")));



    }
    @After
    public void unregisterIdlingResource(){
        if(mIdlingResource != null){
           // Espresso.unregisterIdlingResources(mIdlingResource);
            IdlingRegistry.getInstance().unregister(mIdlingResource);
        }
    }
}
