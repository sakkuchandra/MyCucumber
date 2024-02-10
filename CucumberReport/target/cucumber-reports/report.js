$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/FlightBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Book Flight and Hotel for Vacation",
  "description": "",
  "id": "book-flight-and-hotel-for-vacation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Book Flight for one way trip",
  "description": "",
  "id": "book-flight-and-hotel-for-vacation;book-flight-for-one-way-trip",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@BookOneWayFlight"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I live in Dublin with 2 adults and 2 kids",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I want to book one way flight ticket from Dublin to London on 22nd Jan 2020",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search online",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "TripAdvisor should provide me options of flights on 22nd Jan 2020",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Cost of my flight should not be more than 50 Euro per person",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Tickets should be refundable",
  "keyword": "And "
});
formatter.match({
  "location": "MyHolidayDefinitions.needFlight()"
});
formatter.result({
  "duration": 612944700,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.ticketType()"
});
formatter.result({
  "duration": 285000,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.onlineSearch()"
});
formatter.result({
  "duration": 248400,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.searchFlightInTripAdvisor()"
});
formatter.result({
  "duration": 325700,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.flightFare()"
});
formatter.result({
  "duration": 280000,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.refunableTicket()"
});
formatter.result({
  "duration": 283100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Book Hotel for one the trip",
  "description": "",
  "id": "book-flight-and-hotel-for-vacation;book-hotel-for-one-the-trip",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I need 1 room with 2 double beds",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I want to book hotel from 22nd Jan 2020 to 25th Jan 2020",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I search online",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "TripAdvisor should provide me options of hotels for time period of 22nd Jan 2020 to 25th Jan 2020",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Fare of my room should not be more than 200 Euro per night",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Breakfast should be included in the room fare",
  "keyword": "And "
});
formatter.match({
  "location": "MyHolidayDefinitions.needRoom()"
});
formatter.result({
  "duration": 436500,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.stayDuration()"
});
formatter.result({
  "duration": 303600,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.onlineSearch()"
});
formatter.result({
  "duration": 242200,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.searchRoomInTripAdvisor()"
});
formatter.result({
  "duration": 11243800,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.roomFare()"
});
formatter.result({
  "duration": 1148800,
  "status": "passed"
});
formatter.match({
  "location": "MyHolidayDefinitions.includeBreakfast()"
});
formatter.result({
  "duration": 4269100,
  "status": "passed"
});
});