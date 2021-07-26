package com.sapient.ofd.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.sapient.ofd.app.SpringDataJpaOfdApplication;
import com.sapient.ofd.dao.OnlineFoodDelivaryRepository;
import com.sapient.ofd.entity.Restaurant;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SpringDataJpaOfdApplication.class)
@AutoConfigureMockMvc 
@AutoConfigureTestDatabase(replace=Replace.NONE)

class OfdControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private OnlineFoodDelivaryRepository repository;

//    @Test
//	public void whenValidInput_thenCreateRestaurant() throws IOException, Exception {
//		Restaurant restaurant= new Restaurant(null,"Madhuban","Itialin",LocalTime.of(10, 30, 0),
//												LocalTime.of(21,0,0),LocalDate.of(2016,1,5),
//												2,"Coimbatore",7896548321L);
//		mvc.perform(post("/ofd/v1/restaurant").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(restaurant)));
//		List<Restaurant> found = repository.findAll();
//
//		assertThat(found).extracting(Restaurant::getRestaurantName).contains("Madhuban");
//	}


}
