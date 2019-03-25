$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RestAssuredCapabilitiesGetAndPostOperation.feature");
formatter.feature({
  "line": 1,
  "name": "Performing GET and POST call",
  "description": "",
  "id": "performing-get-and-post-call",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validating the ability of rest assured to check the GET Call",
  "description": "",
  "id": "performing-get-and-post-call;validating-the-ability-of-rest-assured-to-check-the-get-call",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@ClientDemo"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User performs GET operation at \"https://reqres.in\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User should see status code \"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the name value \"Janet\" in the response",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in",
      "offset": 32
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.User_performs_GET_Operation_at(String)"
});
formatter.result({
  "duration": 1271807832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_should_see_status_code(int)"
});
formatter.result({
  "duration": 1359471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Janet",
      "offset": 25
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.Validate_the_name_value_in_the_response(String)"
});
formatter.result({
  "duration": 7412271,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Validating the ability of rest assured to check the POST Call",
  "description": "",
  "id": "performing-get-and-post-call;validating-the-ability-of-rest-assured-to-check-the-post-call",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@ClientDemo"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User creates new request using \"\u003cName\u003e\" and \"\u003cJob\u003e\" and performs post operation at \"https://reqres.in\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User should get status code \"201\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Validate the job value \"Leader\" in the response",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "performing-get-and-post-call;validating-the-ability-of-rest-assured-to-check-the-post-call;",
  "rows": [
    {
      "cells": [
        "Name",
        "Job"
      ],
      "line": 18,
      "id": "performing-get-and-post-call;validating-the-ability-of-rest-assured-to-check-the-post-call;;1"
    },
    {
      "cells": [
        "Austin",
        "Leader"
      ],
      "line": 19,
      "id": "performing-get-and-post-call;validating-the-ability-of-rest-assured-to-check-the-post-call;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Validating the ability of rest assured to check the POST Call",
  "description": "",
  "id": "performing-get-and-post-call;validating-the-ability-of-rest-assured-to-check-the-post-call;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@ClientDemo"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User creates new request using \"Austin\" and \"Leader\" and performs post operation at \"https://reqres.in\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User should get status code \"201\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Validate the job value \"Leader\" in the response",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Austin",
      "offset": 32
    },
    {
      "val": "Leader",
      "offset": 45
    },
    {
      "val": "https://reqres.in",
      "offset": 85
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_creates_new_request_using_and_performs_post_operation_at(String,String,String)"
});
formatter.result({
  "duration": 496512378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 29
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_should_get_status_code(int)"
});
formatter.result({
  "duration": 153734,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leader",
      "offset": 24
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.Validate_the_Job_value_in_the_response(String)"
});
formatter.result({
  "duration": 322389,
  "status": "passed"
});
formatter.uri("RestAssuredCapabilitiesPutAndPatchOperation.feature");
formatter.feature({
  "line": 1,
  "name": "Performing PUT and PATCH call",
  "description": "",
  "id": "performing-put-and-patch-call",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validating the ability of rest assured to check the PUT Call",
  "description": "",
  "id": "performing-put-and-patch-call;validating-the-ability-of-rest-assured-to-check-the-put-call",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@ClientDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User creates update request using \"\u003cName\u003e\" and \"\u003cJob\u003e\" and performs put operation at \"https://reqres.in\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should get status code \"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Validate the job value \"Developer\" in the response",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "performing-put-and-patch-call;validating-the-ability-of-rest-assured-to-check-the-put-call;",
  "rows": [
    {
      "cells": [
        "Name",
        "Job"
      ],
      "line": 10,
      "id": "performing-put-and-patch-call;validating-the-ability-of-rest-assured-to-check-the-put-call;;1"
    },
    {
      "cells": [
        "Austin",
        "Developer"
      ],
      "line": 11,
      "id": "performing-put-and-patch-call;validating-the-ability-of-rest-assured-to-check-the-put-call;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Validating the ability of rest assured to check the PUT Call",
  "description": "",
  "id": "performing-put-and-patch-call;validating-the-ability-of-rest-assured-to-check-the-put-call;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@ClientDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User creates update request using \"Austin\" and \"Developer\" and performs put operation at \"https://reqres.in\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should get status code \"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Validate the job value \"Developer\" in the response",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Austin",
      "offset": 35
    },
    {
      "val": "Developer",
      "offset": 48
    },
    {
      "val": "https://reqres.in",
      "offset": 90
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_creates_update_request_using_and_and_performs_put_operation_at(String,String,String)"
});
formatter.result({
  "duration": 492816146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_should_get_status_code(int)"
});
formatter.result({
  "duration": 208559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Developer",
      "offset": 24
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.Validate_the_Job_value_in_the_response(String)"
});
formatter.result({
  "duration": 569742,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validating the ability of rest assured to check the PATCH Call",
  "description": "",
  "id": "performing-put-and-patch-call;validating-the-ability-of-rest-assured-to-check-the-patch-call",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@ClientDemo"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User performs PATCH operation at \"https://reqres.in\" and updates data through csv \"TestData//testdata.csv\"",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User should see status code \"200\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Validate the name value \"AryaStark\" in the response",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in",
      "offset": 34
    },
    {
      "val": "TestData//testdata.csv",
      "offset": 83
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_performs_PATCH_operation_at_and_updates_data_through_csv(String,String)"
});
formatter.result({
  "duration": 504999695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.user_should_see_status_code(int)"
});
formatter.result({
  "duration": 155206,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AryaStark",
      "offset": 25
    }
  ],
  "location": "StepDefinitionRestCapabilityV2.Validate_the_name_value_in_the_response(String)"
});
formatter.result({
  "duration": 547015,
  "status": "passed"
});
});