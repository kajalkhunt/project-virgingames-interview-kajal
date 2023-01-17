$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LiveCasio.feature");
formatter.feature({
  "line": 2,
  "name": "Live Casino",
  "description": "As a user I want to click on Live Casino tab",
  "id": "live-casino",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5983242500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As a user I want to click on live casino tab",
  "description": "",
  "id": "live-casino;as-a-user-i-want-to-click-on-live-casino-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Virgin games homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am clicking on live casino tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on live casino page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify the text \"Live Blackjack Games\"",
  "keyword": "And "
});
formatter.match({
  "location": "LiveCasinoSteps.iAmOnVirginGamesHomepage()"
});
formatter.result({
  "duration": 176586600,
  "status": "passed"
});
formatter.match({
  "location": "LiveCasinoSteps.iAmClickingOnLiveCasinoTab()"
});
formatter.result({
  "duration": 184941800,
  "status": "passed"
});
formatter.match({
  "location": "LiveCasinoSteps.iAmOnLiveCasinoPage()"
});
formatter.result({
  "duration": 131180800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Live Blackjack Games",
      "offset": 19
    }
  ],
  "location": "LiveCasinoSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 926913100,
  "status": "passed"
});
formatter.after({
  "duration": 790370000,
  "status": "passed"
});
});