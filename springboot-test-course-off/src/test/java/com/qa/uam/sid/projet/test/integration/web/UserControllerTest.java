package com.qa.uam.sid.projet.test.integration.web;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType; 
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.uam.sid.projet.test.integration.model.User;
import com.qa.uam.sid.projet.test.integration.service.impl.UserServiceImpl;

//@SpringBootTest
@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UserServiceImpl service;
 
    User user;

    List<User> users;

    @BeforeEach
    void setUp() {
        user =  new User(1L, "ngom", "bass", 69,true);
        users = List.of(
                new User(1L, "ngom", "bass", 69,true),
                new User(2L, "Diop", "Fatou", 9,true),
                new User(3L, "FAll", "Alioune", 6,true)
        );
    }

    @Test
    void shouldReturnOneUserViaController() throws Exception {
        when(service.findUserById(1L)).thenReturn(Optional.ofNullable(user));

        mockMvc
                .perform(get("/test/integrations/v1/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nom").value("ngom"));
    }




    

    @Test
    void shouldReturnAllUsersViaController() throws Exception {
        when(service.getAllUsers()).thenReturn(users);

        mockMvc
                .perform(get("/test/integrations/v1/users"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nom").value("ngom"));
    }

    @Test
    void shouldDeleteUserViaController() throws Exception {
        doNothing().when(service).deletUser(1L);

        mockMvc.perform(delete("/test/integrations/v1/users/1"))
                .andExpect(status().isOk());
    }

    @Test
    void shouldEditUserViaController() throws Exception {

        doNothing().when(service).modifierUser(user);

        mockMvc.perform(put("/test/integrations/v1/users")
                .contentType("application/json")
                .content("""
                        {
                            "id": 1,
                            "nom": "ngom",
                            "prenom": "bass",
                            "age": 69,
                            "active": true
                        }
                    """))
                .andExpect(status().isOk());
    }

    @Test
    void shouldCreateUserViaController() throws Exception {

        doNothing().when(service).createUser(user);


        mockMvc.perform(post("/test/integrations/v1/users")
                .contentType("application/json")
                .content("""
                        {
                            "id": 1,
                            "nom": "ngom",
                            "prenom": "bass",
                            "age": 69,
                            "active": true
                        }
                    """))
                .andExpect(status().isOk());
    }
}