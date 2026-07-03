package com.google.samples.apps.nowinandroid.Generator

import androidx.benchmark.macro.BaselineProfileMode
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.ExperimentalMetricApi
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.MemoryUsageMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.StartupTimingMetric
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@OptIn(ExperimentalMetricApi::class)
@RunWith(AndroidJUnit4::class)
class GeneratedOpenArticle {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun OpenArticle() = benchmarkRule.measureRepeated(
        packageName = "org.wikipedia",
        metrics = listOf(MemoryUsageMetric(MemoryUsageMetric.Mode.Max), FrameTimingMetric()),
        startupMode = StartupMode.WARM,
        compilationMode = CompilationMode.Partial(
            baselineProfileMode = BaselineProfileMode.Disable,
            warmupIterations = 3,
        ),
        iterations = 10,
        setupBlock = {
            pressHome()
            startActivityAndWait()
            device.waitForIdle()
            device.wait(Until.hasObject(By.pkg("org.wikipedia").depth(0)), 5000L)
        },
    ) {
        /*
          explain: I need to open the Wikipedia app to begin the task of searching for and opening an article.
          summary: The task is to open Wikipedia, search for an article, and then open it. The first step is to launch the Wikipedia application.
         */
        // ACTION: AWAKE

        /*
          explain: I need to click the forward arrow to move past this welcome screen and access the app's main features for searching articles.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am now navigating through its initial welcome screen.
         */
        device.click(((938.0f / 1000.0f) * device.displayWidth).toInt(), ((950.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to click the forward arrow at the bottom right to continue through the app's initial setup screens and reach the main interface for searching articles.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app but am currently stuck on a 'Data & Privacy' screen that requires navigation through initial setup steps.
         */
        device.click(((938.0f / 1000.0f) * device.displayWidth).toInt(), ((951.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I am clicking the 'next' arrow in the bottom right corner because it is the only way forward from this setup screen and my previous attempt did not register.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app but am currently stuck on a language selection screen that requires navigation through initial setup steps.
         */
        device.click(((938.0f / 1000.0f) * device.displayWidth).toInt(), ((951.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to click the 'Skip' button to bypass this initial setup screen and access the app's main functionality for searching articles.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app but am currently stuck on a language selection screen that requires navigation through initial setup steps.
         */
        device.click(((938.0f / 1000.0f) * device.displayWidth).toInt(), ((951.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to get past this setup screen to access the search functionality. Clicking 'Skip' is the quickest way to bypass these initial steps and proceed with my task.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app but am currently stuck on a language selection screen that requires navigation through initial setup steps.
         */
        device.click(((70.0f / 1000.0f) * device.displayWidth).toInt(), ((952.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to click the 'Search' button in the bottom navigation bar to access the search functionality and find an article.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am now on its main page. The next step is to initiate a search.
         */
        device.click(((500.0f / 1000.0f) * device.displayWidth).toInt(), ((927.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to close this pop-up window to access the main search interface and continue with the article search.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app but am now blocked by a pop-up dialog that needs to be dismissed before proceeding.
         */
        device.click(((926.0f / 1000.0f) * device.displayWidth).toInt(), ((587.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to type a search query into the search bar to find an article and continue with the task.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am now on the search page. The next step is to perform a search.
         */
        device.executeShellCommand("input text Apple")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to enter a search term into the search bar to find an article.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am now on the search page. The next step is to perform a search by typing in the search bar.
         */
        device.executeShellCommand("input text Apple")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to enter a search term into the search bar to find an article.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am on the search page. The next step is to perform a search by typing in the search bar.
         */
        device.executeShellCommand("input text Apple")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to enter a search term into the search bar to find an article. Since no specific topic was given, I will use 'Apple' as a sample query.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am on the search page. The next step is to perform a search by typing in the search bar.
         */
        device.executeShellCommand("input text Apple")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to type a search query into the search bar to find an article and continue with the task.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am on the search page. The next step is to perform a search by typing in the search bar.
         */
        device.executeShellCommand("input text Artificial%sIntelligence")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to click the search bar to activate it before I can type in a search term.
          summary: The task is to open Wikipedia, search for an article, and then open it. I have successfully opened the app and am on the main screen. The next step is to initiate a search by clicking the search bar.
         */
        device.click(((498.0f / 1000.0f) * device.displayWidth).toInt(), ((147.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to ask you which article you want to search for, as the task instructions don't specify a particular topic.
          summary: The task is to open Wikipedia and find an article. The app has been opened successfully, and the search interface is now active. The next step is to determine what article to search for.
         */
        // ACTION: INFO

        /*
          explain: I need to enter the article title provided by the user, 'Artificial Intelligence', into the search bar to find the relevant article.
          summary: The task is to open Wikipedia and find an article. The app has been opened successfully, and I am now typing the article title 'Artificial Intelligence' into the search bar.
         */
        device.executeShellCommand("input text Artificial%sIntelligence")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to complete the article title in the search bar so that I can select it from the results and open the correct article.
          summary: The task is to find an article on Wikipedia. The app is open, but my previous attempt to type 'Artificial Intelligence' was incomplete. I am now completing the search term.
         */
        device.executeShellCommand("input text intelligence")
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to select an article from the search results to open its page and complete the task.
          summary: The task is to find and open a Wikipedia article. I have successfully searched for 'Artificialintelligence' and am now selecting the first result from the list.
         */
        device.click(((238.0f / 1000.0f) * device.displayWidth).toInt(), ((150.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to close the promotional pop-up that's blocking the article so I can read its contents.
          summary: The task is to find and open a Wikipedia article. I have successfully opened the 'Artificial intelligence' article, but a promotional pop-up has appeared. The next step is to close this pop-up.
         */
        device.click(((843.0f / 1000.0f) * device.displayWidth).toInt(), ((342.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

        /*
          explain: I need to click the 'Got it' button to dismiss the toolbar customization prompt so I can continue reading the article.
          summary: The task is to find and open a Wikipedia article. I have successfully opened the 'Artificial intelligence' article, but a promotional pop-up has appeared. The next step is to close this pop-up.
         */
        device.click(((625.0f / 1000.0f) * device.displayWidth).toInt(), ((197.0f / 1000.0f) * device.displayHeight).toInt())
        device.waitForIdle()
        Thread.sleep(1000L)

    }
}
