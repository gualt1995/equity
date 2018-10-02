# equity
Android game based on a LEF problem. 

## Introduction
Equity is an Android game designed to gather data on a local envy-free problem with indivisible goods. An example of the problem is described as follows; three gardeners have to accomplish three jobs: chop the tree, mow the lawn and trim the hedge. Each of the gardeners have preferences on which job they would like the most (eg 1: chop ≻ mow ≻ trim) as shown on the figure below. Our goal is to assign each gardener a job without him being jealous of one of his neighbours (gardener 1 can only be jealous of gardener 2).  

<p align="center">
  <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/garden.PNG" width="250" title="">
</p>


In this instance of the problem, allocating ‘chop the tree’ to agent 1, ‘mow the lawn’ to agent 2, and ‘trim the hedge’ to agent 3, we get an envy-free allocation.  
  
Equity replicates this problem and turns it into a game, where the task of the user is to solve each level and rate its difficulty. This data is then written over the internet in Google Sheets and used to analyze the difficulty of each instances of the problem.  


## Installation
The app was coded under Android Studio 3.0.1. The folder equity should be recognized as a standard Android Studio project and can be imported into the IDE. The app was tested with devices running android 5.0 to android 8.0. You should be able to run Equity either on an Android VM or to install it on one of your devices.


## Usage :
When the app is launched for the first time the user is asked to input their age and formation. This is done to correlate this data with the difficulty analysis of the level, however, these fields can be left blank if the users wish to keep this information private. The user can then select a level to be played.
  
<p align="center">
    <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205557.png" width="150" title="">
    <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205614.png" width="150" title="">   
    <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205631.png" width="150" title="">
</p>
  
To play a level the user has to select which ressource it assigns to each agent, the preferences of each agent are aligned in columns, the favorite being the top one. When the game detects a winning configuration (no agents are envious) the sessions ends and the rating popup is displayed. For more informations on how to play please check the tutorial in the app.  
<p align="center">
    <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205639.png" width="150" title="">
    <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205645.png" width="150" title="">
    <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205656.png" width="150" title="">
      <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205707.png" width="150" title="">
  <img src="https://raw.githubusercontent.com/gualt1995/equity/master/docs/Screens/Screenshot_20180518-205606.png" width="150" title="">
</p>
  
## Original project by : 
[Gualtiero Mottola](https://github.com/gualt1995)<br>
[Hans Thirunavukarasu](https://github.com/ThiruHans)<br>
[Alexandre Bontems](https://github.com/schonwetter)<br>
