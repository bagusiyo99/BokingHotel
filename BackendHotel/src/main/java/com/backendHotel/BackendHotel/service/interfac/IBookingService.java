package com.backendHotel.BackendHotel.service.interfac;


import com.backendHotel.BackendHotel.dto.Response;
import com.backendHotel.BackendHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
