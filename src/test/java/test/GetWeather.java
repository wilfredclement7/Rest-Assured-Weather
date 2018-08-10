package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetWeather {

	@Test(priority=0)
	public void getWeatherInfoForBangalore()
	{
		String response = RestAssured.baseURI="http://api.openweathermap.org/data/2.5/weather";
		RestAssured.given().param("q", "Bangalore").param("appid", "fe1f898a58b123699113788e278bca01").
		when().get().then().extract().asString();
		System.out.println("Response is : " +response);
	}
}