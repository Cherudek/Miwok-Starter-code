package com.example.android.miwok;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest2() {
        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.searchMusic), withText("Search Music")));
        appCompatTextView.perform(scrollTo(), click());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.searchHome), isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatTextView2 = onView(
                allOf(withId(R.id.myLibrary), withText("My Library")));
        appCompatTextView2.perform(scrollTo(), click());

        ViewInteraction appCompatImageView2 = onView(
                withId(R.id.myLibraryHome));
        appCompatImageView2.perform(scrollTo(), click());

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(R.id.nowPlaying), withText("Now Playing")));
        appCompatTextView3.perform(scrollTo(), click());

        ViewInteraction appCompatImageView3 = onView(
                allOf(withId(R.id.playingSearchIcon), isDisplayed()));
        appCompatImageView3.perform(click());

        ViewInteraction appCompatImageView4 = onView(
                allOf(withId(R.id.searchMyLibrary), isDisplayed()));
        appCompatImageView4.perform(click());

        ViewInteraction appCompatImageView5 = onView(
                allOf(withId(R.id.searchFavourites), isDisplayed()));
        appCompatImageView5.perform(click());

        ViewInteraction appCompatImageView6 = onView(
                allOf(withId(R.id.favouritesLibrary), isDisplayed()));
        appCompatImageView6.perform(click());

        ViewInteraction appCompatImageView7 = onView(
                withId(R.id.myLibraryHome));
        appCompatImageView7.perform(scrollTo(), click());

        ViewInteraction appCompatTextView4 = onView(
                allOf(withId(R.id.myFavourites), withText("Favourites")));
        appCompatTextView4.perform(scrollTo(), click());

        ViewInteraction appCompatImageView8 = onView(
                allOf(withId(R.id.favouritesLibrary), isDisplayed()));
        appCompatImageView8.perform(click());

        ViewInteraction appCompatImageView9 = onView(
                withId(R.id.myLibrarySearch));
        appCompatImageView9.perform(scrollTo(), click());

    }

}
