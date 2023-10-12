package springjwt.service;

import springjwt.model.DTOs.AuthenticationRequest;
import springjwt.model.DTOs.AuthenticationResponse;
import springjwt.model.DTOs.RegisterRequest;

public interface AuthenticationService {
     AuthenticationResponse register(RegisterRequest request);

     AuthenticationResponse authenticate(AuthenticationRequest request);
}
