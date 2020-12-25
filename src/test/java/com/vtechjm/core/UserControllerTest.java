package com.vtechjm.core;

import com.vtechjm.core.services.IUserService;
import com.vtechjm.core.services.models.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private IUserService userServiceMock;
    @Test
    public void itShouldReturnAUser() throws Exception {
        //Arrange
        User mockUser = new User();
        mockUser.setCity("Santa Cruz");
        mockUser.setName("John Doe");
        Mockito.when(userServiceMock.getUser()).thenReturn(mockUser);
        //Act
        mvc.perform(get("/api/Users/user").contentType(MediaType.APPLICATION_JSON))
                .andExpect(
                        status().isOk()
                ).andExpect(
                jsonPath("$.name").value("John Doe")

        ).andExpect(
                jsonPath("$.city").value("Santa Cruz"));

    }
}
