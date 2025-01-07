package com.backendHotel.BackendHotel.service.interfac;


import com.backendHotel.BackendHotel.dto.LoginRequest;
import com.backendHotel.BackendHotel.dto.Response;
import com.backendHotel.BackendHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
